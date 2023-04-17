package de.rueffreck.gptgenerated.complexity4;

public class C43 {
    public int compute(int a, int b, int c) {
        if (a != 0) {
            if (a > b + c) {
                return 1;
            } else if (a > c) {
                if (c != 0) {
                    return 0;
                } else {
                    return -1;
                }
            } else {
                return a;
            }
        } else {
            if (b == 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }

}
