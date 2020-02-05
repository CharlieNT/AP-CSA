package lessons.term1.unit2.lesson13;
/*
 * Lesson 13 Coding Activity 5
 * Create a program to let the user practice their multiplication tables.
 * Print two random integers between 1 and 12 each on a new line.
 * Then, ask the user to input the multiplication of the two numbers.
 * If they enter the correct product print "Correct!" otherwise print "Wrong".
 */

import java.util.Scanner;
import java.lang.Math;

class Lesson_13_Activity_Five {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int min = 1;
        int max = 12;

        int rand1 = (int) (Math.random() * ((max - min) + 1)) + min;
        int rand2 = (int) (Math.random() * ((max - min) + 1)) + min;
        int ans = rand1 * rand2;

        System.out.println(rand1 + "\n" + rand2);
        System.out.println("Multiply the numbers. What is the answer?");

        int guess = scan.nextInt();
        if (guess == ans) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong");
        }
    }
}
