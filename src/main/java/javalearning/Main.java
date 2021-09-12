/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning;

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

        String[] words = school.split(" ");

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

            System.out.println("value is " + i);
        }
        

        int j = 10;
        while(j<20)
        {
         System.out.println("value is " + j);
         j++;
        }

    }

}
