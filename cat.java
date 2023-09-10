package com.hypad.spring;

public class Cat implements Pet{
    private String name;
    public Cat(){
        System.out.println("Cat bean");
    }
    @Override
    public void say(){
        System.out.println("Meow");
    }

    public String getName() {
        return name;
    }
    public void init(){
        System.out.println("Class Cat: init method");
    }

    public void destroy(){
        System.out.println("Class cat: destroy method");
    }
    public void setName(String name) {
        System.out.println("Class Cat: set name");
        this.name = name;
    }
}
