/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app.model;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Joanna667
 */
@Entity
@Table(name="CATEGORY")
public class Category implements Serializable{
    @Id 
    @NotEmpty(message = "Pole obowiązkowe")
    @Column(name="cat_title", unique=true, nullable=false)
    private String title;
    @NotEmpty(message = "Pole obowiązkowe")
    @Column(name="description", unique=false, nullable=false)
    private String description;
    @OneToMany(cascade=CascadeType.ALL, mappedBy="category", fetch = FetchType.EAGER)  
    private Set<Product> products;
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title=title;
    }
     public String getDescription(){
        return this.description;
    }
    public void setDescription(String d){
        this.description=d;
    }
    public Set<Product> getProducts(){
        return this.products;
    }
    public void setProducts(Set<Product> list){
        this.products=list;
    }
    
}
