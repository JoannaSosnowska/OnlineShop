/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app.model;

import java.util.Map;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;
/**
 *
 * @author Joanna667
 */
public class AddOrEditProduct {
    private Integer id;
    @NotEmpty(message = "Pole obowiązkowe")
    private String title;
    @NotEmpty(message = "Pole obowiązkowe")
    private String description;
    @NotNull(message = "Pole obowiązkowe")
    private Double unitPrice;
    @NotEmpty(message = "Pole obowiązkowe")
    private String unit;
    private Map<String,String> categories;
    private String categoryName;
    public Integer getId(){
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String t){
        this.title=t;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public String getCategoryName(){
        return this.categoryName;
    }
    public void setCategoryName(String cat_name){
        this.categoryName=cat_name;
    }
    public Double getUnitPrice(){
        return this.unitPrice;
    }
    public void setUnitPrice(Double price){
        this.unitPrice=price;
    }
    public String getUnit(){
        return this.unit;
    }
    public void setUnit(String unit){
        this.unit=unit;
    }
    public Map<String,String> getCategories(){
        return this.categories;
    }
    public void setCategories(Map<String,String> names){
        this.categories=names;
    }
}
