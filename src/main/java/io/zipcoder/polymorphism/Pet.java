package io.zipcoder.polymorphism;

public class Pet {



    static String name;
    public Pet(){
        this.name = " ";

    }
    public Pet(String name){
        this.name = name;
    }

    public String speak(){
        return "Sup, I'mma pet";
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Pet.name = name;
    }
}
