/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.app.dao.UserDao;
import org.app.model.Person;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Joanna667
 */
@Repository
public class UserDaoImpl implements UserDao{
    private SessionFactory session;
    public void setSessionFactory(SessionFactory sf){
        this.session = sf;
    }
    @Override
    public void add(Person user) {
        session.getCurrentSession().save(user);
    }

    @Override
    public void update(Person user) {
        session.getCurrentSession().update(user);
    }

    @Override
    public Person getUser(String login) {
        String query = "from Person where nick='"+login+"'";
        ArrayList<Person> list = (ArrayList<Person>)session.getCurrentSession().createQuery(query).list();
        if(!list.isEmpty())
           return (Person)list.get(0);
        else
           return null;
   }

    @Override
    public List<Person> getAllUsers() {
        String query = "from Person";
        return (List<Person>)session.getCurrentSession().createQuery(query).list();
    }
    
}
