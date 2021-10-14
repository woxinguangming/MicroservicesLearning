package com.zekun.rest.webservices.restfulwebservices;

public class HelloWorldBean {
    private String name;

    public HelloWorldBean(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "HelloWorldBean[name = " + name + "]";
    }
}
