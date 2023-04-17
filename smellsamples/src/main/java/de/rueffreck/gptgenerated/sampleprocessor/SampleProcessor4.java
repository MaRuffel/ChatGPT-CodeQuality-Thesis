package de.rueffreck.gptgenerated.sampleprocessor;


public class SampleProcessor4 {
    public int compute(SampleData data) {
        int res = 0;

        if (isMeasuresOK(data)) res ++;
        if (isAttrOK(data)) res ++;
        if (isHealthOK(data)) res ++;

        return res;
    }

    private boolean isMeasuresOK(SampleData data) {
        return data.length > 0 && data.width > 0 && data.weight > 0;
    }

    private boolean isAttrOK(SampleData data) {
        if (data.attr1 > 2 && data.attr1 < 50) {
            return true;
        }

        if (data.attr2 != data.attr3) {
            if (data.attr2 > 2 && data.attr3 > 5) {
                return true;
            }
        }

        return false;
    }

    private boolean isHealthOK(SampleData data) {
        if (data.health != 1) {
            return false;
        }

        if (data.amount > 200 && data.age > 0) {
            double ratio = (double) data.age / data.amount;
            return ratio > 1;
        }

        return false;
    }

    public static class SampleData {
        public int length;
        public int width;
        public int weight;
        public int attr1;
        public int attr2;
        public int attr3;
        public int amount;
        public int health;
        public int age;

        public SampleData(int length, int width, int weight, int attr1, int attr2, int attr3, int amount, int health, int age) {
            this.length = length;
            this.width = width;
            this.weight = weight;
            this.attr1 = attr1;
            this.attr2 = attr2;
            this.attr3 = attr3;
            this.amount = amount;
            this.health = health;
            this.age = age;
        }
    }
}