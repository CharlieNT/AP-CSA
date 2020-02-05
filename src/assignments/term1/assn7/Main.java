package assignments.term1.assn7;
/*
 * Assignment 7 - Methods Sampler Platter
 *
 * This program uses three different methods to do three different things. The
 * methods and their functions are as follows:
 *
 *   1. duplicate: accepts one parameter of type String (named “str”). The
 *   method returns a String with every character in str repeated n times,
 *   where n is the length of str if str has an odd number of characters and
 *   n is double the length of str if str has an even number of characters.
 *
 *   2. isEdhesivePalindrome: accepts a parameter of type String (named “str”)
 *   and returns true if str is an "Edhesive Palindrome,” and false otherwise.
 *   An Edhesive Palindrome must meet the following requirements:
 *
 *     1. The String parameter str must read the same backward as forwards.
 *     2. The following characters are equivalent:
 *         a ~ 4
 *         e ~ 3
 *         o ~ 0
 *     3. The String parameter str must be of length greater than 3 and less
 *     than 15.
 *
 *     If anyone of these 3 requirements is NOT satisfied, then the String
 *     parameter str is NOT considered an Edhesive Palindrome, and the method
 *     returns false. If all 3 requirements are satisfied, then the method
 *     returns true.
 *
 *   3. numberScramble: accepts one parameter of type double (named “num”) and
 *   returns a value of type double. If the input parameter is less than 0, it
 *   returns 0.0. Otherwise, the following mathematical operations are
 *   performed on the parameter before returning:
 *
 *     1. add 5 to num
 *     2. divide num by 2
 *     3. square root num
 */

import java.util.Scanner;
import java.lang.Math;

//NOTE: I USED GOOGLE'S JAVA STYLE GUIDE FOR THIS PROJECT
class Main {
    public static String duplicate(String str) {
        //returns a string with characters repeated (n) times
        String newstr = "";
        if (str.length() % 2 == 1) {
            //repeats each character (length) times
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < str.length(); j++) {
                    newstr += str.charAt(i);
                }
            }
        } else {
            //repeats each character (length * 2) times
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < str.length() * 2; j++) {
                    newstr += str.charAt(i);
                }
            }
        }
        return newstr;
    }

    public static boolean isEdhesivePalindrome(String str) {
        //returns whether or not str is an Edhesive Palindrome. Length must be between 3 and 15.
        if (str.length() < 3 || str.length() > 15) {
            return false;
        } else {
            //format the string
            String formatstr = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '4' || str.charAt(i) == 'A') {
                    formatstr += 'a';
                } else if (str.charAt(i) == '3' || str.charAt(i) == 'E') {
                    formatstr += 'e';
                } else if (str.charAt(i) == '0' || str.charAt(i) == 'O') {
                    formatstr += 'o';
                } else {
                    formatstr += str.charAt(i);
                }
            }
            formatstr = formatstr.toLowerCase();

            //check for palindrome
            int len = formatstr.length();
            for (int i = 0; i < len / 2; i++) {
                if (formatstr.charAt(i) != formatstr.charAt(len - 1 - i)) {
                    return false;
                }
            }
            //if the string passes all tests, it is a palindrome
            return true;
        }
    }

    public static double numberScramble(double num) {
        //returns (add 5 to num, divide num by 2, sqrt num)
        if (num < 0) {
            return 0.0;
        } else {
            num += 5;
            num /= 2;
            num = Math.sqrt(num);
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Methods Sampler Platter. Please enter a String to duplicate.");
        String str = scan.nextLine();
        System.out.println("The duplicated String is: " + duplicate(str));

        System.out.println("Next, please enter a String to check for Edhesive Palindromes.");
        String pal = scan.nextLine();
        if (isEdhesivePalindrome(pal)) {
            System.out.println("Nice, you found an Edhesive Palindrome!");
        } else {
            System.out.println("Too bad, that isn't an Edhesive Palindrome.");
        }

        System.out.println("Almost done! Please enter a number to scramble.");
        double num = scan.nextDouble();
        System.out.println("The scrambled number is: " + numberScramble(num));
    }
}
