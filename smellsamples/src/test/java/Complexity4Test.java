import de.rueffreck.gptgenerated.complexity4.C41;
import de.rueffreck.gptgenerated.complexity4.C42;
import de.rueffreck.gptgenerated.complexity4.C43;
import de.rueffreck.gptgenerated.complexity4.C44;
import de.rueffreck.smellsamples.complexity.Complexity4;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Complexity4Test {

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
            new ResultPair(0,0,0,1),
            new ResultPair(0,1,0,0),
            new ResultPair(1,-1,0,-1),
            new ResultPair(2,3,4,2),
            new ResultPair(2,3,0,-1),
            new ResultPair(2,3,1,0),
            new ResultPair(-1,0,-2,1)
    );

    Complexity4 sut = new Complexity4();

    @Test
    public void test() {
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a, p.b, p.c);
            assertEquals(p.expected, actual);
        }
    }

    //----------------

    @Test
    public void testC41() {
        C41 sut = new C41();
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a, p.b, p.c);
            assertEquals(p.expected, actual);
        }
    }
    @Test
    public void testC42() {
        C42 sut = new C42();
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a, p.b, p.c);
            assertEquals(p.expected, actual);
        }
    }
    @Test
    public void testC43() {
        C43 sut = new C43();
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a, p.b, p.c);
            assertEquals(p.expected, actual);
        }
    }
    @Test
    public void testC44() {
        C44 sut = new C44();
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a, p.b, p.c);
            assertEquals(p.expected, actual);
        }
    }
}
