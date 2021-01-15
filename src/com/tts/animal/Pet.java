package com.tts.animal;

public class Pet {

    //variables
    public int age;
    private String location;
    private String type;

    //constructors
    public Pet() {
        this.age = 0;
        this.location = "unknown location";
        this.type = "default";
    }

    public Pet(int age, String location, String type) {
        this.age = age;
        this.location = location;
        this.type = type;
    }

    //getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //methods
    public void speak() {
        System.out.println("feed me");
    }

    //overrides
    @Override
    public String toString() {
        return "Pet{" +
                " age=" + age +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}//end Pet class
