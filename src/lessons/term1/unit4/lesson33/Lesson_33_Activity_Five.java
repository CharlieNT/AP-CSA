package lessons.term1.unit4.lesson33;
/*
 * Lesson 33 Coding Activity 5
 *
 * For the Lesson 33 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods,
 * then paste everything into the code runner box. Your submission should
 * begin with the first import statement and end with the final }.
 *
 * For questions 2-5, you may want to start with the printIt method
 * and use it to test the other three.
 *
 * Write a method that takes an array of ints, an integer value,
 * and an integer index.The method should insert the value at the given
 * index and move the values afterwards by one.
 *
 * This method must be called insertValue() and must have the following
 * parameter types: int[], integer, integer.
 *
 * Calling insertValue(a, 100, 2) would change the array {1, 2, 3, 4, 5}
 * to {1, 2, 100, 3, 4}.
 */

class Lesson_33_Activity_Five {
    public static void insertValue(int[] list, int val, int pos) {
        for (int i = list.length - 1; i > pos; i--) {
            list[i] = list[i - 1];
        }
        list[pos] = val;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        insertValue(nums, 100, 2);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}