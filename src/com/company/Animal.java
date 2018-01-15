package com.company;

public class Animal {
    private String name, breed, kindOfAnimal;
    private int age;

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public String getKindOfAnimal() {
        return kindOfAnimal;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName (String name) {
        this.name = name;
    }
    public void setBreed (String breed) {
        this.breed = breed;
    }
    public void setKindOfAnimal (String kindOfAnimal) { this.kindOfAnimal = kindOfAnimal; }
}
