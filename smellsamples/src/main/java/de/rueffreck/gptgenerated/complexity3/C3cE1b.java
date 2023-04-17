package de.rueffreck.gptgenerated.complexity3;

public class C3cE1b {
    private static final int[] EXTRA_VALUES = {0, 234, 543, 23, 567, 0, 121, 32, 42, 2321, 750, 765, 345, 2321, 2321, 2321, 5445};

    public int computeExtra(int a) {
        if (a >= 1 && a < EXTRA_VALUES.length) {
            return EXTRA_VALUES[a];
        } else {
            return 0;
        }
    }
}
