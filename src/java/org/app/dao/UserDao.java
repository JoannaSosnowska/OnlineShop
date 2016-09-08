/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app.dao;

import java.util.List;
import org.app.model.Person;

/**
 *
 * @author Joanna667
 */
public interface UserDao {
    public void add(Person user);
    public void update(Person user);
    public Person getUser(String login);
    public List<Person> getAllUsers();
}
