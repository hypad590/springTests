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

    public void setName(String name) {
        System.out.println("Class Cat: set name");
        this.name = name;
    }
}
