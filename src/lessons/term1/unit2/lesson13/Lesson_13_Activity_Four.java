package lessons.term1.unit2.lesson13;
/*
 * Lesson 13 Coding Activity 4
 * Input an integer grade from the keyboard and translate it to a letter grade.
 * For example, if a user enters 4, print "A", and if they enter 0 print "F."
 * You can assume that an integer between 0 and 4 will be input.
 */

import java.util.Scanner;

class Lesson_13_Activity_Four {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter and integer grade between 0 and 4:");
        int grade = scan.nextInt();

        if (grade == 4) {
            System.out.println('A');
        } else if (grade == 3) {
            System.out.println('B');
        } else if (grade == 2) {
            System.out.println('C');
        } else if (grade == 1) {
            System.out.println('D');
        } else {
            System.out.println('F');
        }

    }
}
