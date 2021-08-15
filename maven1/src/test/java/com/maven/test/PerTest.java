package com.maven.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PerTest {
    ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
    @Test
    public void testshow(){
        //Person person = new Person();
        Person person = (Person) app.getBean("person1");
        person.show();
        System.out.println("hello git!");
        System.out.println("hot-fix git! test!");
        System.out.println("hello git master!");
        System.out.println("---push---");
    }
}
