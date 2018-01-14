package com.company;

public class Main {

    public static void main(String[] args) {
       Speakable [] speakable = new Speakable [] {(new Cat ("Harold", "Персидский", 3, "Кот")),(new Dog ("Шарик", "-", 5, "Собака"))};
       speakable[0].show();
	   speakable[0].speak();
	   speakable[1].show();
	   speakable[1].speak();
    }
}
