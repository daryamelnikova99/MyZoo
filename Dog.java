package com.company;

public class Dog extends Animal {
    public Dog (String name, AnimalType type){
        super(name, type);
    }

    public void makeSomeNoise(){
        System.out.printf("%s: %s", name, "Гав-гав");
        System.out.println();
    }

    public void likeEat(){
        System.out.printf("%s: %s", name, "Косточки, мясо");
        System.out.println();
    }

    public void haveCharacter() {
        System.out.printf("%s: %s", name, "Преданный друг");
        System.out.println();
    }

}
