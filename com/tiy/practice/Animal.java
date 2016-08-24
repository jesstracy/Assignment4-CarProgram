package com.tiy.practice; 

public class Animal { 
    public String name; 
    public String type = "Generic Animal"; 

    public Animal() {
    	System.out.println("Building an Animal object");
    }

    public void makeNoise() { 
        System.out.println(type + " says ... Boo?");
    }
}
