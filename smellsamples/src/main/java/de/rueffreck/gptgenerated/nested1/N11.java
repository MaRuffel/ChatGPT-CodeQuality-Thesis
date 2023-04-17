package de.rueffreck.gptgenerated.nested1;

public class N11 {
    public int compute(int a, int b, int c) {
        if (a == 0) {
            return 0;
        }
        if (a < b || a <= c || c == 0) {
            return 0;
        }
        if (a > b + c) {
            return 1;
        }
        return 0;
    }
}
