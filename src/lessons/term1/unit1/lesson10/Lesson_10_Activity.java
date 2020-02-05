package lessons.term1.unit1.lesson10;
/*
 * Lesson 10 Coding Activity Question 1
 *
 * The following calculation will give roundoff error:
 *      double x = 1.473;
 *      System.out.println(2 - x);
 *
 * Write the code to correct it. You can assume no more than 3 decimal places will be used.
 *
 * Sample run:
 *
 *      Please enter two decimal values:
 *      2
 *      1.473
 *
 *      The difference is: 0.527
 *
 * Use this starter file as your template.
 *
 */

import java.util.Scanner;
import java.lang.Math;

class Lesson_10_Activity {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter two decimal values:");
        double value1 = scan.nextDouble();
        double value2 = scan.nextDouble();

        int temp1 = (int) Math.round(1000 * value1);
        int temp2 = (int) Math.round(1000 * value2);
        double difference = 1.0 * (temp1 - temp2) / 1000;

        System.out.println("The difference is: " + difference);

    }
}
