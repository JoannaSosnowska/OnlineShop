/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app.controller;
import java.util.HashSet;
import javax.validation.Valid;
import org.app.model.Category;
import org.app.model.Product;
import org.app.service.CategoryService;
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
public class CategoryController{
    private CategoryService categoryService;
    @Qualifier(value="categoryService")
    public void setCategoryService(CategoryService cs){
        this.categoryService = cs;
    }
    @RequestMapping(value = "/category/all", method = RequestMethod.GET)
    public String listCategories(Model model) {
        model.addAttribute("listCategories", this.categoryService.getAllCategories());
        return "categories";
    }
    @RequestMapping(value = "/category/details/{title}", method = RequestMethod.GET)
    public String categoryDetails(@PathVariable("title") String title, Model model) {
        Category c =this.categoryService.getCategory(title);
        if(c!=null){
        model.addAttribute("category", c);
            return "categoryproducts";
        }
        else
            return "redirect:/";
    }
    
    @RequestMapping("/category/add")
    public String addCategory(Model model){
        Category c = new Category();
        model.addAttribute("category", c);
        return "addcategory";
    }
    
    @RequestMapping(value= "/category/add", method = RequestMethod.POST)
    public String addCategory(@Valid @ModelAttribute("category") Category c, BindingResult result, Model model){
        Category cat = this.categoryService.getCategory(c.getTitle());
        if(null!=cat)
            result.rejectValue("title", "error.category", "Taka kategoria już istnieje");
       
        if (result.hasErrors()) {
            model.addAttribute("category", c);
           return "addcategory";
        }

        c.setProducts(new HashSet<Product>(){});
        this.categoryService.add(c);        
        return "redirect:/category/all";
         
    }
     
}
