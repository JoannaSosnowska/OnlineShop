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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Joanna667
 */
@Entity
@Table(name="PERSON")
public class Person implements Serializable{
    @Id
    @NotEmpty(message="Pole obowiązkowe")
    @Column(name="nick", unique=true, nullable=false)
    private String nick;
    @NotEmpty(message="Pole obowiązkowe")
    @Column(name="firstN", unique=false, nullable=false)
    private String firstN;
    @NotEmpty(message="Pole obowiązkowe")
    @Column(name="lastN", unique=false, nullable=false)
    private String lastN;
    @NotEmpty(message="Pole obowiązkowe")
    @Email
    @Column(name="email", unique=false, nullable=false)
    private String email;
    @NotEmpty(message="Pole obowiązkowe")
    @Size(min = 8, max=24, message="Hasło musi mieć od 8 do 24 znaków")
    @Column(name="pword", unique=false, nullable=false)
    private String pass;
    @NotEmpty(message="Pole obowiązkowe")
    @Column(name="address", unique=false, nullable=false)
    private String address;
    @NotEmpty(message="Pole obowiązkowe")
    @Column(name="zipcode", unique=false, nullable=false)
    private String zipCode;
    @NotEmpty(message="Pole obowiązkowe")
    @Column(name="city", unique=false, nullable=false)
    private String city;
    @Column(name="st", unique=false, nullable=false)
    private String st;
    @NotEmpty(message="Pole obowiązkowe")
    @Column(name="country", unique=false, nullable=false)
    private String country;
    @Column(name="rights", unique=false, nullable=false)
    private String rights;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Cart cart;
    @OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)  
    private Set<Purchase> purchases;
    public String getNick(){
        return this.nick;
    }
    public void setNick(String n){
        this.nick=n;
    }
    public String getFirstN(){
        return this.firstN;
    }
    public void setFirstN(String n){
        this.firstN=n;
    }
    public String getLastN(){
        return this.lastN;
    }
    public void setLastN(String n){
        this.lastN=n;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getPass(){
        return this.pass;
    }
    public void setPass(String pw){
        this.pass=pw;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getZipCode(){
        return this.zipCode;
    }
    public void setZipCode(String code){
        this.zipCode=code;
    }
    
    public String getCity(){
        return this.city;
    }
    public void setCity(String city){
        this.city=city;
    }
    
    public String getCountry(){
        return this.country;
    }
    public void setCountry(String country){
        this.country=country;
    }
    
    public String getSt(){
        return this.st;
    }
    public void setSt(String s){
        this.st=s;
    }
    public String getRights(){
        return this.rights;
    }
    public void setRights(String s){
        this.rights=s;
    }
    public Cart getCart(){
        return this.cart;
    }
    public void setCart(Cart b){
        this.cart=b;
    }
    
    public Set<Purchase> getPurchases(){
        return this.purchases;
    }
    public void setPurchases(Set<Purchase> ps){
        this.purchases=ps;
    }
    
}
