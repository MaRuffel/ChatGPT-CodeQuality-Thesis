package de.rueffreck.gptgenerated.complexity1;

public class C14 {
    public int compute(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        if (firstNumber <= 1) {
            return firstNumber;
        }

        if (secondNumber == 0) {
            return 0;
        }

        int sumOfFirstAndSecond = firstNumber + secondNumber;
        if (sumOfFirstAndSecond < 4) {
            return -1;
        }

        if (thirdNumber <= sumOfFirstAndSecond) {
            return -1;
        }

        int difference = thirdNumber - sumOfFirstAndSecond;
        int result = 0;
        switch (difference) {
            case 1:
                result = fourthNumber;
                break;
            case 2:
                result = fourthNumber + sumOfFirstAndSecond;
                break;
            case 3:
                if (firstNumber == thirdNumber) {
                    result = firstNumber + thirdNumber;
                } else {
                    result = firstNumber;
                }
                break;
            case 4:
                result = secondNumber;
                break;
            case 5:
                result = 1;
                break;
            default:
                result = -1;
                break;
        }

        return result;
    }

}
