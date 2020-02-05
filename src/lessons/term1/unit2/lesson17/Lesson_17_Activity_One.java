package lessons.term1.unit2.lesson17;
/*
 * Lesson 17 Coding Activity 1
 * Write a program that will input a list of test scores in from the keyboard.
 * When the user enters -1, print the average.
 *
 * What do you need to be careful about when using -1 to stop a loop?
 *
 *     Sample Run:
 *         Enter the Scores:
 *         45
 *         100
 *         -1
 *
 *         The average is: 72.5
 *
 *
 */

import java.util.Scanner;

class Lesson_17_Activity_One {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Scores:");

        int input = 0;
        int sum = 0;
        int count = 0;

        while (input != -1) {
            input = scan.nextInt();
            sum += input;
            count++;
        }

        sum++;
        count--;

        double avg = 1.0 * sum / count;
        System.out.println("\nThe average is " + avg);
    }
}
