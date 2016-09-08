/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app.controller;

import java.util.HashSet;
import javax.validation.Valid;
import org.app.model.Cart;
import org.app.model.EditProfile;
import org.app.model.Person;
import org.app.model.ProductInCart;
import org.app.model.Purchase;
import org.app.service.CartService;
import org.app.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Joanna667
 */
@Controller
public class UserController{

    private UserService userService;
    private CartService cartService;
    @Qualifier(value="userService")
    public void setUserService(UserService s){
        this.userService = s;
    }
    @Qualifier(value="cartService")
    public void setCartService(CartService cs){
        this.cartService = cs;
    }
    @RequestMapping("/user/login")
    public String login(Model model){
        return "login";
    }
    
    @RequestMapping("/user/cart/{name}")
    public String viewCart(@PathVariable("name") String username, Model model){
        //koszyk aktualnie zalogowanego użytkownika
        Person user = this.userService.getUser(username);
        Cart cart = user.getCart();
        model.addAttribute("cart", cart);
        return "cart";
    }
    @RequestMapping("/user/profile/{name}")
    public String viewProfile(@PathVariable("name") String username, Model model){
        //profil aktualnie zalogowanego użytkownika
        Person user = this.userService.getUser(username);
        if(user!=null){
        model.addAttribute("user", user);
             return "profile";
        }
        else
           return "redirect:/";
    }
    @RequestMapping("/user/register")
    public String addAccount(Model model){
        Person p = new Person();
        model.addAttribute("user", p);
        return "register";
    }
    
    @RequestMapping(value= "/user/register", method = RequestMethod.POST)
    public String addAccount(@Valid @ModelAttribute("user") Person p, BindingResult result, Model model){         
        Person person = this.userService.getUser(p.getNick());
        if(null!=person)
            result.rejectValue("nick", "error.user", "Użytkownik o takiej nazwie już istnieje");
        if(result.hasErrors()){
            model.addAttribute("user", p);
            return "register";
        }
        Cart c = new Cart();
        c.setProducts(new HashSet<ProductInCart>(){});
        c.setCost(0.0);
        p.setCart(c);
        p.setPurchases(new HashSet<Purchase>(){});
        if(userService.getAllUsers().isEmpty())
            p.setRights("shopassistant");
        else
            p.setRights("customer");
        this.cartService.add(p.getCart());
        this.userService.add(p);
        return "redirect:/";
         
    }
    
    @RequestMapping("/user/edit/{name}")
    public String editAccount(@PathVariable("name") String name, Model model){
        Person p = this.userService.getUser(name);
        EditProfile edit_model = new EditProfile();
        edit_model.setFirstN(p.getFirstN());
        edit_model.setLastN(p.getLastN());
        edit_model.setNick(name);
        edit_model.setEmail(p.getEmail());
        edit_model.setPass(p.getPass());
        edit_model.setAddress(p.getAddress());
        edit_model.setZipCode(p.getZipCode());
        edit_model.setCity(p.getCity());
        edit_model.setCountry(p.getCountry());
        edit_model.setSt(p.getSt());
        model.addAttribute("user", edit_model);
        return "editprofile";
    }
    
    @RequestMapping(value= "/user/edit", method = RequestMethod.POST)
    public String editAccount(@Valid @ModelAttribute("user") EditProfile edit_model, BindingResult result, Model model){         
        Person p = this.userService.getUser(edit_model.getNick());
        if(result.hasErrors()){
            model.addAttribute("user", edit_model);
            return "editprofile";
        }
        if(p.getCart()==null){
            Cart c = new Cart();
            c.setProducts(new HashSet<ProductInCart>(){});
            c.setCost(0.0);
            p.setCart(c);
            this.cartService.add(c);
            
        }
        if(!edit_model.getFirstN().equals(p.getFirstN()))
            p.setFirstN(edit_model.getFirstN());
        if(!edit_model.getLastN().equals(p.getLastN()))
            p.setLastN(edit_model.getLastN());
        if(!edit_model.getEmail().equals(p.getEmail()))
            p.setEmail(edit_model.getEmail());
        if(!edit_model.getPass().equals(p.getPass()))
            p.setPass(edit_model.getPass());
        if(!edit_model.getAddress().equals(p.getAddress()))
            p.setAddress(edit_model.getAddress());
        if(!edit_model.getZipCode().equals(p.getZipCode()))
            p.setZipCode(edit_model.getZipCode());
        if(!edit_model.getCity().equals(p.getCity()))
            p.setCity(edit_model.getCity());
        if(!edit_model.getSt().equals(p.getSt()))
            p.setSt(edit_model.getSt());
        if(!edit_model.getCountry().equals(p.getCountry()))
            p.setCountry(edit_model.getCountry());
        this.userService.update(p);
        return "redirect:/";
         
    }
    
}
