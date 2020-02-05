package lessons.term1.unit3.lesson30;
/*
 * Lesson 30 Coding Activity
 * Due to a problem with a scanner an array of words was created
 * with spaces in incorrect places. Write the code to process the
 * list of words and trim any spaces out of the words.
 *
 * So if the list contains:
 *      {"every", " near ing ", " checking", "food ", "stand", "value "}
 *
 * It should be changed to hold:
 *      {"every", "nearing", "checking", "food", "stand", "value"}
 *
 * Note that this activity does not require you to print anything.
 * Your code should end with the array list still declared and
 * containing the resulting words.
 *
 */

class Lesson_30_Activity {
    /*
     * Your code should end with the following array modified as the
     * instructions above specify. You may modify the elements in
     * this list but make sure you do not add or remove anything from it.
     */
    public static String[] list = {};

    public static void main(String[] args) {
        String temp = "";

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length(); j++) {
                // if the character is not a space, add it to a temporary variable
                if (!(list[i].charAt(j) == ' ')) {
                    temp += list[i].charAt(j);
                }
            }
            // assign the index to the new variable, which has no spaces
            list[i] = temp;
            temp = "";
        }
    }
}
