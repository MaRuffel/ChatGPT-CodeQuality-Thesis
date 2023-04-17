package de.rueffreck.gptgenerated.complexity3;

import java.util.HashMap;
import java.util.Map;

public class C31 {
    private static final Map<Integer, Integer> VALUES = new HashMap<>();
    static {
        VALUES.put(1, 234);
        VALUES.put(2, 543);
        VALUES.put(3, 23);
        VALUES.put(4, 567);
        VALUES.put(6, 121);
        VALUES.put(7, 32);
        VALUES.put(8, 42);
        VALUES.put(9, 2321);
        VALUES.put(10, 2321);
        VALUES.put(11, 750);
        VALUES.put(12, 765);
        VALUES.put(13, 345);
        VALUES.put(14, 2321);
        VALUES.put(15, 2321);
        VALUES.put(16, 2321);
        VALUES.put(17, 5445);
    }

    public int compute(int a) {
        return VALUES.getOrDefault(a, 0);
    }

}
