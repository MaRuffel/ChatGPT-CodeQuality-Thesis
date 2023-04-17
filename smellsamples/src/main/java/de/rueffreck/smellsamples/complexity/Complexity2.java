package de.rueffreck.smellsamples.complexity;

public class Complexity2 {

    public int compute(int[] a, int b, int c) {
        if(a.length > 0) {
            int f = 0;
            for (int d : a) {
                if(d > 0) {
                    if(d > b) {
                        int e = d + b;
                        if(e == c) {
                            f += d;
                        } else {
                            f += e;
                        }
                    } else if(d == c) {
                        f += c/2;
                    } else {
                        f += d;
                    }
                } else {
                    return -1;
                }
            }
            return f;
        } else {
            return 0;
        }
    }
}
