package de.rueffreck.gptgenerated.msc56_j;

public class MSC56_J_1 {
    private int x = 0;

    public int compute(boolean condition) {
        if(condition) {
            x = 2;
            return x;
        }
        return x;
    }

    public int computeMore(boolean condition, int a, int b) {
        int y = 0;

        if(condition) {
            x = 2;
            return x;
        } else {
            if(a == b) {
                if(a > b) {
                    y = x-a;
                    a++;
                }
            }
            int n = a + b;
            n ++;
        }

        if(x <= 0) {
            return 0;
        }
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
