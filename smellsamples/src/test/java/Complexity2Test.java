import de.rueffreck.gptgenerated.complexity2.C21;
import de.rueffreck.gptgenerated.complexity2.C22;
import de.rueffreck.gptgenerated.complexity2.C23;
import de.rueffreck.gptgenerated.complexity2.C24;
import de.rueffreck.smellsamples.complexity.Complexity2;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class Complexity2Test {

    private class ResultPair {
        public int[] a;
        public int b;
        public int c;
        public int expected;

        public ResultPair(int[] a, int b, int c, int expected) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.expected = expected;
        }
    }

    private final List<ResultPair> pairs = List.of(
            new ResultPair(new int[]{ },0,0,0),
            new ResultPair(new int[]{0},0,0,-1),
            new ResultPair(new int[]{1},1,0,1),
            new ResultPair(new int[]{4},4,4,2),
            new ResultPair(new int[]{1},0,0,1),
            new ResultPair(new int[]{2},1,3,2)
    );

    Complexity2 sut = new Complexity2();

    @Test
    public void test() {
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a, p.b, p.c);
            assertEquals(p.expected, actual);
        }
    }

    //----------------
    @Test
    public void testC21() {
        C21 sut = new C21();
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a, p.b, p.c);
            assertEquals(p.expected, actual);
        }
    }
    @Test
    public void testC22() {
        C22 sut = new C22();
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a, p.b, p.c);
            assertEquals(p.expected, actual);
        }
    }

    @Test
    public void testC23() {
        fail();
        /*C23 sut = new C23();
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a, p.b, p.c);
            assertEquals(p.expected, actual);
        }*/
    }
    @Test
    public void testC24() {
        C24 sut = new C24();
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a, p.b, p.c);
            assertEquals(p.expected, actual);
        }
    }
}
