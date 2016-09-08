/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app.service.impl;

import javax.transaction.Transactional;
import org.app.dao.CartDao;
import org.app.model.Cart;
import org.app.service.CartService;
import org.springframework.stereotype.Service;

/**
 *
 * @author Joanna667
 */
@Service
public class CartServiceImpl implements CartService{

    private CartDao cartdao;
    public void setCartDao(CartDao cartdao) {
        this.cartdao = cartdao;
    }
    
    @Override
    @Transactional
    public void add(Cart c) {
        cartdao.add(c);
    }

    @Override
    @Transactional
    public void update(Cart c) {
        cartdao.update(c);
    }

    @Override
    @Transactional
    public Cart getCart(int cart_id) {
        return cartdao.getCart(cart_id);
    }
    
}
