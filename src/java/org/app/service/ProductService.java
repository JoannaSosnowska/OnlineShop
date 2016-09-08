/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app.service;

import java.util.List;
import org.app.model.Product;

/**
 *
 * @author Joanna667
 */
public interface ProductService {
    public void add(Product product);
    public void update(Product product);
    public void delete(Product product);
    public Product getProduct(int product_id);
    public List getProducts(int category_id);
    public List getAllProducts();
}
