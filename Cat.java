package com.company;

public class Cat extends Animal {
    public Cat (String name, AnimalType type){
        super (name, type);
    }

    public void makeSomeNoise () {
        System.out.printf("%s: %s", name, "Мяу-мур" );
        System.out.println();
    }

    public void likeEat () {
        System.out.printf("%s: %s", name, "Молоко, вискас");
        System.out.println();
    }

    public void haveCharacter (){
        System.out.printf("%s: %s", name, "Ласковая");
        System.out.println();
    }

}
