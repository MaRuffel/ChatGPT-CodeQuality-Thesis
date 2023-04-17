package de.rueffreck.smellsamples.complexity;

public class Nested1 {
    public int compute(int a, int b, int c) {
        if(a != 0) {
            if(a < b) {
                if(a > c) {
                    if(c != 0) {
                        if(a > b+c) {
                            return 1;
                        }
                    }
                }
            }
        }
        return 0;
    }
}
