package de.rueffreck.smellsamples.complexity;

public class Complexity4 {
    public int compute(int a, int b, int c) {
        if(a != 0) {
            if(a < b) {
                if(a > c) {
                    if(c != 0) {
                        if(a > b+c) {
                            return 1;
                        }
                    } else {
                        return -1;
                    }
                } else {
                    return a;
                }
            } else {
                return b;
            }
        }

        if(b == 0) {
            return 1;
        }
        return 0;
    }
}
