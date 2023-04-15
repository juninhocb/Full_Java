package com.keywords.animals;

/**
 * extends [16], super [39]
 *
 */
public class Dog extends Animal {
    public Dog(String color) {
        super(color);
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("Im a Dog class!");
    }
}