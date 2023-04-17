package de.rueffreck.gptgenerated.complexity6;

public class C62 {
    public int compute(int a, int b, int c) {
        if (a == 0 || c == 0) {
            return -1;
        }

        int result = 0;
        int d = (a == b) ? b : b + 1;
        d = Math.min(d, c);

        switch (Integer.compare(a, c)) {
            case -1:
                for (int i = a; i < b; i++) {
                    if (i % 2 == 0) {
                        result += d + i;
                        if (d == c) {
                            result += 1;
                        }
                    }
                    if (d == c) {
                        result += 1;
                    }
                }
                break;
            case 0:
                if (a == b) {
                    result = a + b;
                } else {
                    result = (b > c) ? b : 0;
                }
                break;
            case 1:
                result = b;
                break;
        }

        return (result == 0) ? -1 : result;
    }

}
