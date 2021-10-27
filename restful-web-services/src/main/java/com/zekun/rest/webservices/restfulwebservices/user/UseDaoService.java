package com.zekun.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UseDaoService {
    private static List<User> users = new ArrayList<>();
    private int usersCount = 3;

    static {
        users.add(new User(1, "John", new Date()));
        users.add(new User(2, "Joe", new Date()));
        users.add(new User(3, "Jim", new Date()));
    }
    
    public List<User> findAll() {
        return users;
    }


    public User find(int id) {
        for(User user:users) {
            if(user.getId() == id) {
                return user;
            }
        }
        return null;
    }


    public User save(User user) {
        if(user.getId() == null) {
            user.setId(++usersCount);
        }
        users.add(user);
        return user;
    }


}
