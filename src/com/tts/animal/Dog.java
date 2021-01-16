package com.tts.animal;

import java.util.Scanner;

//I see now that it makes no sense to have a separate class
//here unless it consists of different attributes and/or
// methods than the Cat class
public class Dog extends Pet {

    //variables
    private String name;
    private double weight;
    private boolean shots;
    private boolean trained;

    //constructors
    public Dog() {
        super();
        this.name = "unknown";
        this.weight = 0;
        this.shots = false;
    }

    public Dog(double weight, boolean shots) {
        this.weight = weight;
        this.shots = shots;
    }

    public Dog(int age, String location, String type, String name,
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
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", location=" + getLocation() +
                ", type=" + getType() +
                ", weight=" + weight +
                ", shots=" + shots +
                '}';
    }


}//end Dog class


