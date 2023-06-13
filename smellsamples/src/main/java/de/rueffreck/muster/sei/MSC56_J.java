package de.rueffreck.muster.sei;

/**@see <a href="https://wiki.sei.cmu.edu/confluence/display/java/MSC56-J.+Detect+and+remove+superfluous+code+and+values">...</a>*/
public class MSC56_J {

    public int compute(boolean condition) {
        if(condition) {
            return 2;
        }
        return 0;
    }

    public int computeMore(boolean condition, int a, int b) {
        if(condition) {
            return 2;
        }
        return 0;
    }
}
