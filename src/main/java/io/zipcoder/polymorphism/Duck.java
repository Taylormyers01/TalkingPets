package io.zipcoder.polymorphism;

public class Duck extends Pet{

    public Duck(String name){
        super(name);
    }

    @Override
    public String speak(){
        return "I'mma Duck";
    }
}
