/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app.dao;

import java.util.List;
import org.app.model.Purchase;

/**
 *
 * @author Joanna667
 */
public interface PurchaseDao {
    public void add(Purchase p);
    public void update(Purchase p);
    public Purchase getPurchase(int purchase_id);
    public List<Purchase> getPurchases(String user_name);
    public List<Purchase> getPurchases();
}
