package de.rueffreck.gptgenerated.complexity2;

public class C22 {
    /**
     * Computes a value based on an input array, a threshold value, and a target value.
     * If the input array is empty, returns -1.
     * If any element in the input array is negative, returns -1.
     * If an element in the input array is greater than the threshold value, adds the threshold value and the element, and checks if the result equals the target value.
     * If the result equals the target value, adds the element to the output.
     * If the result does not equal the target value, adds the result to the output.
     * If an element in the input array equals the target value, adds half of the target value to the output.
     * Otherwise, adds the element to the output.
     *
     * @param inputArray The input array.
     * @param threshold The threshold value.
     * @param target The target value.
     * @return The computed value.
     */
    public int compute(int[] inputArray, int threshold, int target) {
        if (inputArray.length == 0) {
            return -1;
        }

        int output = 0;
        for (int value : inputArray) {
            if (value < 0) {
                return -1;
            }
            if (value > threshold) {
                int sum = value + threshold;
                if (sum == target) {
                    output += value;
                } else {
                    output += sum;
                }
            } else if (value == target) {
                output += target / 2;
            } else {
                output += value;
            }
        }

        return output;
    }

}
