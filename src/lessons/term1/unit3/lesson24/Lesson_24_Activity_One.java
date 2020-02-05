package lessons.term1.unit3.lesson24;
/*
 * Lesson 24 Coding Activity 1
 * Use a for loop to print all of the numbers from 23 to 89, with 10 numbers on each line.
 * Print one space between each number.
 */

class Lesson_24_Activity_One {
    public static void main(String[] args) {
        int newline = 1;
        for (int i = 23; i <= 89; i++) {
            System.out.print(i + " ");
            if (newline % 10 == 0) {
                System.out.println();
            }
            newline++;
        }
    }
}
