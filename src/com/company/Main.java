package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Dog dog = new Dog();
        dog.run(142);

        Dog dog2 = new Dog();
        dog2.run(121);

        Cat cat = new Cat();
        cat.run(15);
        cat.swim(300);

        Cat cat2 = new Cat();
        cat.run(100);
        cat.swim(1);

        System.out.println("Кол-во собак= " + dog2.getCount());
        System.out.println("Кол-во котів= " + cat2.getCount());
        System.out.println("Кол-во тварин= " + (cat2.getCount() + dog2.getCount()));


    }
}
