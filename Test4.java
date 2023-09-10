package com.hypad.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("app2Context.xml");
    Cat cat = context.getBean("myPet",Cat.class);
    cat.setName("Roma");
    Cat cat0 = context.getBean("myPet",Cat.class);
cat0.setName("Mazaev");

        System.out.println(cat.getName());
        System.out.println(cat0.getName());
        context.close();
    }
}
