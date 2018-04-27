/**
 * 
 */
package com.dhaval.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dhaval.model.LoginForm;
import com.dhaval.model.User;

/**
 * @author Dhaval Simaria
 *
 */
@Service
public class UserService {

    private List<User> users;

    public List<User> login(LoginForm loginForm) {

        // do stuffs
        // dump user data
        User user = new User(loginForm.getUsername(), loginForm.getPassword(), "email@javabycode.com");

        return new ArrayList<User>(Arrays.asList(user));

    }

}
