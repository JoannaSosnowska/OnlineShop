/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app.service.impl;

import java.util.List;
import javax.transaction.Transactional;
import org.app.dao.UserDao;
import org.app.model.Person;
import org.app.service.UserService;
import org.springframework.stereotype.Service;

/**
 *
 * @author Joanna667
 */
@Service
public class UserServiceImpl implements UserService{

    private UserDao userdao;
    public void setUserDao(UserDao userdao) {
        this.userdao = userdao;
    }
    
    @Override
    @Transactional
    public void add(Person user) {
        userdao.add(user);
    }

    @Override
    @Transactional
    public void update(Person user) {
        userdao.update(user);
    }

    @Override
    @Transactional
    public Person getUser(String login) {
        return userdao.getUser(login);
    }

    @Override
    @Transactional
    public List getAllUsers() {
        return userdao.getAllUsers();
    }
    
}
