/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.app.model.Cart;
import org.app.model.Person;
import org.app.model.ProductInCart;
import org.app.model.Purchase;
import org.app.model.Transport;
import org.app.service.CartService;
import org.app.service.PurchaseService;
import org.app.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Joanna667
 */
@Controller
public class PurchaseController{
    private PurchaseService purchaseService;
    @Qualifier(value="purchaseService")
    public void setPurchaseService(PurchaseService ps){
        this.purchaseService = ps;
    }
    
    private CartService cartService;
    @Qualifier(value="cartService")
    public void setCartService(CartService cs){
        this.cartService = cs;
    }
    
    private UserService userService;
    @Qualifier(value="userService")
    public void setUserService(UserService s){
        this.userService = s;
    }
    
    @RequestMapping("/purchase/history/{name}")
    public String viewHistory(@PathVariable("name") String username, Model model){
        model.addAttribute("userHistory", this.purchaseService.getPurchases(username));
        model.addAttribute("name", username);
        return "history";
    }
    
    @RequestMapping("/purchases/new")
    public String viewNewPurchases(Model model){
        model.addAttribute("purchases", this.purchaseService.getPurchases());

        return "newpurchases";
    }
    
    @RequestMapping(value="/purchases/process", method = RequestMethod.POST)
    public String processPurchase(@RequestParam("id") int id, Model model){
        Purchase p = purchaseService.getPurchase(id);
        p.setStage("Zamówienie zrealizowane");
        this.purchaseService.update(p);
        model.addAttribute("purchases", this.purchaseService.getPurchases());

        return "newpurchases";
    }
    
    @RequestMapping("/purchase/create/{id}")
    public String checkout(@PathVariable("id") int id, Model model){
        Cart c = cartService.getCart(id);
        if(c.getCost()==0.0){
            model.addAttribute("message", "Koszyk jest pusty");
            return "error";
        }
        Purchase p = new Purchase();
        p.setProducts(c.getProducts());
        p.setNettocost(c.getCost());
        p.setBruttocost(c.getCost());
        p.setStage("Zamówienie w trakcie tworzenia");
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date = new Date();
	p.setPurchaseDt(dateFormat.format(date));
        p.setTransport(Transport.none.getValue());
        model.addAttribute("purchase", p);
        model.addAttribute("transportOptions", Transport.values());
        return "checkout";
    }
    
    @RequestMapping(value= "/purchase/create", params="dalej", method = RequestMethod.POST)
    public String checkout(@ModelAttribute("purchase") Purchase p, Model model){         
        p.setStage("Zamówienie utworzone");
        p.setTransport(p.getTransport());
        p.setNettocost(p.getNettocost());
        p.setBruttocost(p.getNettocost()+p.getTransport());
        p.setPurchaseDt(p.getPurchaseDt());
        model.addAttribute("purchase", p);
        return "purchaseconfirm";
         
    }

    @RequestMapping(value= "/purchase/confirm", params="dalej", method = RequestMethod.POST)
    public String confirm(@ModelAttribute("purchase") Purchase p, Model model){         
        p.setStage("Zamówienie w trakcie realizacji");
        
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        Person user = this.userService.getUser(username);
        p.setCustomer(user);
        p.setProducts(user.getCart().getProducts());
        Set<Purchase> ps = user.getPurchases();
        ps.add(p);
        user.setPurchases(ps);
        Cart c = user.getCart();
        c.setProducts(new HashSet<ProductInCart>(){});
        c.setCost(0.0);
        this.purchaseService.add(p);
        this.cartService.update(c);
        this.userService.update(user);
        
        model.addAttribute("message", "Zamówienie w trakcie realizacji");
       
        return "done";
         
    }
    
    @RequestMapping(value= "/purchase/confirm", params="anuluj", method = RequestMethod.POST)
    public String cancel(@ModelAttribute("purchase") Purchase p, Model model){         
        //anulowane zamówienia także są zapisywane w bazie
        p.setStage("Zamówienie anulowane");
         String username = SecurityContextHolder.getContext().getAuthentication().getName();
        Person user = this.userService.getUser(username);
        p.setCustomer(user);
        p.setProducts(user.getCart().getProducts());
        Set<Purchase> ps = user.getPurchases();
        ps.add(p);
        user.setPurchases(ps);
        Cart c = user.getCart();
        c.setProducts(new HashSet<ProductInCart>(){});
        c.setCost(0.0);
        this.purchaseService.add(p);
        this.cartService.update(c);
        this.userService.update(user);
        model.addAttribute("message", "Zamówienie zostało anulowane");
        return "redirect:/";
    }
@RequestMapping(value= "/purchase/create", params="anuluj", method = RequestMethod.POST)
    public String backtoshopping(Model model){         
        return "redirect:/";
         
    }    
    
        
}
