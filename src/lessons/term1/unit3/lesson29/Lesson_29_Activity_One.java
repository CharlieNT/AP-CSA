package lessons.term1.unit3.lesson29;
/*
 * Lesson 29 Coding Activity 1
 * A student wants an algorithm to find the hardest spelling
 * word in a list of vocabulary. They define hardest by the longest word.
 * Write the code to find the longest word stored in an array of Strings called list.
 * If several words have the same length it should print the first word
 * in list with the longest length.
 * For example, if the following list were declared:
 *
 *     String list [] = {"high", "every", "nearing", "checking", "food ",
 *     "stand", "value",  "best", "energy", "add", "grand", "notation",
 *     "abducted", "food ", "stand"};
 *
 * It would print:
 *     checking
 */

class Lesson_29_Activity_One {
    // required line of code for coderunner (it said so)
    public static String[] list = {"high", "every", "nearing", "checking",
            "food ", "stand", "value", "best", "energy", "add", "grand",
            "notation", "abducted", "food ", "stand"};

    public static void main(String[] args) {
        int longest_loc = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[i].length() > list[longest_loc].length()) {
                longest_loc = i;
            }
        }

        System.out.println(list[longest_loc]);
    }
}
