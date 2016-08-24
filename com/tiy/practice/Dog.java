package com.tiy.practice; 

public class Dog extends Animal { 

    public Dog() { 
        super(); 
        System.out.println("Building a Dog object");
        type = "Dog"; 
    }

    public void makeNoise() { 
        System.out.println(type + " says Bark!");
    }
}
