package lessons.term2.unit5.lesson1;
/*
 * Lesson 1 - Unit 5 - ArrayList
 */

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> strList = new ArrayList<String>();

        System.out.println("Please enter words, enter STOP to stop the loop.");

        // user input
        String input = "";
        boolean running = true;
        while (running) {
            input = scan.nextLine();
            if (input.equals("STOP")) {
                running = false;
            } else {
                strList.add(input);
            }
        }
        // ouput list data
        System.out.println(strList.size());
        System.out.println(strList);
        // remove first and last elements
        if (strList.size() > 2) {
            strList.remove(0);
            strList.remove(strList.size() - 1);
        }
        System.out.println(strList);
    }
}
