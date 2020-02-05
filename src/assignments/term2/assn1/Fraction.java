package assignments.term2.assn1;
/*
 * Term 2 Assignment 1 - Fraction
 * A class which is used to represent fractions
 *
 * This class supports the representation of fractions as mixed numbers, and fraction addition.
 */

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        this(1, 1);
    }

    public Fraction(int n, int d) {
        if (n > 0) {
            numerator = n;
        } else {
            numerator = 1;
        }
        if (d > 0) {
            denominator = d;
        } else {
            denominator = 1;
        }
    }

    public String toString() {
        return "" + numerator + "/" + denominator;
    }

    public String mixedNumber() {
        if (numerator % denominator == 0) {
            return "" + (numerator / denominator);
        } else if (numerator >= denominator) {
            int w = numerator / denominator;
            int n = numerator % denominator;
            return "" + w + " " + n + "/" + denominator;
        } else {
            return "" + numerator + "/" + denominator;
        }
    }

    public void add(int n, int d) {
        if (n > 0 && d > 0) {
            numerator = (numerator * d) + (n * denominator);
            denominator *= d;
        }
    }
}
