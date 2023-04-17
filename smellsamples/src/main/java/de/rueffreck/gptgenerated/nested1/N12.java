package de.rueffreck.gptgenerated.nested1;

public class N12 {
    /**
     * Returns 1 if a is greater than b + c and c is not equal to 0, otherwise returns 0.
     * @param a The first integer to compare.
     * @param b The second integer to compare.
     * @param c The third integer to compare.
     * @return 1 if a is greater than b + c and c is not equal to 0, otherwise returns 0.
     */
    public int compute(int a, int b, int c) {
        if (a == 0) {
            // a cannot be equal to 0 for this method to return 1
            return 0;
        }
        if (a <= b) {
            // a must be greater than b for this method to return 1
            return 0;
        }
        if (a <= c) {
            // a must be greater than c for this method to return 1
            return 0;
        }
        if (c == 0) {
            // c cannot be equal to 0 for this method to return 1
            return 0;
        }
        return 1;
    }
}
