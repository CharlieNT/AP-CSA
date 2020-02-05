package assignments.term1.assn2;
/*
 * Unit 1 - Assignment 2 - Time converter
 *
 * This program calculates the date based on a given Unix timestamp. The Unix
 * timestamp is a system for tracking the age of files using the number of
 * seconds that have occurred since the Unix epoch at 12:00:00 AM on January
 * 1st, 1970. We will be assuming there are always 30 days per month
 * (360 days a year) to simplify the calculation.
 *
 * For input the program accepts an integer number of seconds to convert.
 *
 * The program outputs the year, month, day, hour, and seconds based on the user
 * input.
 *
 * To simplify calculations, it is assumed that there are 30 days per month.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] str) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Seconds since Unix epoch:");
        int total_sec = scan.nextInt();
        int remainder;

        // Determine years
        int year = 1970 + total_sec / (60 * 60 * 24 * 30 * 12);
        remainder = total_sec % (60 * 60 * 24 * 30 * 12);

        // Determine months
        int month = remainder / (60 * 60 * 24 * 30);
        remainder = remainder % (60 * 60 * 24 * 30);

        //Determine days
        int day = remainder / (60 * 60 * 24);
        remainder = remainder % (60 * 60 * 24);

        //Determine hours
        int hour = remainder / (60 * 60);
        remainder = remainder % (60 * 60);

        //Determine minutes
        int min = remainder / (60);
        remainder = remainder % (60);

        //Remainder in seconds
        int sec = remainder;

        System.out.println("\nYear: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Min: " + min);
        System.out.println("Sec: " + sec);
    }
}
