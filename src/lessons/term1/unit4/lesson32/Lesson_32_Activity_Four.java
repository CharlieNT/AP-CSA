package lessons.term1.unit4.lesson32;
/*
 * Lesson 32 Coding Activity 4
 *
 * For the Lesson 32 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods,
 * then paste everything into the code runner box. Your submission should
 * begin with the first import statement and end with the final }.
 *
 * Write a method that accepts a number of seconds and prints the
 * correct number of hours, minutes and seconds.
 *
 * This method must be called realTime() and its parameter must be an integer.
 *
 * Calling realTime(6342) would print the following:
 *
 *      Hours: 1
 *      Minutes: 45
 *      Seconds: 42
 */

import java.util.Scanner;

class Lesson_32_Activity_Four {
    public static void realTime(int sec) {
        int hours = sec / 3600;
        sec %= 3600;
        int mins = sec / 60;
        sec %= 60;

        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + mins);
        System.out.println("Seconds: " + sec);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int seconds = scan.nextInt();
        realTime(seconds);
    }
}
