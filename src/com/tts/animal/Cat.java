package com.tts.animal;

import java.util.Scanner;

public class Cat extends Pet {

    //variables
    private String name;
    private double weight;
    private boolean shots;

    //constructors
    public Cat() {
        super();
        this.name = "unknown";
        this.weight = 0;
        this.shots = false;
    }

    public Cat(double weight, boolean shots) {
        this.weight = weight;
        this.shots = shots;
    }

    public Cat(int age, String location, String type, String name,
               double weight, boolean shots) {
        super(age, location, type);
        this.name = name;
        this.weight = weight;
        this.shots = shots;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isShots() {
        return shots;
    }

    public void setShots(boolean shots) {
        this.shots = shots;
    }

    //methods
    public void askOwner(){
        Scanner readInput = new Scanner(System.in);

        System.out.println("Would you like to get your pet's shots today? (y/n)");
        String answer = readInput.next();
        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
            this.shots = true;
        }
    }

    //overrides
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", location=" + getLocation() +
                ", type=" + getType() +
                ", weight=" + weight +
                ", shots=" + shots +
                '}';
    }


}//end Cat class

