package com.company;

public class Main {

    public static void main(String[] args) {
       Cat newcat = new Cat();
       newcat.setAge(2);
       newcat.setName("Harold");
       newcat.setBreed("Персидский");
       newcat.setKindOfAnimal("Кот");

       Dog newdog = new Dog();
        newdog.setAge(5);
        newdog.setName("Шарик");
        newdog.setBreed("безпородный");
        newdog.setKindOfAnimal("Пес");

        newcat.show();
        newcat.speak();
        newdog.show();
        newdog.speak();
    }
}
