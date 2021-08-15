package com.maven.test;

import org.springframework.stereotype.Component;

@Component("person1")
public class Person {
    public void show(){
        System.out.println("welcome to maven!!!");
    }
}
