package de.rueffreck.muster.complexity;

public class Nested1 {
    public int compute(int a, int b, int c) {
        boolean notNull = a != 0 && c != 0;
        if(notNull && a < b && a > c && a > b+c) {
            return 1;
        }
        return 0;
    }
}
