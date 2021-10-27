package com.zekun.rest.webservices.restfulwebservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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
    //输入 用户的细节
    //输出 已创建 & 返回创建的URI
    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@RequestBody  User user) {
        User savedUser = useDaoService.save(user);
        //Created
        // /users/{id}  -> savedUsers.getId()
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
}
