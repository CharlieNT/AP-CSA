package assignments.term1.assn4;
/*
 * Unit 3 - Assignment 4 - String Shortener
 *
 * This program takes a message as a string from the user and shortens it based
 * on a set of rules.
 *
 * The rules are as follows:
 * - The message should be converted to lowercase
 * - Every vowel should be removed unless it is at the start of a word
 * - Every repeated non-vowel character should be removed
 *
 * At the end of the program the shortened message is output to the screen,
 * along with the number of vowels removed, the number of repeated non-vowel
 * characters removed, and how much shorter the shortened message is than the
 * original message.
 *
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the message to be shortened");
        String msg = scan.nextLine();

        if (msg.length() < 10) {
            System.out.println("\nThis doesn’t need shortening!");
        } else {
            msg = msg.toLowerCase();
            String result = "";

            int vowels = 0;
            int repeats = 0;

            int i = 0;
            while (i < msg.length()) {
                if ((i != 0) && (msg.charAt(i - 1) != ' ') &&
                        ((msg.charAt(i) == 'a') ||
                                (msg.charAt(i) == 'e') ||
                                (msg.charAt(i) == 'i') ||
                                (msg.charAt(i) == 'o') ||
                                (msg.charAt(i) == 'u'))) {
                    vowels++;
                } else if (i > 0 && msg.charAt(i) == msg.charAt(i - 1)) {
                    repeats++;
                } else {
                    result += msg.charAt(i);
                }

                i++;
            }

            System.out.println("\nShortened message: " + result);
            System.out.println("Repeated letters removed: " + repeats);
            System.out.println("Vowels removed: " + vowels);
            System.out.println("Total characters saved: " + (msg.length() - result.length()));
        }
    }
}
