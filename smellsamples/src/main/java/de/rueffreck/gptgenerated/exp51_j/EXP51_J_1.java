package de.rueffreck.gptgenerated.exp51_j;

public class EXP51_J_1 {
    public int compute(boolean a, boolean b) {
        return a == b ? 1 : 0;
    }

    public int computeMore(boolean a, boolean b, boolean c) {
        boolean d = a;

        if (d == b) {
            d = false;
        }

        if (c && !b) {
            d = false;
            if (a) {
                b = a;
            }
        }

        return d == b ? 1 : 0;
    }
}
