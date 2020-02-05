package lessons.term1.unit1.lesson5;
/*
 * Lesson 5 Coding Activity Question 2
 *
 * Input four integer values and print the sum of all four values.
 *
 */

import java.util.Scanner;

class Lesson_5_Activity_Two {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter four integer values:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int num4 = scan.nextInt();
        System.out.println("Sum: " + (num1 + num2 + num3 + num4));

    }
}
