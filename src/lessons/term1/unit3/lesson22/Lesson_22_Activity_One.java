package lessons.term1.unit3.lesson22;
/*
 * Lesson 22 Coding Activity 1
 * Write the code to take a String and print it with one letter per line.
 * 
 Sample run:
 
 Enter a string:
 bought
 b
 o
 u
 g
 h
 t
 
 */

import java.util.Scanner;

class Lesson_22_Activity_One {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scan.nextLine();

        int length = input.length();
        int counter = 0;
        while (counter != length) {
            System.out.println(input.charAt(counter));
            counter++;
        }
    }
}
