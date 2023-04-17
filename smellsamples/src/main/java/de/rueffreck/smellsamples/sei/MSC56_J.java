package de.rueffreck.smellsamples.sei;

/**@see <a href="https://wiki.sei.cmu.edu/confluence/display/java/MSC56-J.+Detect+and+remove+superfluous+code+and+values">...</a>*/
public class MSC56_J {

    public int compute(boolean condition) {
        int x = 0;
        if(condition) {
            x = 2;
            return x;
        }

        if(x != 0) {
            return 0;
        }
        return x;
    }

    public int computeMore(boolean condition, int a, int b) {
        int x = 0;
        int y = 0;

        if(condition) {
            x = 2;
            return x;
        } else {
            if(a == b) {
                int f;
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
}
