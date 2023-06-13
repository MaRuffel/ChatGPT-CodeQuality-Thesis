package de.rueffreck.muster.complexity;

public class Complexity4 {
    public int compute(int a, int b, int c) {
        if(a != 0) {
            if(a >= b) {
                return b;
            }
            if(a <= c) {
                return a;
            }
            if(c == 0) {
                return -1;
            }
            if(a > b+c) {
                return 1;
            }
        }

        if(b == 0) {
            return 1;
        }
        return 0;
    }
}
