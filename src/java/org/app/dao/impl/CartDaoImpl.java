/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app.dao.impl;

import org.app.dao.CartDao;
import org.app.model.Cart;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Joanna667
 */
@Repository
public class CartDaoImpl implements CartDao{

    private SessionFactory session;
    public void setSessionFactory(SessionFactory sf){
        this.session = sf;
    }
    @Override
    public void add(Cart c) {
        session.getCurrentSession().save(c);
    }
    @Override
    public void update(Cart c) {
        session.getCurrentSession().update(c);
    }

    @Override
    public Cart getCart(int cart_id) {
        return (Cart)session.getCurrentSession().get(Cart.class, cart_id);
    }
    
}
