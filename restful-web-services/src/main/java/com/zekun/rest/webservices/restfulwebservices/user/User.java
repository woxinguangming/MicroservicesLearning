package com.zekun.rest.webservices.restfulwebservices.user;

import java.util.Date;

public class User {
    private Integer id;
    private String name;
    private Date birthDay;

    public User(Integer id, String name, Date birthDay) {
        super();
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    @Override
    public String toString() {
        return "User{id = " + id + " name = " + name + "birthDay = " + birthDay + "}";
    }
}
