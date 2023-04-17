import de.rueffreck.gptgenerated.complexity6.C61;
import de.rueffreck.gptgenerated.complexity6.C62;
import de.rueffreck.gptgenerated.complexity6.C63;
import de.rueffreck.gptgenerated.complexity6.C64;
import de.rueffreck.smellsamples.complexity.Complexity6;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Complexity6Test {

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
            new ResultPair(0,0,0,-1),
            new ResultPair(1,0,0,-1),
            new ResultPair(1,0,1,-1),
            new ResultPair(1,1,1,2),
            new ResultPair(1,3,1,3),
            new ResultPair(1,1,2,-1),
            new ResultPair(-1,0,1,1),
            new ResultPair(-1,1,1,4),
            new ResultPair(-1,1,2,5),
            new ResultPair(-1,2,2,6),
            new ResultPair(-1,1,5,2),
            new ResultPair(-1,2,5,3),
            new ResultPair(-1,0,5,-1),
            new ResultPair(-1,1,5,2)
    );

    Complexity6 sut = new Complexity6();

    @Test
    public void test() {
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a, p.b, p.c);
            assertEquals(p.expected, actual);
        }
    }
    //-----------
    @Test
    public void testC61() {
        C61 sut = new C61();
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a, p.b, p.c);
            assertEquals(p.expected, actual);
        }
    }
    @Test
    public void testC62() {
        C62 sut = new C62();
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a, p.b, p.c);
            assertEquals(p.expected, actual);
        }
    }
    @Test
    public void testC63() {
        C63 sut = new C63();
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a, p.b, p.c);
            assertEquals(p.expected, actual);
        }
    }
    @Test
    public void testC64() {
        C64 sut = new C64();
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a, p.b, p.c);
            assertEquals(p.expected, actual);
        }
    }
}
