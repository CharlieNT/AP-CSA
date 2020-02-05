package lessons.term1.unit2.lesson12;
/*
 * Lesson 12 Coding Activity 3
 * Test if a number input from the keyboard is a valid
 * test score (between 0 and 100 inclusive).
 *
 *     Sample Run 1
 *         Enter a test score:
 *         78.5
 *         Valid
 *
 *
 *      Sample Run 2
 *         Enter a test score:
 *         179
 *         Not Valid
 *
 */

import java.util.Scanner;

class Lesson_12_Activity_Three {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a test score:");
        double score = scan.nextDouble();

        if (0 <= score) {
            if (score <= 100) {
                System.out.println("Valid");
            }
        }
        if (score < 0) {
            System.out.println("Not Valid");
        }
        if (score > 100) {
            System.out.println("Not Valid");
        }

    }
}
