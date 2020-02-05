package lessons.term1.unit3.lesson1011;
/*
 * Lesson 30 1/2 Coding Activity
 *
 * For this program you will input an int to represent the octal number
 * and translate to the base ten number. The octal number must be 8 digits or less.
 *
 * Your program should also check that all the digits are 0 - 7, then translate the
 * number to base ten.
 *
 * Sample Run 1:
 * Enter a number in base 8:
 * 1287
 * ERROR: Incorrect Octal Format
 *
 * Sample Run 2:
 * Enter a number in base 8:
 * 123
 * 83
 *
 * Sample Run 3:
 * Enter a number in base 8:
 * 1111111111
 * ERROR: Incorrect Octal Format
 *
 */

import java.util.Scanner;
import java.lang.Math;

class Lesson_1011_Activity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number in base 8:");
        int octal_num = scan.nextInt();

        String octal_str = "" + octal_num;

        int base_ten = 0;

        // check the number of digits
        if (octal_str.length() > 8) {
            System.out.println("ERROR: Incorrect Octal Format");
        } else {
            // convert the octal to base 10. If any digit is greater than 7,
            // stop and print error message
            int digit;
            boolean flag = false;

            for (int i = 0; i < octal_str.length(); i++) {
                digit = (int) ((octal_num / Math.pow(10, i)) % 10);
                if (digit <= 7) {
                    base_ten += digit * Math.pow(8, i);
                } else {
                    i = octal_str.length();
                    flag = true;
                }
            }

            if (flag) {
                System.out.println("ERROR: Incorrect Octal Format");
            } else {
                System.out.println(base_ten);
            }
        }
    }
}
