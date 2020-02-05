package lessons.term1.unit4.lesson35;
/*
 * Lesson 35 Coding Activity
 *
 * Write four overloaded methods called randomize. Each method will
 * return a random number based on the parameters that it receives:
 *
 * Write four overloaded methods called randomize.
 * Each method will return a random number based on the parameters that it receives:
 * randomize() - Returns a random int between min and max inclusive. Must have two int parameters.
 * randomize() - Returns a random int between 0 and max inclusive. Must have one int parameter.
 * randomize() - Returns a random double between min and max inclusive. Must have two double parameters.
 * randomize() - Returns a random double between 0 and max inclusive. Must have one double parameter.
 *
 * Because these methods are overloaded, they should be declared in the same class.
 * To simulate this, copy all four methods into the single Code Runner box.
 */

import java.util.Scanner;
import java.lang.Math;

class Lesson_35_Activity {

    //This method returns a random int between min and max inclusive.
    public static int randomize(int min, int max) {
        return ((int) (Math.random() * ((max - min) + 1) + min));
    }

    // Returns a random int between 0 and max inclusive.
    public static int randomize(int max) {
        return ((int) (Math.random() * (max + 1)));
    }

    //This method returns a random double between min and max inclusive.
    public static double randomize(double min, double max) {
        return (Math.random() * (max - min) + min);
    }

    //This method returns a random double between 0 and max inclusive.
    public static double randomize(double max) {
        return (Math.random() * max);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min;
        int max;
        double dmin;
        double dmax;

        //randomize(int min, int max)
        System.out.print("Enter an integer min: ");
        min = scan.nextInt();
        System.out.print("\nEnter an integer max: ");
        max = scan.nextInt();
        System.out.println("\nRandom integer between [" + min + "," + max + "]: " + randomize(min, max));
        System.out.println();

        //randomize(int max)
        System.out.print("\nEnter an integer max: ");
        max = scan.nextInt();
        System.out.println("\nRandom integer between [0," + max + "]: " + randomize(max));
        System.out.println();

        //randomize(double min, double max)
        System.out.print("Enter a decimal min: ");
        dmin = scan.nextDouble();
        System.out.print("\nEnter a decimal max: ");
        dmax = scan.nextDouble();
        System.out.println("\nRandom decimal between [" + dmin + "," + dmax + "]: " + randomize(dmin, dmax));
        System.out.println();

        //randomize(double max)
        System.out.print("\nEnter a decimal max: ");
        dmax = scan.nextDouble();
        System.out.println("\nRandom deciaml between [0.0," + dmax + "]: " + randomize(dmax));
        System.out.println();
    }
}
