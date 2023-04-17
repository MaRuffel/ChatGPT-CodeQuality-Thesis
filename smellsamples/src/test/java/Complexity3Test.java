import de.rueffreck.gptgenerated.complexity3.*;
import de.rueffreck.smellsamples.complexity.Complexity3;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Complexity3Test {

    private class ResultPair {
        public int a;
        public int expected;

        public ResultPair(int a, int expected) {
            this.a = a;
            this.expected = expected;
        }
    }

    private final List<ResultPair> pairs = List.of(
            new ResultPair(1,234),
            new ResultPair(2,543),
            new ResultPair(3,23),
            new ResultPair(4,567),
            new ResultPair(6,121),
            new ResultPair(7,32),
            new ResultPair(8,42),
            new ResultPair(9,2321),
            new ResultPair(10,2321),
            new ResultPair(11,750),
            new ResultPair(12,765),
            new ResultPair(13,345),
            new ResultPair(14,2321),
            new ResultPair(15,2321),
            new ResultPair(16,2321),
            new ResultPair(17,5445),
            new ResultPair(5,0)
    );

    Complexity3 sut = new Complexity3();

    @Test
    public void testCompute() {
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a);
            assertEquals(p.expected, actual);
        }
    }

    @Test
    public void testComputeSeparated() {
        for(ResultPair p : pairs) {
            int actual = sut.computeSeparated(p.a);
            assertEquals(p.expected, actual);
        }
    }

    @Test
    public void testComputeExtra() {
        for(ResultPair p : pairs) {
            int actual = sut.computeExtra(p.a);
            assertEquals(p.expected, actual);
        }
    }

    //--------------
    @Test
    public void testC31() {
        C31 sut = new C31();
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a);
            assertEquals(p.expected, actual);
        }
    }
    @Test
    public void testC32a() {
        C32a sut = new C32a();
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a);
            assertEquals(p.expected, actual);
        }
    }
    @Test
    public void testC32b() {
        C32b sut = new C32b();
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a);
            assertEquals(p.expected, actual);
        }
    }
    @Test
    public void testC33() {
        C33 sut = new C33();
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a);
            assertEquals(p.expected, actual);
        }
    }
    @Test
    public void testC34() {
        C34 sut = new C34();
        for(ResultPair p : pairs) {
            int actual = sut.compute(p.a);
            assertEquals(p.expected, actual);
        }
    }
    @Test
    public void testC3cE1a() {
        C3cE1a sut = new C3cE1a();
        for(ResultPair p : pairs) {
            int actual = sut.computeExtra(p.a);
            assertEquals(p.expected, actual);
        }
    }
    @Test
    public void testC3cE1b() {
        C3cE1b sut = new C3cE1b();
        for(ResultPair p : pairs) {
            int actual = sut.computeExtra(p.a);
            assertEquals(p.expected, actual);
        }
    }
    @Test
    public void testC3cS1() {
        C3cS1 sut = new C3cS1();
        for(ResultPair p : pairs) {
            int actual = sut.computeSeparated(p.a);
            assertEquals(p.expected, actual);
        }
    }
}
