package io.zipcoder.polymorphism;

public class Pet {

    static int age;
    static String name;
    public Pet(){
        this.name = " ";
        this.age = 0;
    }
    public Pet(String name){
        this.name = name;
    }
    public Pet(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String speak(){
        return "Sup, I'mma pet";
    }
}
