package lessons.term1.unit1.lesson6;
/*
 * Lesson 6 Coding Activity Question 3
 *
 * Input a double and print the first two digits after the decimal point.
 *
 * Sample run:
 * 
 Please input a decimal number:
 57.8934
 Answer: 89
 
 * Hint - you will need to do a numeric cast and some division and/or subtraction.
 *
 */

import java.util.Scanner;

class Lesson_6_Activity_Three {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please input a decimal number:");
        double num = scan.nextDouble();

        num -= (int) num;
        num *= 100;

        System.out.println("Answer: " + (int) num);
    }
}
