package de.rueffreck.gptgenerated.sampleprocessor;

public class SampleProcessor2 {
    private int result;
    private boolean measuresOK;
    private boolean attributesOK;
    private boolean healthOK;

    public SampleProcessor2(int length, int width, int weight, int attribute1, int attribute2, int attribute3, int amount, int health, int age) {
        this.result = computeResult(length, width, weight, attribute1, attribute2, attribute3, amount, health, age);
    }

    private void checkMeasures(int length, int width, int weight) {
        this.measuresOK = (length > 0 && width > 0 && weight > 0);
    }

    private void checkAttributes(int attribute1, int attribute2, int attribute3) {
        boolean condition1 = (attribute1 > 2 && attribute1 < 50);
        boolean condition2 = (attribute2 > 2 && attribute3 > 5);
        this.attributesOK = (condition1 || (attribute2 != attribute3 && condition2));
    }

    private void checkHealth(int amount, int health, int age) {
        if (health != 1) {
            this.healthOK = false;
        } else {
            double ratio = (double) age / amount;
            this.healthOK = (amount > 200 && age > 0 && ratio > 1);
        }
    }

    public int computeResult(int length, int width, int weight, int attribute1, int attribute2, int attribute3, int amount, int health, int age) {
        checkMeasures(length, width, weight);
        checkAttributes(attribute1, attribute2, attribute3);
        checkHealth(amount, health, age);

        int result = 0;
        result += measuresOK ? 1 : 0;
        result += attributesOK ? 1 : 0;
        result += healthOK ? 1 : 0;
        return result;
    }

    public int getResult() {
        return result;
    }

    public boolean isMeasuresOK() {
        return measuresOK;
    }

    public boolean isAttributesOK() {
        return attributesOK;
    }

    public boolean isHealthOK() {
        return healthOK;
    }
}

