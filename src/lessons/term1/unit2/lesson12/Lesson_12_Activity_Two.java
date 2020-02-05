package lessons.term1.unit2.lesson12;
/*
 * Lesson 12 Coding Activity 2
 * Input two decimal numbers and print the largest.
 * If the numbers are equal, print one of them.
 *
 *     Sample Run 1
 *        Please enter two numbers:
 *        45.7
 *        45.1
 *
 *        Largest is: 45.7
 *
 *      Sample Run 2
 *        Please enter two numbers:
 *        14
 *        14
 *
 *        Largest is: 14.0
 *
 */

import java.util.Scanner;

class Lesson_12_Activity_Two {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter two numbers:");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();

        if (num1 > num2) {
            System.out.println("Largest is: " + num1);
        }
        if (num2 > num1) {
            System.out.println("Largets is: " + num2);
        }
        if (num1 == num2) {
            System.out.println("Largest is: " + num1);
        }

    }
}
