package de.rueffreck.gptgenerated.exp03_j;

public class EXP03_J_1 {
    public int compare(Integer i, Integer j) {
        return Integer.compare(i, j);
    }
    public boolean isSame(Integer i, Integer j) {
        return i.equals(j);
    }

    public void doEqual() {
        Boolean b1 = true;
        Boolean b2 = true;

        if(b1.equals(b2)) {
            System.out.println("Printed");
        }
    }
}
