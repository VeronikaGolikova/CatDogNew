package com.company;

public class Dog extends Animal implements Speakable {
    private String cindOfAnimal = "Собака";

    String getCindOfAnimal () {
        return cindOfAnimal;
    }

    //конструктор
    Dog (String n, String b, int a, String coa) {
        super (n, b, a);
        cindOfAnimal = coa;
    }
    public void show() {
        System.out.println(getCindOfAnimal() + " по кличке " + getName() + ", порода " + getBreed() + ", возраст " + getAge());
    }
    public void speak () {
        System.out.printf(getCindOfAnimal() + " " + getName() + " приветствует тебя вилянием хвостом. \n");
    }
}
