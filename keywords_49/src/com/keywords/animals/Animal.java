package com.keywords.animals;

/**
 * abstract[1], protected [33], this [42], private [32], return [35], void [47]
 *
 */
public abstract class Animal {
    private String color;

    protected Animal(String color){
        this.color = color;
    }
    public void speak(){
        System.out.print("Hello! ");
    }
    public String getColor(){
        return this.color;
    }

}
