package de.rueffreck.muster.sei;

/**
 * @see <a href="https://wiki.sei.cmu.edu/confluence/display/java/EXP51-J.+Do+not+perform+assignments+in+conditional+expressions">Definition</a>
 * */
public class EXP51_J {

    public int compute(boolean a, boolean b) {
        if (a == b) {
            return 1;
        }
        return 0;
    }

    public int computeMore(boolean a, boolean b, boolean c) {
         boolean d = a;

         if(d == b) {
             d = false;
         }
         if(c == a && !b) {
             d = false;
             if(a) {
                 b = true;
             }
         }

         if(d == b) {
             return 1;
         } else {
             return 0;
         }
    }
}
