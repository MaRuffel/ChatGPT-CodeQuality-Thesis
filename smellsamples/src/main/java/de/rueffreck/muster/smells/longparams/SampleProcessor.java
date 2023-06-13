package de.rueffreck.muster.smells.longparams;

public class SampleProcessor {
    public int res;
    public boolean measuresOK;
    public boolean attrOK;
    public boolean healthOK;
    public SampleProcessor(Sample sample) {
        this.res = compute(sample);
    }

    public int compute(Sample sample) {
        int res = 0;
        this.measuresOK = isMeasuresOK(sample.getLength(), sample.getWidth(), sample.getWeight());
        this.attrOK = isAttrOK(sample.getAttr1(), sample.getAttr2(), sample.getAttr3());
        this.healthOK = isHealthOK(sample.getAmount(), sample.getHealth(), sample.getAge());

        if(measuresOK) res ++;
        if(attrOK) res ++;
        if(healthOK) res ++;

        return res;
    }

    private boolean isMeasuresOK(int length, int width, int weight) {
        return length > 0 && width > 0 && weight > 0;
    }

    private boolean isAttrOK(int attr1, int attr2, int attr3) {
        if(attr1 > 2 && attr1 < 50) {
            return true;
        } else if(attr2 != attr3) {
            return attr2 > 2 && attr3 > 5;
        } else {
            return false;
        }
    }

    private boolean isHealthOK(int amount, int health, int age) {
        if(health == 1 && amount > 200 && age > 0) {
            double ratio = (double) age / amount;
            return ratio > 1;
        } else {
            return false;
        }
    }

    public static class Sample {
        private final int length;
        private final int width;
        private final int weight;
        private final int attr1;
        private final int attr2;
        private final int attr3;
        private final int amount;
        private final int health;
        private final int age;

        public Sample(int length, int width, int weight, int attr1, int attr2, int attr3, int amount, int health, int age) {
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

        public int getLength() {
            return length;
        }

        public int getWidth() {
            return width;
        }

        public int getWeight() {
            return weight;
        }

        public int getAttr1() {
            return attr1;
        }

        public int getAttr2() {
            return attr2;
        }

        public int getAttr3() {
            return attr3;
        }

        public int getAmount() {
            return amount;
        }

        public int getHealth() {
            return health;
        }

        public int getAge() {
            return age;
        }
    }
}
