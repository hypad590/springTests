package com.hypad.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        Person person = context.getBean("person",Person.class);

        person.callPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        context.close();
    }
}
