package com.company;

import java.util.Scanner;

public class Cat extends Pet {
    private boolean likesTreats;
    private boolean hasLonghair;
    private String hairColor;
    private String eyeColor;
    private boolean usesLitterbox;
    private boolean likesCatnip;
    private Scanner input = new Scanner(System.in);

    @Override
    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public Cat() {
        System.out.println("What is your cat's name?");
        setPetName(getInput().nextLine());
        System.out.println("Does " + getPetName() + " like treats? true or false.");
        setLikesTreats(getInput().nextBoolean());
        System.out.println("Does" + getPetName() + " have long hair? true or false.");
        setHasLonghair(getInput().nextBoolean());
        System.out.println("What is " + getPetName() + "'s hair color?");
        setHaircolor(getInput().nextLine());
        System.out.println("What is " + getPetName() + "'s eye color?");
        setEyeColor(getInput().nextLine());
        System.out.println("Does " + getPetName() + " use the litterbox?" );
        setUsesLitterbox(getInput().nextBoolean());
        System.out.println("Does " + getPetName() + " like catnip");
        setLikesCatnip(getInput().nextBoolean());
        


    }

    public Cat(String ownerName, String petName, String homeAddress, int age, char gender,
        boolean likesTreats, boolean hasLonghair, String hairColor, String eyeColor, boolean usesLitterbox,
         boolean likesCatnip) {

        super(ownerName, petName, homeAddress, age, gender);
        this.likesTreats = likesTreats;
        this.hasLonghair = hasLonghair;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.usesLitterbox = usesLitterbox;
        this.likesCatnip = likesCatnip;
    }

    public boolean isLikesTreats() {
        return likesTreats;
    }

    public void setLikesTreats(boolean likesTreats) {
        this.likesTreats = likesTreats;
    }

    public boolean isHasLonghair() {
        return hasLonghair;
    }

    public void setHasLonghair(boolean hasLonghair) {
        this.hasLonghair = hasLonghair;
    }

    public String getHaircolor() {
        return hairColor;
    }

    public void setHaircolor(String haircolor) {
        this.hairColor = haircolor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public boolean isUsesLitterbox() {
        return usesLitterbox;
    }

    public void setUsesLitterbox(boolean usesLitterbox) {
        this.usesLitterbox = usesLitterbox;
    }

    public boolean isLikesCatnip() {
        return likesCatnip;
    }

    public void setLikesCatnip(boolean likesCatnip) {
        this.likesCatnip = likesCatnip;
    }

    @Override
    protected String makeSound() {
        return super.makeSound() + " Cats Meow";

    }

}