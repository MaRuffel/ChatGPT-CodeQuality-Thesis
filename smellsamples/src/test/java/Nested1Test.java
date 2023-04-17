import de.rueffreck.gptgenerated.nested1.N11;
import de.rueffreck.gptgenerated.nested1.N12;
import de.rueffreck.gptgenerated.nested1.N13;
import de.rueffreck.gptgenerated.nested1.N14;
import de.rueffreck.smellsamples.complexity.Nested1;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Nested1Test {

    private class ResultPair {
        public int a;
        public int b;
        public int c;
        public int expected;

        public ResultPair(int a, int b, int c, int expected) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.expected = expected;
        }
    }

    private final List<ResultPair> pairs = List.of(
            new ResultPair(0,0,0,0),
            new ResultPair(1,1,0,0),
            new ResultPair(1,2,1,0),
            new ResultPair(1,2,0,0),
            new ResultPair(1,2,-1,0),
            new ResultPair(1,2,-2,1)
    );

    Nested1 sut = new Nested1();

    @Test
    public void test() {
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a, p.b, p.c);
            assertEquals(p.expected, actual);
        }
    }
    //--------
    @Test
    public void testN11() {
        N11 sut = new N11();
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a, p.b, p.c);
            assertEquals(p.expected, actual);
        }
    }
    @Test
    public void testN12() {
        N12 sut = new N12();
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a, p.b, p.c);
            assertEquals(p.expected, actual);
        }
    }
    @Test
    public void testN13() {
        N13 sut = new N13();
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a, p.b, p.c);
            assertEquals(p.expected, actual);
        }
    }
    @Test
    public void testN14() {
        N14 sut = new N14();
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a, p.b, p.c);
            assertEquals(p.expected, actual);
        }
    }
}
