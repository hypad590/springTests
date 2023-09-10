package com.hypad.spring;

public class Dog implements Pet{
   public Dog(){
       System.out.println("Dog bean");
   }
    @Override
    public void say(){
        System.out.println("bark");
    }
}
