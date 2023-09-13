package com.company;

public class Dog extends Animal {
    private static int count;

    public Dog() {
        count++;
    }

    @Override
    public void run(int meters) {
        super.run(meters);
        if (meters > 500) {
            System.out.println("Собака стільки не пробіжить");

        } else {
            System.out.println("Собака пробігла " + meters);
        }
    }

    @Override
    public void swim(int meters) {
        super.swim(meters);
        if (meters > 10) {
            System.out.println("Собака стільки не пропливе");
        } else {
            System.out.println("Собака проплила " + meters);
        }
    }

    public static int getCount() {
        return count;
    }
}
