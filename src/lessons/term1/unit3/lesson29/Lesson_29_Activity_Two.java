package lessons.term1.unit3.lesson29;
/*
 * Lesson 29 Coding Activity 2
 * Write a loop that processes an array of strings.
 * Each String should be printed backwards on its own line.
 *
 * For example, if the list contains:
 *
 *     {"every", "nearing", "checking", "food", "stand", "value"}
 *
 * It should output:
 *     yreve
 *     gniraen
 *     gnikcehc
 *     doof
 *     dnats
 *     eulav
 */

class Lesson_29_Activity_Two {
    // required line of code for coderunner because it said so
    public static String[] list = {"every", "nearing", "checking", "food", "stand", "value"};

    public static void main(String[] args) {
        for (int i = 0; i < list.length; i++) {
            for (int j = list[i].length() - 1; j >= 0; j--) {
                System.out.print(list[i].charAt(j));
            }
            System.out.println();
        }
    }
}
