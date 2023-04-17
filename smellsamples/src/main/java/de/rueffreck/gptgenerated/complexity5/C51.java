package de.rueffreck.gptgenerated.complexity5;

public class C51 {
    public int compute(int a, int b, int c) {
        if (a == 0 || c == 0) {
            return -1;
        }

        if (a == c) {
            if (b <= a) {
                return a + b;
            } else if (b <= c) {
                return b;
            } else {
                return -1;
            }
        }

        int d = (a == b) ? b : b + 1;
        d = Math.min(d, c);

        int result = 0;
        for (int i = a; i < b; i++) {
            if (i % 2 == 0) {
                result += d + i;
            }
        }

        return (result == 0) ? -1 : result;
    }

}
