package com.company;

public class Animal {
    private String name;
    private String breed;
    private int age;

    //конструктор
    Animal (String n, String b, int a) {
        name = n;
        breed = b;
        age = a;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    //методы set не понадобились, писала, чтобы не забывать)
    public void setAge() {
        this.age = age;
    }
    public void setName () {
        this.name = name;
    }
    public void setBreed () {
        this.breed = breed;
    }
}
