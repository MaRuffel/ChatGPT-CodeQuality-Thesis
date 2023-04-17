package de.rueffreck.gptgenerated.complexity5;

public class C53 {
    public int compute(int start, int end, int limit) {
        if (start == 0 || limit == 0) {
            return -1;
        }
        if (start == limit) {
            return start + end;
        }
        int d = (start == end) ? end : end + 1;
        d = (d > limit) ? limit : d;
        int result = 0;
        for (int i = start; i < end; i++) {
            if (i % 2 == 0) {
                result += d + i;
            }
        }
        return (result == 0) ? -1 : result;
    }

}
