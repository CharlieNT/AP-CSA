package lessons.term1.unit1.lesson3;/*
 * Lesson 3 Coding Activity Question 2
 * 
 * Write a program that asks the user for three names, then prints the names in reverse order.
 * 
 * Sample Run:

Please enter three names:
Zoey 
Zeb 
Zena 

Zena Zeb Zoey

*/

import java.util.Scanner;

class Lesson_3_Activity_Two {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name1;
        String name2;
        String name3;

        System.out.println("Please enter three names:");
        name1 = scan.nextLine();
        name2 = scan.nextLine();
        name3 = scan.nextLine();
        System.out.println("\n" + name3 + " " + name2 + " " + name1);

    }
}
