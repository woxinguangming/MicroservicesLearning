package com.zekun.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {
    private String message;

    public HelloWorldBean(String message) {
        this.message = message;
    }

    public void setName(String message) {
        this.message = message;
    }

    public String getName() {
        return message;
    }
    @Override
    public String toString() {
        return "HelloWorldBean[message = " + message + "]";
    }
}
