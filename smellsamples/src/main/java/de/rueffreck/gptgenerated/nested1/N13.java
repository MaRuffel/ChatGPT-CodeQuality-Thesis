package de.rueffreck.gptgenerated.nested1;

public class N13 {
    public int compute(int a, int b, int c) {
        if (a == 0 || a <= b || a <= c || c == 0 || a <= b + c) {
            return 0;
        } else {
            return 1;
        }
    }
}
