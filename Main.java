package com.company;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat ("Муся", AnimalType.PET);
        cat.makeSomeNoise();
        cat.likeEat();
        cat.haveCharacter();
        System.out.println(cat);

        Dog dog = new Dog ("Бублик", AnimalType.PET);
        dog.makeSomeNoise();
        dog.likeEat();
        dog.haveCharacter();
        System.out.println(dog);

        Hedgehog hedgehog = new Hedgehog ("Имбирчик", AnimalType.WILD);
        hedgehog.makeSomeNoise();
        hedgehog.likeEat();
        hedgehog.haveCharacter();
        System.out.println(hedgehog);

        Hare hare = new Hare ("Косой", AnimalType.WILD);
        hare.makeSomeNoise();
        hare.likeEat();
        hare.haveCharacter();
        System.out.println(hare);
    }

    //public static void someNoise(IDescriptioneable animal){
        //animal.makeSomeNoise();
    //}
}
