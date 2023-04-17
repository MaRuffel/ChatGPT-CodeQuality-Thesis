package de.rueffreck.smellsamples.complexity;

public class Complexity1 {

    public int compute(int a, int b, int c, int d) {
        if(a > 1) {
            if(b != 0) {
                int e = a + b;
                if(e >= 4) {
                    if(c > e) {
                        int f = c - e;
                        int g = 0;
                        if(f == 1) {
                            g = d;
                        } else if(f == 2) {
                            g = d+e;
                        } else if(f == 3) {
                            if(a == c) {
                                g = a+c;
                            } else {
                                g = a;
                            }
                        } else if(f == 4) {
                            g = b;
                        } else if(f == 5) {
                            g = 1;
                        } else {
                            g = -1;
                        }

                        return g;
                    }
                }
            } else {
                return 0;
            }
        } else {
            return a;
        }

        return -1;
    }
}
