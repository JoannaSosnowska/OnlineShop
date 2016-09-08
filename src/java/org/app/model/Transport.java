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
public enum Transport {
    courier("Przesyłka kurierska - 15 PLN", 15), 
    post("Przesyłka pocztowa - 11 PLN", 11), 
    packet_machine("Odbiór z paczkomatu - 8 PLN", 8), 
    none("Odbiór osobisty - FREE", 0);
    Transport(String name, Integer value){
        this.name=name;
        this.value=value;
    }
    private String name;
    private Integer value;
    public String getName(){
        return this.name;
    }
    public Integer getValue(){
        return this.value;
    }
    
}
