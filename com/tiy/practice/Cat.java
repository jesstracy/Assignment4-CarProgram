package com.tiy.practice; 

public class Cat extends Animal { 

    public Cat() { 
        super(); 
        type = "Cat"; 
    }

    public void makeNoise() { 
        System.out.println(type + " says Meow!");
    }
}
