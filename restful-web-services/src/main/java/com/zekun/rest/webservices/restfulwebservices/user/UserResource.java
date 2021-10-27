package com.zekun.rest.webservices.restfulwebservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UseDaoService useDaoService;

    //GET /users
    //List<User> retrieveAllUsers()
    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return useDaoService.findAll();
    }

    //GET /users/{id}
    //User retrieveUser(int id)
    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id) {
        return useDaoService.find(id);
    }


    //POST /users
    //void createUser(User user)
    @PostMapping("/users")
    public void createUser(@RequestBody  User user) {
        User savedUser = useDaoService.save(user);
    }
}
