package com.zekun.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {
    //GET hello-world
    //String helloWorld()
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "hello world";
    }

    //返回一个helloworld的bean
    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello Wolrd Bean123test");
    }
}
