package com.company;

public class Cat extends Animal implements Speakable {

    public void show() {
        System.out.println(getKindOfAnimal() + " по кличке " + getName() + ", порода " + getBreed() + ", возраст " + getAge());
    }
    public void speak () {
        System.out.printf(getKindOfAnimal() + " " + getName() + " приветствует тебя ласковым мурчанием. \n");
    }
}