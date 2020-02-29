package lessons.term1.unit1.lesson3;/*
 * Lesson 3 Coding Activity Question 1
 * 
 * Write the code to ask the user to enter their name and print the following message:

Hi ______, nice to see you.
 
 * Remember, you'll need to use the method println and Scanner class method nextLine.
*/

import java.util.Scanner;

class Lesson_3_Activity_One {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;

        System.out.println("Please enter your full name.");
        name = scan.nextLine();
        System.out.println("Hi " + name + ", nice to see you.");
    }
}
