package com.company;

import java.util.Scanner;

public class Main {

    private String myString;

    public static void main(String[] args) {

       Dog dog = new Dog();
       System.out.println(dog.makeSound());


       Cat cat = new Cat();
        System.out.println(cat.makeSound());


        System.out.println(cat.catYears());
    }

}


