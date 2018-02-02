package com.company;

import java.util.Scanner;

public class Dog extends Pet {

    private boolean likesWalks;
    private boolean canFetch;
    private String coatType;
    private Scanner input = new Scanner(System.in);

    public Dog() {
        System.out.println("What is your dogs name?");
        setPetName(input.nextLine());
        System.out.println("Does " + getPetName() + " like to take walks? true or false.");
        setLikesWalks(input.nextBoolean());
        System.out.println("Can " + getPetName() + " fetch?");
        setCanFetch(input.nextBoolean());
        System.out.println("What coat type does " + getPetName() + " have?");
        setCoatType(input.nextLine());
        System.out.println("How old is " + getPetName() + "?");
        setAge(input.nextInt());
        int newAge = getAge() * 7;
        System.out.println(getPetName() + " is " + newAge + " in dog years and " + getAge() + " in human years.");


    }

    public Dog(String ownerName, String petName, String homeAddress, int age, char gender,
               boolean likesWalks, boolean canFetch, String coatType, Scanner input) {
        super(ownerName, petName, homeAddress, age, gender);
        this.likesWalks = likesWalks;
        this.canFetch = canFetch;
        this.coatType = coatType;
        this.input = input;
    }

    public boolean isLikesWalks() {
        return likesWalks;
    }

    public void setLikesWalks(boolean likesWalks) {
        this.likesWalks = likesWalks;
    }

    public boolean isCanFetch() {
        return canFetch;
    }

    public void setCanFetch(boolean canFetch) {
        this.canFetch = canFetch;
    }

    public String getCoatType() {
        return coatType;
    }

    public void setCoatType(String coatType) {
        this.coatType = coatType;
    }

    @Override
    protected String makeSound() {
        return super.makeSound() + " Dogs bark";

    }


}
