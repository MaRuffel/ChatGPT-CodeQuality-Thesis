package de.rueffreck.gptgenerated.complexity3;

public class C32b {
    private static final int[] VALUES = {234, 543, 23, 567, 0, 121, 32, 42, 2321, 750, 765, 345, 2321, 2321, 2321, 5445};

    public int compute(int a) {
        if (a >= 1 && a <= VALUES.length) {
            return VALUES[a-1];
        } else {
            return 0;
        }
    }
}
