package assignments.term1.assn1;
/*
 * Assignment 1 - Movie Ratings
 *
 * This program aggregates a set of movie ratings for a film. The program
 * computes an overall movie rating as a weighted average of ratings from a
 * website, ratings given by a private focus group, and movie critic ratings.
 *
 * For input, the program accepts 3 ratings from a movie review website
 * (as ints), 2 ratings from a focus group (as doubles), and 1 average rating
 * from professional movie critics (as a double).
 *
 * The program outputs the average website rating, the average focus group
 * rating, the average movie critic rating, and the overall movie rating
 * (as doubles).
 *
 * It is assumed that the user will only enter integers for the first prompt.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] str) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter ratings from the movie review website.");
        int webNum1 = scan.nextInt();
        int webNum2 = scan.nextInt();
        int webNum3 = scan.nextInt();
        double webAvg = (double) (webNum1 + webNum2 + webNum3) / 3;

        System.out.println("\nPlease enter ratings from the focus group.");
        double focusNum1 = scan.nextDouble();
        double focusNum2 = scan.nextDouble();
        double focusAvg = (focusNum1 + focusNum2) / 2;

        System.out.println("\nPlease enter the average movie critic rating.");
        double crAvg = scan.nextDouble();

        double overallAvg = (webAvg * 0.2) + (focusAvg * 0.3) + (crAvg * 0.5);

        System.out.println("\nAverage website rating: " + webAvg);
        System.out.println("Average focus group rating: " + focusAvg);
        System.out.println("Average movie critic rating: " + crAvg);
        System.out.println("Overall movie rating: " + overallAvg);
    }
}
