package de.rueffreck.smellsamples.sei;
/**
 * @see <a href="https://wiki.sei.cmu.edu/confluence/display/java/EXP03-J.+Do+not+use+the+equality+operators+when+comparing+values+of+boxed+primitives">Definition</a>
 * */
public class EXP03_J {
    public int compare(Integer i, Integer j) {
        return i < j ? -1 : (i == j ? 0 : 1);
    }

    public boolean isSame(Integer i, Integer j) {
        return i == j;
    }

    public void doEqual() {
        Boolean b1 = new Boolean("true");
        Boolean b2 = new Boolean("true");

        if(b1 == b2) {
            System.out.println("Never printed");
        }
    }
}
