package com.company;

public class Cat extends Animal {
    private static int count;

    public Cat() {
        count++;
    }

    @Override
    public void run(int meters) {
        super.run(meters);
        if (meters > 200) {
            System.out.println("Кіт стільки не пробіжить");

        } else {
            System.out.println("Кіт пробіг " + meters);
        }
    }

    @Override
    public void swim(int meters) {
        super.swim(meters);
        System.out.println("Кіт не вміє плавати");
    }

    public static int getCount() {
        return count;
    }
}
