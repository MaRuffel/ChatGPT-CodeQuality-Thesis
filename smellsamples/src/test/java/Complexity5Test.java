import de.rueffreck.gptgenerated.complexity5.C51;
import de.rueffreck.gptgenerated.complexity5.C52;
import de.rueffreck.gptgenerated.complexity5.C53;
import de.rueffreck.gptgenerated.complexity5.C54;
import de.rueffreck.smellsamples.complexity.Complexity5;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Complexity5Test {

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
            new ResultPair(-1,0,1,-1),
            new ResultPair(-1,1,2,2),
            new ResultPair(-1,2,2,2)
    );

    Complexity5 sut = new Complexity5();

    @Test
    public void test() {
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a, p.b, p.c);
            assertEquals(p.expected, actual);
        }
    }

    //--------

    @Test
    public void testC51() {
        C51 sut = new C51();
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a, p.b, p.c);
            assertEquals(p.expected, actual);
        }
    }
    @Test
    public void testC52() {
        C52 sut = new C52();
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a, p.b, p.c);
            assertEquals(p.expected, actual);
        }
    }
    @Test
    public void testC53() {
        C53 sut = new C53();
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a, p.b, p.c);
            assertEquals(p.expected, actual);
        }
    }
    @Test
    public void testC54() {
        C54 sut = new C54();
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a, p.b, p.c);
            assertEquals(p.expected, actual);
        }
    }
}
