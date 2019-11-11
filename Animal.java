package com.company;

public class Animal implements IDescriptioneable{
    String name = "Default name";
    AnimalType type = AnimalType.WILD;

    public Animal (String name, AnimalType type){
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString(){
        return "name = " + name + "\n" + "type = " + type + "\n";
    }

    @Override
    public void makeSomeNoise(){
        System.out.println("Animal noise");
    }

    @Override
    public void likeEat(){
        System.out.println("Animal favourite food");
    }

    @Override
    public void haveCharacter(){
        System.out.println("Animal's character");
    }

}

