/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app.dao.impl;

import java.util.List;
import org.app.dao.ProductDao;
import org.app.model.Product;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Joanna667
 */
@Repository
public class ProductDaoImpl implements ProductDao{
    
    private SessionFactory session;
    public void setSessionFactory(SessionFactory sf){
        this.session = sf;
    }
    @Override
    public void add(Product product) {
        session.getCurrentSession().save(product);
    }

    @Override
    public void update(Product product) {
        session.getCurrentSession().update(product);
    }

    @Override
    public void delete(Product product) {     
        session.getCurrentSession().delete(product);
        session.getCurrentSession().flush();
    }

    @Override
    public Product getProduct(int product_id) {
        return (Product)session.getCurrentSession().get(Product.class, product_id);
    }

    @Override
    public List<Product> getProducts(int category_id) {
        String query = "from Product as pr where pr.category.category_id ='"+category_id+"' ORDER BY pr.id DESC";
        return (List<Product>)session.getCurrentSession().createQuery(query).list();
    }

    @Override
    public List<Product> getAllProducts() {
        String query = "from Product as pr ORDER BY pr.id DESC";
        return (List<Product>)session.getCurrentSession().createQuery(query).list();
    }
    
}
