/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app.service.impl;

import java.util.List;
import javax.transaction.Transactional;
import org.app.dao.ProductDao;
import org.app.model.Product;
import org.app.service.ProductService;
import org.springframework.stereotype.Service;

/**
 *
 * @author Joanna667
 */
@Service
public class ProductServiceImpl implements ProductService{

    private ProductDao productdao;
    public void setProductDao(ProductDao productdao) {
        this.productdao = productdao;
    }
    
    @Override
    @Transactional
    public void add(Product product) {
        productdao.add(product);
    }

    @Override
    @Transactional
    public void update(Product product) {
        productdao.update(product);
    }

    @Override
    @Transactional
    public void delete(Product product) {
        productdao.delete(product);
    }

    @Override
    @Transactional
    public Product getProduct(int product_id) {
        return productdao.getProduct(product_id);
    }

    @Override
    @Transactional
    public List getProducts(int category_id) {
        return productdao.getAllProducts();
    }

    @Override
    @Transactional
    public List getAllProducts() {
        return productdao.getAllProducts();
    }
    
}
