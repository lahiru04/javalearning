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
public class Square extends Shape {

    private int r = 5;

    public Square(int r) {
        this.r = r;
    }

    @Override
    public double getArea() {

        double area = r * r;
        return area;

    }

    @Override
    public String printName() {
         return "Square";
    }
    
    
    

}
