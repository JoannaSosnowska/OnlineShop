/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.app.model.AddOrEditProduct;
import org.app.model.AddToCart;
import org.app.model.Cart;
import org.app.model.Category;
import org.app.model.Person;
import org.app.model.Product;
import org.app.model.ProductInCart;
import org.app.service.CartService;
import org.app.service.CategoryService;
import org.app.service.ProductService;
import org.app.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
/**
 *
 * @author Joanna667
 */
@Controller
public class ProductController{
    private ProductService productService;
    @Qualifier(value="productService")
    public void setProductService(ProductService ps){
        this.productService = ps;
    }
    private CategoryService categoryService;
    @Qualifier(value="categoryService")
    public void setCategoryService(CategoryService cs){
        this.categoryService = cs;
    }
    
    private UserService userService;
    @Qualifier(value="userService")
    public void setUserService(UserService s){
        this.userService = s;
    }
    
    private CartService cartService;
    @Qualifier(value="cartService")
    public void setCartService(CartService cs){
        this.cartService = cs;
    }
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String listProducts(Model model) {
        model.addAttribute("products", this.productService.getAllProducts());
        return "index";
    }
    @RequestMapping(value = "/product/details/{id}", method = RequestMethod.GET)
    public String productDetails(@PathVariable("id") int id, Model model) {
        model.addAttribute("product", this.productService.getProduct(id));
        AddToCart viewmodel = new AddToCart();
        viewmodel.setId(id);
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        viewmodel.setUsername(username);
        viewmodel.setQuantity(1);
        model.addAttribute("cartModel", viewmodel);
        return "productdetails";
    }
    @RequestMapping("/product/add")
    public String addProduct(Model model){       
        AddOrEditProduct viewmodel = new AddOrEditProduct();
        List<Category> cats = categoryService.getAllCategories();
        Map<String, String> cat_names=CatNames();
        viewmodel.setCategoryName(cats.get(0).getTitle());
        model.addAttribute("categories", cat_names);
        model.addAttribute("product", viewmodel);
        return "addproduct";
    }
    @RequestMapping(value= "/product/add", method = RequestMethod.POST)
    public String addProduct(@Valid @ModelAttribute("product") AddOrEditProduct p_model, BindingResult result, Model model, HttpServletRequest request){
        if(result.hasErrors()){
            Map<String, String> cat_names=CatNames();
            p_model.setCategories(cat_names);
            p_model.setCategoryName(p_model.getCategoryName());
            model.addAttribute("categories", cat_names);
            model.addAttribute("product", p_model);
            return "addproduct";
        }
        Product p = new Product();
        p.setDescription(p_model.getDescription());
        p.setUnit(p_model.getUnit());
        p.setUnitPrice(p_model.getUnitPrice());
        p.setTitle(p_model.getTitle());   
        
        Category c = categoryService.getCategory(p_model.getCategoryName());
        p.setCategory(c);
        c.getProducts().add(p);
        
        String path  = request.getSession().getServletContext().getRealPath("/WEB-INF/images");
        p.setImageP(path + File.separator+"image_default.png");       
        this.productService.add(p);   
        
        return "redirect:/";
         
    }
    @RequestMapping("/product/edit/{id}")
    public String editProduct(@PathVariable("id") int id, Model model){
        Product p = this.productService.getProduct(id);
        AddOrEditProduct viewmodel = new AddOrEditProduct();
        Map<String, String> cat_names = CatNames();
        viewmodel.setCategories(cat_names);
        viewmodel.setCategoryName(p.getCategory().getTitle());
        viewmodel.setTitle(p.getTitle());
        viewmodel.setDescription(p.getDescription());
        viewmodel.setUnit(p.getUnit());
        viewmodel.setUnitPrice(p.getUnitPrice());
        viewmodel.setId(p.getId());
        model.addAttribute("categories", cat_names);
        model.addAttribute("product", viewmodel);
        return "editproduct";
    }
    @RequestMapping(value= "/product/edit", method = RequestMethod.POST)
    public String editProduct(@Valid @ModelAttribute("product") AddOrEditProduct p_model, BindingResult result, Model model, HttpServletRequest request){
        if(result.hasErrors()){
            Map<String, String> cat_names=CatNames();
            p_model.setCategories(cat_names);
            p_model.setCategoryName(p_model.getCategoryName());
            model.addAttribute("product", p_model);            
            model.addAttribute("categories", cat_names);
            return "editproduct";
        }
        Product p = productService.getProduct(p_model.getId());
        if(!p_model.getTitle().equals(p.getTitle()))
            p.setTitle(p_model.getTitle());
        if(!p_model.getDescription().equals(p.getDescription()))
            p.setDescription(p_model.getDescription());
        if(!p_model.getUnit().equals(p.getUnit()))
            p.setUnit(p_model.getUnit());
        if(p_model.getUnitPrice()!=p.getUnitPrice())
            p.setUnitPrice(p_model.getUnitPrice());
        if(!p_model.getCategoryName().equals(p.getCategory().getTitle())){
           Category c = categoryService.getCategory(p_model.getCategoryName());
           p.setCategory(c);
        }

        String path  = request.getSession().getServletContext().getRealPath("/WEB-INF/images");
        p.setImageP(path + File.separator+"image_default.png"); 
        this.productService.update(p);        
        return "redirect:/";
         
    }
    @RequestMapping("/product/remove/{id}")
    public String removeProduct(@PathVariable("id") int id, Model model){
        model.addAttribute("product", this.productService.getProduct(id));
        return "confirmdelete";
    }
    @RequestMapping(value="/product/remove", method = RequestMethod.POST)
    public String removeProduct(@ModelAttribute("product") Product product){    

        this.productService.delete(product);
         return "redirect:/";
    }    
    
    @RequestMapping("/product/addimage/{id}")
    public String addImage(@PathVariable("id") int id, Model model){
        model.addAttribute("product", this.productService.getProduct(id));
        return "addimage";
    }
    @RequestMapping(value="/product/addimage", method = RequestMethod.POST)
    public String addImage(@RequestParam("id") int id, 
            @RequestParam("image") MultipartFile file, Model model, HttpServletRequest request){    
            Product product = this.productService.getProduct(id);
            if (!file.isEmpty()) {
                String name =file.getOriginalFilename();
                String path  = request.getSession().getServletContext().getRealPath("/WEB-INF/images");
                product.setImageP(path+File.separator+name);
                try {
                    byte[] bytes = file.getBytes();
                    File serverFile = new File(path+File.separator+name);
                    BufferedOutputStream stream = new BufferedOutputStream(
                        new FileOutputStream(serverFile));
                    stream.write(bytes);
                    stream.close();
                    this.productService.update(product);
                } 
                catch (Exception e) {
                 
                    model.addAttribute("message", e);
                }
            } 
       
       return "done";
    } 
    
    @RequestMapping(value= "/product/addtocart", method = RequestMethod.POST)
    public String addToCart(@ModelAttribute("model") AddToCart model){
        Product p = this.productService.getProduct(model.getId());
        Person user = this.userService.getUser(model.getUsername());
        Cart c = user.getCart();
        int q = model.getQuantity();
        Set<ProductInCart> ps = new HashSet<ProductInCart>(){};
        try{
        if(c.getProducts()!=null)
                ps = c.getProducts();
        }
        catch(Exception e){
        }
        ProductInCart p_in_c = new ProductInCart();
        p_in_c.setProduct(p);
        p_in_c.setQuantity(q);
        ps.add(p_in_c);
        c.setProducts(ps);
        double cost =c.getCost();

        cost+=p_in_c.getProduct().getUnitPrice()*p_in_c.getQuantity();
        c.setCost(cost);
        this.cartService.update(c);
        return "redirect:/product/details/"+model.getId();
         
    }
    
    @RequestMapping(value= "/product/clearcart/{id}")
    public String clearCart(@ModelAttribute("id") int id){
        Cart c = this.cartService.getCart(id);
        Set<ProductInCart> ps = new HashSet<ProductInCart>(){};
        
        c.setProducts(ps);
        c.setCost(0.0);
        this.cartService.update(c);
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        return "redirect:/user/cart/"+name;
         
    }
    private Map<String, String> CatNames(){
        Map<String,String> cat_names = new LinkedHashMap<String,String>(){};
        List<Category> cats = categoryService.getAllCategories();
        if(!cats.isEmpty()){
        for(Category cat:cats){
            cat_names.put(cat.getTitle(), cat.getTitle());
        }
        }
        return cat_names;
    }
    
}
