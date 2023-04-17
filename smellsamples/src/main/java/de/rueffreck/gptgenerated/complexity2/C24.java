package de.rueffreck.gptgenerated.complexity2;

public class C24 {
    public int compute(int[] arr, int b, int c) {
        if (arr.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int num : arr) {
            if (num <= 0) {
                return -1;
            }

            if (num > b) {
                int temp = num + b;
                if (temp == c) {
                    sum += num;
                } else {
                    sum += temp;
                }
            } else if (num == c) {
                sum += c/2;
            } else {
                sum += num;
            }
        }

        return sum;
    }

}
