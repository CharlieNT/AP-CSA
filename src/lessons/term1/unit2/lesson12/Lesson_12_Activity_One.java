package lessons.term1.unit2.lesson12;/*
 * Lesson 12 Coding Activity 1
 * Write a program to input three integers.
 * Test if the average is greater than or equal to 89.5.
 * If so, print out the phrase "ABOVE AVERAGE" (without the quotes).
 */

import java.util.Scanner;

class Lesson_12_Activity_One {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 3 integers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        double avg = (double) (num1 + num2 + num3) / 3;
        System.out.println("AVERAGE: " + avg);

        if (avg >= 89.5) {
            System.out.println("ABOVE AVERAGE");
        }
    }
}
