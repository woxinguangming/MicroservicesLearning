package com.zekun.rest.webservices.restfulwebservices.helloworld;

import com.zekun.rest.webservices.restfulwebservices.helloworld.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {
    //GET hello-world
    //String helloWorld()
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "hello world254livereload";
    }

    //返回一个helloworld的bean
    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello Wolrd Bean123test");
    }

    //hello-world-bean/path-variable/{name}
    @GetMapping("/hello-world-bean/path-variable/{name}")
    public HelloWorldBean HelloWorldBeanPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello world, %s", name));
    }
}
