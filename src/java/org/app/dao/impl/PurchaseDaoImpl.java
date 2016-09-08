/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app.dao.impl;

import java.util.List;
import org.app.dao.PurchaseDao;
import org.app.model.Purchase;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Joanna667
 */
@Repository
public class PurchaseDaoImpl implements PurchaseDao{
    private SessionFactory session;
    public void setSessionFactory(SessionFactory sf){
        this.session = sf;
    }
    @Override
    public void add(Purchase p) {
        session.getCurrentSession().save(p);
    }
    @Override
    public void update(Purchase p) {
        session.getCurrentSession().update(p);
    }

    @Override
    public Purchase getPurchase(int purchase_id) {
        return (Purchase)session.getCurrentSession().get(Purchase.class, purchase_id);
    }

    @Override
    public List<Purchase> getPurchases(String user_name) {
        String query = "from Purchase as pur where pur.customer.nick ='"+user_name+"' ORDER BY pur.id DESC";
        return (List<Purchase>)session.getCurrentSession().createQuery(query).list();
    }

    @Override
    public List<Purchase> getPurchases() {
        String query = "from Purchase as pur where pur.stage ='Zamówienie w trakcie realizacji' ORDER BY pur.id DESC";
        return (List<Purchase>)session.getCurrentSession().createQuery(query).list();
  }
    
}
