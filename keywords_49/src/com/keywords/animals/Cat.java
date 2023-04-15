package com.keywords.animals;

public class Cat extends Animal{
    public Cat(String color) {
        super(color);
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("Im a Cat class!");
    }
}