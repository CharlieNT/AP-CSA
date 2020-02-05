package lessons.term1.unit3.lesson22;
/*
 * Lesson 22 Coding Activity 2
 * Write the code to take a String and print it diagonally.
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
 Use a tab character for every four spaces in the sample.
 
 Hint: You may need more than one loop.
 
 */

import java.util.Scanner;

class Lesson_22_Activity_Two {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scan.nextLine();

        int length = input.length();
        int counter = 0;
        String tab = "";

        while (counter != length) {
            System.out.println(tab + (input.charAt(counter)));
            counter++;
            tab += "\t";
        }
    }
}
