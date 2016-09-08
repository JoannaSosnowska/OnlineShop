/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app.service.impl;

import java.util.List;
import javax.transaction.Transactional;
import org.app.dao.PurchaseDao;
import org.app.model.Purchase;
import org.app.service.PurchaseService;
import org.springframework.stereotype.Service;

/**
 *
 * @author Joanna667
 */
@Service
public class PurchaseServiceImpl implements PurchaseService{

    private PurchaseDao purchasedao;
    public void setPurchaseDao(PurchaseDao purchasedao) {
        this.purchasedao = purchasedao;
    }
    
    @Override
    @Transactional
    public void add(Purchase p) {
        purchasedao.add(p);
    }

    @Override
    @Transactional
    public void update(Purchase p) {
        purchasedao.update(p);
    }

    @Override
    @Transactional
    public Purchase getPurchase(int purchase_id) {
        return purchasedao.getPurchase(purchase_id);
    }

    @Override
    @Transactional
    public List getPurchases(String user_name) {
        return purchasedao.getPurchases(user_name);
    }

    @Override
    @Transactional
    public List getPurchases() {
        return purchasedao.getPurchases();
    }
    
}
