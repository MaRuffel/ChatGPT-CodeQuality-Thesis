package de.rueffreck.gptgenerated.complexity4;

public class C42 {
    public int compute(int a, int b, int c) {
        if (a != 0) {
            if (a < b && a > c && c != 0 && a > b + c) {
                return 1;
            } else {
                return Math.max(a, b);
            }
        } else if (b == 0) {
            return 1;
        } else {
            return 0;
        }
    }

}
