package com.hypad.spring;

public class Person {
    private Pet  pet;
    private String surname;
    private int age;
    public Person(){
        System.out.println("Person bean");
    }
    public void setPet(Pet pet){
        System.out.println("Class Person:set pet ");
        this.pet = pet;
    }

    public void callPet(){
        System.out.println("Come here sweetie");
    pet.say();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }
}
