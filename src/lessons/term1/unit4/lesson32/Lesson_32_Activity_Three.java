package lessons.term1.unit4.lesson32;
/*
 * Lesson 32 Coding Activity 3
 *
 * For the Lesson 32 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods,
 * then paste everything into the code runner box. Your submission should
 * begin with the first import statement and end with the final }.
 *
 * Write a method that takes two integer parameters and prints them in reverse.
 *
 * This method must be called swap and should take two integer parameters.
 *
 * Calling swap(3, 7) would print 7 3.
 *
 */

import java.util.Scanner;

class Lesson_32_Activity_Three {
    public static void swap(int x, int y) {
        System.out.println(y + " " + x);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input1 = scan.nextInt();
        int input2 = scan.nextInt();
        swap(input1, input2);
    }
}
