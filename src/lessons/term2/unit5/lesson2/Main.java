package lessons.term2.unit5.lesson2;
/*
 * Lesson 2 - Unit 5 - The For-Each Loop
 */

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> wordList = new ArrayList<String>();

        System.out.println("Please enter words, enter STOP to stop the loop.");
        String input = "";
        boolean running = true;
        while (running) {
            input = scan.nextLine();
            if (input.equals("STOP")) {
                running = false;
            } else {
                wordList.add(input);
            }
        }
        System.out.println();

        for (String s : wordList) {
            if (s.indexOf('a') != -1) {
                System.out.println(s);
            }
        }
    }
}
