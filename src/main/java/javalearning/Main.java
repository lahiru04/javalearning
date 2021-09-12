/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning;

import java.util.ArrayList;
import java.util.HashMap;
import javalearning.model.Animal;
import javalearning.model.Bat;
import javalearning.model.Dog;
import javalearning.model.Square;

/**
 *
 * @author prasa
 */
public class Main {

    static String firstName = "saman";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String firstName = "Lahiru ";
        String lastName = "Prasanna";

        String school = "Ananda collage";

        String fullName = firstName + lastName;

        double height = 165.5; //in cm

        int intHeight = (int) height;

        System.out.println("height is " + height);
        System.out.println("new height is " + intHeight);

        int result = 36 % 5;

        // 
        System.out.println("result is " + result);

        System.out.println("name is " + firstName.toUpperCase());
        System.out.println("his name is  \"dilshan\" \n xxx");

        double sq = 144;

        double x = Math.sqrt(sq);

        System.out.println("Squre root of " + sq + " is " + x);

        if (height > 180) {

            System.out.println("He is a tall guy");
        } else if (height > 165) {
            System.out.println("He has a medium height");
        } else {
            System.out.println("He is a short guy");
        }

        int value = 10;
        switch (value) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
                break;
        }

        for (int i = 0; i < 10; i++) {

            //  System.out.println("value is " + i);
        }

        int j = 10;
        while (j < 20) {
            //  System.out.println("value is " + j);
            j++;
        }

        do {
         //   System.out.println("value is " + j);
            j--;
        } while (j > 5);
        String[] words = {"my", "name", "is"};

        System.out.println(words[0]);
        System.out.println("size of the array is"+words.length);
        
        
        Animal dog = new Dog("x");
        dog.makeSound();
        
        Square square = new Square(5);
        
        double area = square.getArea();
        
        System.out.println("Area of "+square.printName()+" is "+area);
        
        
        Bat bat = new Bat();
        bat.doFly();
        
        
        ArrayList<Dog> dogs = new ArrayList();
        
        dogs.add(new Dog("tommy"));
        dogs.add(new Dog("blacky"));
        dogs.add(new Dog("brown"));
        dogs.add(new Dog("lassie"));
        
        
        
       /// dogs.get(0)
        
        
     //   dogs.size()
        
        
        for(Dog d:dogs)
        {
            d.printName();
        }
        
        
        HashMap<String,Integer> hashMap = new HashMap<>();
        
        hashMap.put("stuid", 12);
        hashMap.put("stuid", 14);
        
        
        System.out.println("val is "+hashMap.get("stuid"));
        
    }

}
