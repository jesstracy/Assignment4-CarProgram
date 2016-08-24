package com.tiy.practice; 

import java.util.Scanner; 

public class Day4Runner { 
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); 
        myAnimal.makeNoise(); 

        Dog myDog = new Dog(); 
        myDog.makeNoise(); 

        Animal whatsThis = new Dog(); 
        whatsThis.makeNoise(); 

        getUserAnimalInfo(); 
    }

    public static void getUserAnimalInfo() { 
        try { 
            Animal userAnimal; 

            Scanner inputScanner = new Scanner(System.in); 
            System.out.println("What type of Animal do you have?");
            System.out.println("1. Dog");
            System.out.println("2. Cat");
            String userChoice = inputScanner.nextLine(); 

            if (userChoice.equals("1")) { 
                userAnimal = new Dog(); 
            } else if (userChoice.equals("2")) { 
                userAnimal = new Cat(); 
            } else { 
                System.out.println("Invalid choice - bye!");
                return; 
            }

            System.out.println("Thanks - what's your " + userAnimal.type + "'s name?");
            userAnimal.name = inputScanner.nextLine(); 

            System.out.println(userAnimal.name + " has a message for you: ");
            userAnimal.makeNoise(); 

        } catch (Exception inputException) {
            System.out.println("Issue getting input from the user");
            inputException.printStackTrace();  
        }
    }
}
