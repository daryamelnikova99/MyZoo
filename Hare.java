package com.company;

public class Hare extends Animal {
    public Hare (String name, AnimalType type){
        super(name, type);
    }

    public void makeSomeNoise () {
        System.out.printf("%s: %s", name, "Прыг-скок");
        System.out.println();
    }

    public void likeEat () {
        System.out.printf("%s: %s", name, "Морковка");
        System.out.println();
    }

    public void haveCharacter (){
        System.out.printf("%s: %s", name, "Шустрый");
        System.out.println();
    }
}
