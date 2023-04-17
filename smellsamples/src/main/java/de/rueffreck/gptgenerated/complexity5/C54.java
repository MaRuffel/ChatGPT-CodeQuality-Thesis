package de.rueffreck.gptgenerated.complexity5;

public class C54 {
    public int compute(int start, int end, int limit) {
        if (start == 0 || limit == 0) {
            return -1;
        }

        if (start == limit) {
            return (start == end) ? start + end : -1;
        }

        int max = (end <= limit) ? end : limit;
        int sum = 0;

        for (int i = start; i < max; i++) {
            if (i % 2 == 0) {
                sum += (i == start) ? start + end : (end + i);
            }
        }

        return (sum == 0) ? -1 : sum;
    }

}
