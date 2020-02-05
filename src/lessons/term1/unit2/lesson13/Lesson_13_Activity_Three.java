package lessons.term1.unit2.lesson13;
/*
 * Lesson 13 Coding Activity 3
 * Input two integers and print the largest. If they are equal print "EQUAL".
 * You should be able to do this with only one if statement but you may use multiple else statements.
 */

import java.util.Scanner;

class Lesson_13_Activity_Three {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two integers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println(num1);
        } else if (num2 > num1) {
            System.out.println(num2);
        } else {
            System.out.println("EQUAL");
        }

    }
}
