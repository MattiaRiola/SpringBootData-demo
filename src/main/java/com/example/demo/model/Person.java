package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class Person {

    @Field(name="firstname")
    private String firstname;
    @Field(name="surname")
    private String surname;
    @Field(name="age")
    private int age;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
