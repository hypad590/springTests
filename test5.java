package com.hypad.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("app2Context.xml");

        Cat cat = context.getBean("myPet",Cat.class);

        Cat cat1 = context.getBean("myPet",Cat.class);

        cat1.say();
        cat.say();
        context.close();
    }
}
