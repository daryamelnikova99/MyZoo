package com.company;

public class Hedgehog extends Animal {
    public Hedgehog (String name, AnimalType type){
        super(name, type);
    }
    public void makeSomeNoise () {
        System.out.printf("%s: %s", name, "Фыр-фыр" );
        System.out.println();
    }

    public void likeEat () {
        System.out.printf("%s: %s", name, "Грибы, яблоки");
        System.out.println();
    }

    public void haveCharacter (){
        System.out.printf("%s: %s", name, "Запасливый");
        System.out.println();
    }
}
