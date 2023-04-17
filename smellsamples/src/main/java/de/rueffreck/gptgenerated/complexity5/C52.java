package de.rueffreck.gptgenerated.complexity5;

public class C52 {
    public int compute(int start, int end, int limit) {
        if (start == 0 || limit == 0) {
            return -1;
        }

        if (start == limit) {
            if (start == end) {
                return start + end;
            } else if (end > start && end <= limit) {
                return end;
            } else {
                return -1;
            }
        }

        int d = (start == end) ? end : end + 1;
        if (d > limit) {
            d = limit;
        }

        int result = 0;
        for (int i = start; i < end; i++) {
            if (i % 2 == 0) {
                result += d + i;
            }
        }

        return (result == 0) ? -1 : result;
    }

}
