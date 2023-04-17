package de.rueffreck.gptgenerated.complexity6;

public class C64 {
    public int compute(int a, int b, int c) {
        if (a == 0 || c == 0) {
            return -1;
        }

        if (a == c) {
            if (a == b) {
                return a + b;
            } else if (b > a && b <= c) {
                return b;
            } else {
                return -1;
            }
        }

        int maxValue = (a == b) ? b : b+1;
        maxValue = Math.min(maxValue, c);

        int result = 0;
        int i = a;
        while (i < b) {
            if (i % 2 == 0) {
                result += maxValue + i;
                if (maxValue == c) {
                    result += 1;
                }
            }
            if (maxValue == c) {
                result += 1;
            }
            i++;
        }

        return (result == 0) ? -1 : result;
    }

}
