package de.rueffreck.gptgenerated.complexity6;

public class C61 {
    public int compute(int start, int end, int max) {
        if (start == 0 || max == 0) {
            return -1;
        }

        int sum = 0;
        int limit = Math.min(end, max);

        for (int i = start; i < end; i++) {
            if (i % 2 == 0) {
                int value = (i == start) ? start + end : end + 1;
                if (value > limit) {
                    value = limit;
                }
                sum += value + i;
                if (value == max) {
                    sum += 1;
                }
            }
        }

        return (sum == 0) ? -1 : sum;
    }

}
