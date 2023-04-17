package de.rueffreck.smellsamples.smells.longparams;

public class SampleProcessor {
    public int res;
    public boolean measuresOK;
    public boolean attrOK;
    public boolean healthOK;
    public SampleProcessor(int length, int width, int weight, int attr1, int attr2, int attr3, int amount, int health, int age) {
        this.res = compute(length, width, weight, attr1, attr2, attr3, amount, health, age);
    }

    public int compute(int length, int width, int weight, int attr1, int attr2, int attr3, int amount, int health, int age) {
        if(length > 0 && width > 0 && weight > 0) {
            this.measuresOK = true;
        } else {
            this.measuresOK = false;
        }

        if(attr1 > 2 && attr1 < 50) {
            this.attrOK = true;
        } else if(attr2 != attr3) {
            if(attr2 > 2 && attr3 > 5) {
                this.attrOK = true;
            } else {
                this.attrOK = false;
            }
        } else {
            this.attrOK = false;
        }

        if(health != 1) {
            this.healthOK = false;
        } else {
            if(amount > 200 && age > 0) {
                double ratio = (double) age / amount;
                this.healthOK = ratio > 1;
            } else {
                this.healthOK = false;
            }
        }

        int res = 0;
        if(measuresOK) res ++;
        if(attrOK) res ++;
        if(healthOK) res ++;
        return res;
    }
}
