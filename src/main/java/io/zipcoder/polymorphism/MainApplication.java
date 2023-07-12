package io.zipcoder.polymorphism;

import java.util.Scanner;

public class MainApplication {
    static Scanner input = new Scanner(System.in);
    static Integer numOfPets = 0;
    String[] names;

    public static void main(String[] args) {
        System.out.print("Please input the number of pets you have: ");
        if(input.hasNextInt()){
            numOfPets = input.nextInt();
        }
        String[] names = new String[numOfPets];
        System.out.print("Input their names one at a time: ");
        for(int i = 0; i < numOfPets; i++){
            names[i] = input.next();
        }
        for(String s: names){
            System.out.println(s);
        }
    }
//    public void captureInput(String prompt){
//        System.out.println(prompt);
//        if(input.h)
//    }

}
