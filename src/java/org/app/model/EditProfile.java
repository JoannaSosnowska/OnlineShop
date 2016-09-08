/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app.model;

import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Joanna667
 */
public class EditProfile {
    @NotEmpty
    private String nick;
    @NotEmpty(message="Pole obowiązkowe")
    private String firstN;
    @NotEmpty(message="Pole obowiązkowe")
    private String lastN;
    @NotEmpty(message="Pole obowiązkowe")
    @Email
    private String email;
    @NotEmpty(message="Pole obowiązkowe")
    @Size(min = 8, max=24, message="Hasło musi mieć od 8 do 24 znaków")
    private String pass;
    @NotEmpty(message="Pole obowiązkowe")
    private String address;
    @NotEmpty(message="Pole obowiązkowe")
    private String zipCode;
    @NotEmpty(message="Pole obowiązkowe")
    private String city;
    private String st;
    @NotEmpty(message="Pole obowiązkowe")
    private String country;
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
}
