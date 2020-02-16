package com.vladis1350.bean;

public class Dog {
    private int age;
    private String color;
    private String name;

    public Dog() {

    }

    public Dog(int age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInformation() {
        System.out.println("Dog: Age => " + getAge() + " Name => " + getName() + " Color => " + getColor() + "\n");
    }
}
