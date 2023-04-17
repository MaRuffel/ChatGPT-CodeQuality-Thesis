package de.rueffreck.gptgenerated.complexity3;

import java.util.HashMap;

public class C3cS1 {
    private static final HashMap<Integer, Integer> separatedMap = new HashMap<>();

    static {
        separatedMap.put(1, 234);
        separatedMap.put(2, 543);
        separatedMap.put(3, 23);
        separatedMap.put(4, 567);
        separatedMap.put(6, 121);
        separatedMap.put(7, 32);
        separatedMap.put(8, 42);
        separatedMap.put(9, 2321);
        separatedMap.put(10, 2321);
        separatedMap.put(11, 750);
        separatedMap.put(12, 765);
        separatedMap.put(13, 345);
        separatedMap.put(14, 2321);
        separatedMap.put(15, 2321);
        separatedMap.put(16, 2321);
        separatedMap.put(17, 5445);
    }

    public static int computeSeparated(int a) {
        return separatedMap.getOrDefault(a, 0);
    }
}
