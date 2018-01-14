package com.company;

public class Cat extends Animal implements Speakable {
    private String cindOfAnimal;

    private  String getCindOfAnimal () {
        return cindOfAnimal;
    }
    //конструктор
    Cat (String n, String b, int a, String coa) {
        super (n, b, a);
        cindOfAnimal = coa;
    }
    public void show() {
        System.out.println(getCindOfAnimal() + " по кличке " + getName() + ", порода " + getBreed() + ", возраст " + getAge());
    }
    public void speak () {
        System.out.printf(getCindOfAnimal() + " " + getName() + " приветствует тебя ласковым мурчанием. \n");
    }
}