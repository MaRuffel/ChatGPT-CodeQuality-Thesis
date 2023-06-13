package de.rueffreck.muster.sei;
/**
 * @see <a href="https://wiki.sei.cmu.edu/confluence/display/java/EXP03-J.+Do+not+use+the+equality+operators+when+comparing+values+of+boxed+primitives">Definition</a>
 * */
public class EXP03_J {
    public int compare(Integer i, Integer j) {
        return i.compareTo(j);
    }

    public boolean isSame(Integer i, Integer j) {
        return i.equals(j);
    }

    public void doEqual() {
        Boolean b1 = Boolean.TRUE;
        Boolean b2 = Boolean.TRUE;

        if(b1.equals(b2)) {
            System.out.println("Never printed");
        }
    }
}
