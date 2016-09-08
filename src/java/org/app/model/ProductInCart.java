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

/**
 *
 * @author Joanna667
 */
@Entity
@Table(name="PRODUCT_IN_CART")
public class ProductInCart implements Serializable{
    @Id 
    @Column(name = "productincart_id", unique=true, nullable=false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "product_id")  
    private Product product;
    @NotNull
    private Integer quantity;
    public Integer getId(){
        return this.id;
    }
    public Product getProduct(){
        return this.product;
    }
    public void setProduct(Product product){
        this.product=product;
    }
    public Integer getQuantity(){
        return this.quantity;
    }
    public void setQuantity(Integer q){
        this.quantity=q;
    }
    
}
