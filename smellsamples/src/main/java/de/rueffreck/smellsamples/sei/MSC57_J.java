package de.rueffreck.smellsamples.sei;

/**
 * @see <a href="https://wiki.sei.cmu.edu/confluence/display/java/MSC57-J.+Strive+for+logical+completeness">Definition</a>
 * */
public class MSC57_J {

    public void compute(int a, int b, int c) {
        if(a == b) {
            notifyResult(1);
        } else if(a == c) {
            notifyResult(0);
        }
    }
    public void notifyResult(int result) {/*...*/}

    public void computeFooBar(int x) {
        switch(x) {
            case 0: foo();
            case 1: bar();
        }
    }
    public void foo() {/*...*/}
    public void bar() {/*...*/}
}
