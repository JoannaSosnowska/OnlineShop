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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Joanna667
 */
@Entity
@Table(name="CART")
public class Cart implements Serializable{
    @Id 
    @Column(name = "cart_id", unique=true, nullable=false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    @Column(name="cost", unique=false, nullable=false)
    private Double cost;
    @OneToOne
    @JoinColumn(name = "nick")
    private Person owner;
    @OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)  
    private Set<ProductInCart> products;
    public Integer getId(){
        return this.id;
    }
    public Double getCost(){
        return this.cost;
    }
    public void setCost(Double c){
       this.cost=c;       
    }
    public Person getOwner(){
        return this.owner;
    }
    public void setOwner(Person p){
        this.owner=p;
    }
    public Set<ProductInCart> getProducts(){
        return this.products;
    }
    public void setProducts(Set<ProductInCart> list){
        this.products=list;
    }
    
}
