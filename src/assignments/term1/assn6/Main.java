package assignments.term1.assn6;
/*
 * Unit 3 - Assignment 6 - Merge Arrays
 *
 * This program merges two arrays of random positive integers between 1 and 100
 * and removes any duplicate entries.
 *
 * For input, the user enters an array length that must be 10 or greater.
 *
 * For output, the the program prints the original two arrays, and then prints
 * the corresponding merged array.
 *
 * It is assumed that the user will enter an integer when prompted for array
 * length.
 */

import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // CREATE THE TWO ARRAYS
        int len = 0;
        while (len < 10) {
            System.out.println("Enter an array length (must be 10 or greater):");
            len = scan.nextInt();
            System.out.println();
        }

        int[] array1 = new int[len];
        int[] array2 = new int[len];

        for (int i = 0; i < len; i++) {
            array1[i] = (int) (Math.random() * 100) + 1; // [1, 101)
            array2[i] = (int) (Math.random() * 100) + 1; // [1, 101)
        }

        // PRINT THE ARRAYS
        System.out.print("First Array:");
        for (int i = 0; i < len; i++) {
            System.out.print(" " + array1[i]);
        }
        System.out.println("\n");
        System.out.print("Second Array:");
        for (int i = 0; i < len; i++) {
            System.out.print(" " + array2[i]);
        }
        System.out.println("\n");

        //MERGE THE ARRAYS
        int[] merge = new int[len * 2];
        int fillPos = 0;
        // loop through each element of the original arrays
        for (int i = 0; i < len; i++) {
            // only add values if they are not already in merge array
            boolean flag = false;
            for (int j = 0; j < fillPos; j++) {
                if (merge[j] == array1[i]) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                merge[fillPos] = array1[i];
                fillPos++;
            }

            flag = false;

            for (int j = 0; j < fillPos; j++) {
                if (merge[j] == array2[i]) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                merge[fillPos] = array2[i];
                fillPos++;
            }
        }

        System.out.println("\n");
        System.out.print("Merged Array: ");
        for (int i = 0; i < fillPos; i++) {
            System.out.print(merge[i] + " ");
        }
    }
}
