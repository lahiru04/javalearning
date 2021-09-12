/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.model;

/**
 *
 * @author prasa
 */
public class Dog extends Animal {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("bow wow");
    }

    public void printName() {
        System.out.println("my name is"+name);
    }
}
