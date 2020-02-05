package assignments.term1.assn3;
/*
 * Unit 2 - Assignment 3 - Crack the Code!
 *
 * This program asks the user to crack a code based on set conditions. In order
 * to crack the code, the user must input 3 integer numbers that satisfy the
 * following conditions:
 *  - The first number must be the number 3.
 *  - The second number can either be the number 1 or be between 33 and 100,
 *    inclusive.
 *  - The third number must be a positive number that is either evenly divisible
 *    by 3 or evenly divisible by 7.
 * As the user enters each number, the program checks whether or not the number
 * satisfies its respective requirement(s) listed above.
 *
 * For output, the program prints messages based on the user's progress and
 * answers.
 *
 * It is assumed that the user will enter integers when prompted.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] str) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("Hello " + name + ". Try your best to crack the code!");

        boolean failed = false;
        int userIn;

        // Phase 1
        System.out.println("\nPHASE 1");
        System.out.println("Enter a number:");
        userIn = scan.nextInt();
        if (userIn == 3) {
            System.out.println("Correct!");
        } else {
            failed = true;
        }
        // Phase 2
        if (!failed) {
            System.out.println("\nPHASE 2");
            System.out.println("Enter a number:");
            userIn = scan.nextInt();
            if ((userIn == 1) || (userIn >= 33 && userIn <= 100)) {
                System.out.println("Correct!");
            } else {
                failed = true;
            }
        }
        // Phase 3
        if (!failed) {
            System.out.println("\nPHASE 3");
            System.out.println("Enter a number:");
            userIn = scan.nextInt();
            if ((userIn > 0) && ((userIn % 3 == 0) || (userIn % 7 == 0))) {
                System.out.println("Correct!");
            } else {
                failed = true;
            }
        }

        if (failed) {
            System.out.println("Sorry, that was incorrect!");
            System.out.println("Better luck next time!");
        } else {
            System.out.println("You have cracked the code!");
        }

    }
}
