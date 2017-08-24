package com.resttemplates.resttemplates.Models;


import org.springframework.http.converter.HttpMessageConverter;

public class PersonModel {
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    String name;
    int age;
    String gender;

    public PersonModel () {}

    public PersonModel(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
