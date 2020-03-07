package assignments.term2.assn4;

/**
 * Term 2 Assignment 1 - Fraction
 * <p>
 * A class which is used to represent positive fractions.
 * It stores a numerator and denominator and can be represented
 * as a mixed number or improper fraction. It also functionality
 * for adding two fractions together.
 */
public class Fraction {
    private int numerator;
    private int denominator;

    /**
     * Default constructor. Fraction = 1/1
     */
    public Fraction() {
        numerator = 1;
        denominator = 1;
    }

    /**
     * Normal Fraction constructor
     *
     * @param n numerator of the fraction. If not positive, this is set to 0.
     * @param d denominator of the fraction. If not positive, this is set to 0.
     */
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
        simplify();
    }

    /**
     * Uses the Euclidean algorithm to find the gcd of a and b.
     *
     * @param a first factor.
     * @param b second factor.
     * @return gcd of a and b.
     */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    /**
     * Adds fraction to another specified fraction. Both fractions must be positive.
     *
     * @param n Numerator of fraction to be added.
     * @param d Denominator of fraction to be added.
     */
    public void add(int n, int d) {
        if (n > 0 && d > 0) {
            numerator = numerator * d + n * denominator;
            denominator *= d;
            simplify();
        }
    }

    /**
     * Reduces the fraction to simplest form.
     */
    public void simplify() {
        int divisor = gcd(numerator, denominator);
        numerator /= divisor;
        denominator /= divisor;
    }

    /**
     * Overrides the method in the Comparable interface.
     * Returns a value telling if fraction is greater than, less than, or equal to other fraction.
     *
     * @param object Object input fraction.
     * @return Greater than input: 1. Less than input: -1. Equal to input: 0.
     */
    public int compareTo(Object object) {
        Fraction fraction = (Fraction) object;
        double value1 = (double) numerator / denominator;
        double value2 = (double) fraction.numerator / fraction.denominator;
        if (value1 > value2) {
            return 1;
        } else if (value2 > value1) {
            return -1;
        }
        return 0;
    }

    /**
     * Allows the fraction to be represented as a mixed number.
     *
     * @return String version of the fraction: "[whole number] [numerator]/[denominator]"
     */
    public String mixedNumber() {
        int whole = 0;
        while (numerator >= denominator) {
            numerator -= denominator;
            whole++;
        }
        if (whole == 0) {
            return numerator + "/" + denominator;
        } else if (numerator > 0) {
            return "" + whole + " " + numerator + "/" + denominator;
        }
        return "" + whole;
    }

    /**
     * Allows the fraction to be represented as a string. (Improper fraction format)
     *
     * @return String version of the fraction: "[numerator]/[denominator]"
     */
    public String toString() {
        return "" + numerator + "/" + denominator;
    }
}
