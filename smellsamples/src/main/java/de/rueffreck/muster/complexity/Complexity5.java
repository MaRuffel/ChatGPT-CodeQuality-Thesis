package de.rueffreck.muster.complexity;

public class Complexity5 {

    public int compute(int a, int b, int c) {
        int result = 0;
        if(a == 0 || c == 0) {
            return -1;
        }

        if(a != c) {
            int d = (a == b) ? b : b+1;
            if(d > c) {
                d = c;
            }
            for(int i = a; i < b; i++) {
                if(i%2 == 0) {
                    result += d + i;
                }
            }
        } else if(b > a) {
            result = b;
        } else if(a == b) {
            result = a+b;
        }

        return (result != 0) ? result : -1;
    }
}
