package lessons.term1.unit1.lesson4;
/*
 * Lesson 4 Coding Activity Question 1
 * 
 * Input two doubles and print them backwards on the screen.
 *
 * So if the user enters:
 
 1.3 6.8
 
 * It should output:
 
 6.8 1.3
 
 * Notice there is exactly one space between the numbers.
*/

import java.util.Scanner;

class Lesson_4_Activity_One {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1;
        double num2;

        System.out.println("Enter 2 decimal numbers:");
        num1 = scan.nextDouble();
        num2 = scan.nextDouble();
        System.out.println(num2 + " " + num1);
    }
}
