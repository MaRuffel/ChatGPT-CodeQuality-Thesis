package de.rueffreck.gptgenerated.complexity6;

public class C63 {
    public int compute(int a, int b, int c) {
        if(a == 0 || c == 0) {
            return -1;
        }

        if(a == c) {
            if(b <= a) {
                return -1;
            } else if(b > c) {
                return b;
            } else {
                return a + b;
            }
        }

        int d = (a == b) ? b : b + 1;
        d = (d > c) ? c : d;

        int result = 0;
        for(int i = a; i < b; i++) {
            if(i % 2 == 0) {
                result += d + i;
                if(d == c) {
                    result += 1;
                }
            }
        }

        if(result == 0) {
            return -1;
        }

        return result;
    }

}
