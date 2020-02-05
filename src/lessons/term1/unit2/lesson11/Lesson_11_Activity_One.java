package lessons.term1.unit2.lesson11;
/*
 * Lesson 11 Coding Activity 1
 * Test if an integer input from the keyboard is equal to the integer 176.
 * If it is, print "YES" (without the quotes).
 */

import java.util.Scanner;

class Lesson_11_Activity_One {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer that may be 176:");
        int num = scan.nextInt();

        if (num == 176) {
            System.out.println("YES");
        }

    }
}
