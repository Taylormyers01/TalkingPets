package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApplication {
    static Scanner input = new Scanner(System.in);
    static Integer numOfPets = 0;
    String[][] names;
    List<Pet> pets = new ArrayList<>();

    public static void main(String[] args) {
        System.out.print("Please input the number of pets you have: ");
        if(input.hasNextInt()){
            numOfPets = input.nextInt();
        }
        String[][] names = new String[2][numOfPets];

        System.out.print("Input the type of pet one at a time (dog, cat, duck): ");
        for(int i = 0; i < numOfPets; i++){
            names[0][i] = input.next();
        }
        System.out.println("Input the pets names one at a time: ");
        for(int i = 0; i < numOfPets; i++){
            names[1][i] = input.next();
        }

        for(int i = 0; i < numOfPets; i++){
            if(names[0][i].equalsIgnoreCase("cat")){
                Cat cat = new Cat(names[1][i]);
                System.out.println(cat.getName()+ " says " +   cat.speak());

            }
            else if(names[0][i].equalsIgnoreCase("dog")){
                Dog dog = new Dog(names[1][i]);
                System.out.println(dog.getName()+ " says " +   dog.speak());

            } else if(names[0][i].equalsIgnoreCase("duck")){
                Duck duck = new Duck(names[1][i]);
                System.out.println(duck.getName()+ " says " + duck.speak());

            }
            else{
                Pet pet = new Pet(names[1][i]);
                System.out.println(pet.getName()+ " says " + pet.speak());

            }
        }
    }
}
