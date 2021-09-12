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
public class Bat extends Mammal implements Flyable{

    @Override
    public void doFly() {
        System.out.println("I'm Flying");
    }
    
}
