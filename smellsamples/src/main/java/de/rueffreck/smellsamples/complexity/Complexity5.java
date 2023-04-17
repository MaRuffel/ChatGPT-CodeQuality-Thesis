package de.rueffreck.smellsamples.complexity;

public class Complexity5 {

    public int compute(int a, int b, int c) {
        int result = 0;
        if(a != 0) {
            if(c != 0) {
                if(a != c) {
                    int d;
                    if(a == b) {
                        d = b;
                    } else {
                        d = b+1;
                    }
                    if(d > c) {
                        d = c;
                    }
                    for(int i = a; i < b; i++) {
                        if(i%2 == 0) {
                            result += d + i;
                        }
                    }
                } else {
                    if(b > a) {
                        if(b > c) {
                            result = b;
                        } else {
                            result = 0;
                        }
                    } else if(a == b) {
                        result = a+b;
                    }else {
                        result = 0;
                    }
                }
            } else {
                return -1;
            }
        } else {
            return -1;
        }

        if(result == 0) {
            return -1;
        } else {
            return result;
        }
    }
}
