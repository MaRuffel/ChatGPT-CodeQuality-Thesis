package de.rueffreck.muster.sei;

/**
 * @see <a href="https://wiki.sei.cmu.edu/confluence/display/java/MSC57-J.+Strive+for+logical+completeness">Definition</a>
 * */
public class MSC57_J {

    public void compute(int a, int b, int c) {
        if(a == b) {
            notifyResult(1);
        } else if(a == c) {
            notifyResult(0);
        } else {
            error();
        }
    }
    public void notifyResult(int result) {/*...*/}

    public void computeFooBar(int x) {
        switch(x) {
            case 0: foo(); break;
            case 1: bar(); break;
            default: error();
        }
    }

    public void error() {/*...*/}
    public void foo() {/*...*/}
    public void bar() {/*...*/}
}
