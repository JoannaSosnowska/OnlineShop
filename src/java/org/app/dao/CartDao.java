/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app.dao;

import org.app.model.Cart;

/**
 *
 * @author Joanna667
 */
public interface CartDao {
    public void add(Cart c);
    public void update(Cart c);
    public Cart getCart(int cart_id);
}
