/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.app.dao.CategoryDao;
import org.app.model.Category;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Joanna667
 */
@Repository
public class CategoryDaoImpl implements CategoryDao{

    private SessionFactory session;
    public void setSessionFactory(SessionFactory sf){
        this.session = sf;
    }
    @Override
    public void add(Category category) {
        session.getCurrentSession().save(category);
    }
    @Override
    public Category getCategory(String title) {
       String query = "from Category where title='"+title+"'";
       ArrayList<Category> list = (ArrayList<Category>)session.getCurrentSession().createQuery(query).list();
       if(!list.isEmpty()){
           return (Category)list.get(0);
       }
       else
           return null;
    }

    @Override
    public List<Category> getAllCategories() {
        String query = "from Category";
        return (List<Category>)session.getCurrentSession().createQuery(query).list();
    }

    @Override
    public void update(Category category) {
        session.getCurrentSession().update(category); 
    }
    
}
