package assignments.term1.assn5;
/*
 * Unit 3 - Assignment 5 - Array Statistics
 *
 * This program receives a user-generated array and performs calculations on the
 * array to display statistics including average, range, and whether or not the
 * array is sorted
 *
 * The user inputs an integer for the length of the array, and then inputs a
 * double for each element in the array.
 *
 * The contents of the array, its average, its range, and its sorting status
 * are all printed to the console for the user to view.
 *
 * It is assumed that the user will input integers for the array length.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How long do you want the array?");
        int len = scan.nextInt();

        if (len <= 0) {
            System.out.println("Not a valid length!");
        } else {
            // initialize the array
            double[] array = new double[len];
            double sum = 0;
            double max = -Double.MAX_VALUE;
            double min = Double.MAX_VALUE;
            boolean increasing = true;
            boolean decreasing = true;

            for (int i = 0; i < len; i++) {
                System.out.println("Enter a number");
                array[i] = scan.nextDouble();
                sum += array[i];

                // determine max and min
                if (array[i] > max) {
                    max = array[i];
                }
                if (array[i] < min) {
                    min = array[i];
                }

                // determine sorting
                if (i > 0) {
                    // checking the element behind
                    if (array[i] < array[i - 1]) {
                        increasing = false;
                    }
                    if (array[i] > array[i - 1]) {
                        decreasing = false;
                    }
                }
            }

            // print the array and statistics
            System.out.print("Your array is {");
            for (int i = 0; i < len - 1; i++) {
                System.out.print(array[i] + ", ");
            }
            System.out.println(array[len - 1] + "}");
            System.out.println("The average is " + (sum / len));
            System.out.println("The range is " + (max - min));

            if (increasing) {
                System.out.println("The array is sorted in increasing order");
            } else if (decreasing) {
                System.out.println("The array is sorted in decreasing order");
            } else {
                System.out.println("The array is unsorted");
            }
        }
    }
}
