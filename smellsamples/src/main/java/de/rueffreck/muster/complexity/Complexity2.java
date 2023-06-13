package de.rueffreck.muster.complexity;

public class Complexity2 {

    public int compute(int[] a, int b, int c) {
        if(a.length == 0) {
            return 0;
        }

        int f = 0;
        for (int d : a) {
            if(d <= 0) {
                return -1;
            }

            if(d > b) {
                int e = d + b;
                f += (e==c) ? d : e;
            } else if(d == c) {
                f += c/2;
            } else {
                f += d;
            }
        }
        return f;
    }
}
