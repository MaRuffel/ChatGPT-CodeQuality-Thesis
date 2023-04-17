package de.rueffreck.gptgenerated.complexity1;

public class C13 {
    public int compute(int a, int b, int c, int d) {
        // If a is greater than 1, proceed with computation
        if(a > 1) {
            // If b is not zero, proceed with computation
            if(b != 0) {
                int sum = a + b;
                // If the sum of a and b is greater than or equal to 4, proceed with computation
                if(sum >= 4) {
                    // If c is greater than the sum of a and b, proceed with computation
                    if(c > sum) {
                        int diff = c - sum;
                        int result = 0;

                        switch (diff) {
                            case 1:
                                result = d;
                                break;
                            case 2:
                                result = d + sum;
                                break;
                            case 3:
                                // If a is equal to c, set result to the sum of a and c, otherwise set it to a
                                result = (a == c) ? a + c : a;
                                break;
                            case 4:
                                result = b;
                                break;
                            case 5:
                                result = 1;
                                break;
                            default:
                                result = -1;
                        }

                        return result;
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        }

        return a;
    }

}
