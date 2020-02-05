package lessons.term1.unit2.lesson17;
/*
 * Lesson 17 Coding Activity 2
 * Ask the user for two numbers. Print only the even numbers between them,
 * you should also print the two numbers if they are even.
 *
 *     Sample Run 1:
 *
 *         Enter two numbers:
 *         3
 *         11
 *
 *         4 6 8 10
 *
 *    Sample Run 2:
 *
 *         Enter two numbers:
 *         10
 *         44
 *
 *         10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44
 *
 *
 */

import java.util.Scanner;

class Lesson_17_Activity_Two {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println();

        if (num1 < num2) {
            while (num1 <= num2) {
                if ((num1 % 2) == 0) {
                    System.out.print(num1 + " ");
                }
                num1++;
            }
        } else if (num2 > num1) {
            while (num2 >= num1) {
                if ((num2 % num1) == 0) {
                    System.out.print(num2 + " ");
                }
                num2--;
            }

        }
    }
}
