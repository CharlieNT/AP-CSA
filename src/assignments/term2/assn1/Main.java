package assignments.term2.assn1;
/*
This program utilizes the fraction class. The class makes it so that the user can create a fraction and perform actions
on the created fractions.

To test the class, the user inputs various integers to test the methods of the fraction class.
The program outputs the method call results.
It is assumed that the user will follow the instructions onscreen and input integers when prompted.

 */

class Main {
    public static void main(String[] str) {
        Fraction fraction1 = new Fraction(7, 4);
        System.out.println("Fraction 1: " + fraction1);
        System.out.println("As a mixed number: " + fraction1.mixedNumber());
        System.out.println();

        Fraction fraction2 = new Fraction();
        System.out.println("Fraction 2: " + fraction2);
        System.out.println("As a mixed number: " + fraction2.mixedNumber());
        System.out.println();

        Fraction fraction3 = new Fraction(2, 7);
        System.out.println("Fraction 3: " + fraction3);
        System.out.println("As a mixed number: " + fraction3.mixedNumber());
        fraction3.add(2, 5);
        System.out.println("Add 2/5: " + fraction3);
        System.out.println();

        Fraction fraction4 = new Fraction(24, 6);
        System.out.println("Fraction 4: " + fraction4);
        System.out.println("As a mixed number: " + fraction4.mixedNumber());
        fraction4.add(1, -2);
        System.out.println("Attempt to add 1/-2: " + fraction4);
        System.out.println();

        Fraction fraction5 = new Fraction(5, 2);
        System.out.println("Fraction 5: " + fraction5);
        System.out.println("As a mixed number: " + fraction5.mixedNumber());
        fraction5.add(2, 3);
        System.out.println("Add 2/3: " + fraction5);
        System.out.println("As a mixed number: " + fraction5.mixedNumber());
        System.out.println();

    }
}
