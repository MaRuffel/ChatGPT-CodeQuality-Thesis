package de.rueffreck.gptgenerated.complexity1;

public class C12 {
    public int compute(int a, int b, int c, int d) {
        if (a <= 1) {
            return a;
        }

        if (b == 0) {
            return 0;
        }

        int e = a + b;

        if (e < 4 || c <= e) {
            return -1;
        }

        int f = c - e;
        int g = -1;

        switch (f) {
            case 1:
                g = d;
                break;
            case 2:
                g = d + e;
                break;
            case 3:
                g = (a == c) ? a + c : a;
                break;
            case 4:
                g = b;
                break;
            case 5:
                g = 1;
                break;
        }

        return g;
    }

}
