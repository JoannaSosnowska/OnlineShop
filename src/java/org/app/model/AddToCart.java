/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app.model;

/**
 *
 * @author Joanna667
 */
public class AddToCart {
    private Integer quantity;
    private Integer id;
    private String username;
    public Integer getQuantity(){
        return this.quantity;
    }
    public void setQuantity(Integer q){
        this.quantity=q;
    }
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id=id;
    }
    public String getUsername(){
        return this.username;
    }
    public void setUsername(String name){
        this.username=name;
    }
}
