/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Joanna667
 */
@Entity
@Table(name="PRODUCT")
public class Product implements Serializable{
    @Id 
    @Column(name = "product_id", unique=true, nullable=false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty
    @Column(name="title", unique=false, nullable=false)
    private String title;
    @Column(name="imageP", unique=false, nullable=false)
    private String imageP;
    @NotEmpty
    @Column(name="description", unique=false, nullable=false)
    private String description;
    @NotNull
    @Column(name="unitprice", unique=false, nullable=false)
    private Double unitPrice;
    @NotEmpty
    @Column(name="unit", unique=false, nullable=false)
    private String unit;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "cat_title")  
    private Category category;
    public Integer getId(){
        return this.id;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String t){
        this.title=t;
    }
    public String getImageP(){
        return this.imageP;
    }
    public void setImageP(String p){
        this.imageP=p;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description=description;
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
    public Category getCategory(){
        return this.category;
    }
    public void setCategory(Category cat){
        this.category=cat;
    }
}
