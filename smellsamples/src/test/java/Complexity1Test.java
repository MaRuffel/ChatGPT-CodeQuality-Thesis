import de.rueffreck.gptgenerated.complexity1.C11;
import de.rueffreck.gptgenerated.complexity1.C12;
import de.rueffreck.gptgenerated.complexity1.C13;
import de.rueffreck.gptgenerated.complexity1.C14;
import de.rueffreck.smellsamples.complexity.Complexity1;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Complexity1Test {

    private class ResultPair {
        public int a;
        public int b;
        public int c;
        public int d;
        public int expected;

        public ResultPair(int a, int b, int c, int d, int expected) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.expected = expected;
        }
    }

    private final List<ResultPair> pairs = List.of(
            new ResultPair(1,0,0,0,1),
            new ResultPair(2,0,0,0,0),
            new ResultPair(2,1,0,0,-1),
            new ResultPair(2,2,4,0,-1),
            new ResultPair(2,2,5,9,9),
            new ResultPair(2,2,6,9,13),
            new ResultPair(7,-3,7,0,14),
            new ResultPair(2,3,8,0,2),
            new ResultPair(2,3,9,0,3),
            new ResultPair(2,2,9,0,1),
            new ResultPair(2,2,10,0,-1)
    );

    Complexity1 sut = new Complexity1();

    @Test
    public void test() {
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a, p.b, p.c, p.d);
            assertEquals(p.expected, actual);
        }
    }

    //-----------------
    @Test
    public void testC11() {
        C11 sut = new C11();
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a, p.b, p.c, p.d);
            assertEquals(p.expected, actual);
        }
    }
    @Test
    public void testC12() {
        C12 sut = new C12();
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a, p.b, p.c, p.d);
            assertEquals(p.expected, actual);
        }
    }
    @Test
    public void testC13() {
        C13 sut = new C13();
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a, p.b, p.c, p.d);
            assertEquals(p.expected, actual);
        }
    }
    @Test
    public void testC14() {
        C14 sut = new C14();
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a, p.b, p.c, p.d);
            assertEquals(p.expected, actual);
        }
    }
}
