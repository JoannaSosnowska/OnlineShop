/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app.service;

import java.util.List;
import org.app.model.Category;

/**
 *
 * @author Joanna667
 */
public interface CategoryService {
    public void add(Category category);
    public void update(Category category);
    public Category getCategory(String title);
    public List getAllCategories();
}
