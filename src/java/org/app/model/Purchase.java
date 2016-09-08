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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Joanna667
 */

@Entity
@Table(name="PURCHASE")
public class Purchase implements Serializable{
    @Id 
    @Column(name = "purchase_id", unique=true, nullable=false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty
    @Column(name="stage", unique=false, nullable=false)
    private String stage;
    @NotNull
    @Column(name="nettocost", unique=false, nullable=false)
    private Double nettocost;
    @NotNull
    @Column(name="bruttocost", unique=false, nullable=false)
    private Double bruttocost;
    @NotNull
    @Column(name="transport", unique=false, nullable=false)
    private Integer transport;
    @NotEmpty
    @Column(name="purchasedt", unique=false, nullable=false)
    String purchaseDt;
    @ManyToOne
    @JoinColumn(name = "nick")  
    private Person customer;
    @OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<ProductInCart> products;
    public Integer getId(){
        return this.id;
    }
    public String getStage(){
        return this.stage;
    }
    public void setStage(String s){
        this.stage=s;
    }
    public Integer getTransport(){
        return this.transport;
    }
    public void setTransport(Integer transport){
        this.transport=transport;
    }
    public Double getBruttocost(){
        return this.bruttocost;
    }
    public void setBruttocost(Double cost){
        this.bruttocost=cost;
    }
    public Double getNettocost(){
        return this.nettocost;
    }
    public void setNettocost(Double cost){
        this.nettocost=cost;
    }
    public String getPurchaseDt(){
        return this.purchaseDt;
    }
    public void setPurchaseDt(String dt){
        this.purchaseDt=dt;
    }
    public Person getCustomer(){
        return this.customer;
    }
    public void setCustomer(Person p){
        this.customer=p;
    }
    public Set<ProductInCart> getProducts(){
        return this.products;
    }
    public void setProducts(Set<ProductInCart> products){
        this.products=products;
    }
    
    
}
