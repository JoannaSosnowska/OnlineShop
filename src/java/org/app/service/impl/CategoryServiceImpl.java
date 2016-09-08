/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app.service.impl;

import java.util.List;
import javax.transaction.Transactional;
import org.app.dao.CategoryDao;
import org.app.model.Category;
import org.app.service.CategoryService;
import org.springframework.stereotype.Service;

/**
 *
 * @author Joanna667
 */
@Service
public class CategoryServiceImpl implements CategoryService{

    private CategoryDao categorydao;
    public void setCategoryDao(CategoryDao categorydao) {
        this.categorydao = categorydao;
    }

    @Override
    @Transactional
    public void add(Category category) {
        categorydao.add(category);
    }

    @Override
    @Transactional
    public Category getCategory(String title) {
        return categorydao.getCategory(title);
    }
    
    @Override
    @Transactional
    public List getAllCategories() {
        return categorydao.getAllCategories();
    }

    @Override
    @Transactional
    public void update(Category category) {
        categorydao.update(category); 
    }
    
}
