import de.rueffreck.gptgenerated.sampleprocessor.*;
import de.rueffreck.smellsamples.complexity.Complexity1;
import de.rueffreck.smellsamples.smells.duplicate.SampleRepository;
import de.rueffreck.smellsamples.smells.longparams.SampleProcessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleProcessorTest {
    private class ResultPair {
        public int length;
        public int width;
        public int weight;
        public int attr1;
        public int attr2;
        public int attr3;
        public int amount;
        public int health;
        public int age;
        public int res;
        public boolean measuresOK;
        public boolean attrOK;
        public boolean healthOK;

        public ResultPair(int length, int width, int weight, int attr1, int attr2, int attr3, int amount, int health, int age, int res, boolean measuresOK, boolean attrOK, boolean healthOK) {
            this.length = length;
            this.width = width;
            this.weight = weight;
            this.attr1 = attr1;
            this.attr2 = attr2;
            this.attr3 = attr3;
            this.amount = amount;
            this.health = health;
            this.age = age;
            this.res = res;
            this.measuresOK = measuresOK;
            this.attrOK = attrOK;
            this.healthOK = healthOK;
        }
    }

    private final List<ResultPair> pairs = List.of(
            new ResultPair(0,0,0,0,0,0,0,0,0,0,false,false,false),
            new ResultPair(0,0,0,50,3,5,0,2,0,0,false,false,false),
            new ResultPair(1,1,1,2,2,6,201,1,0,1,true,false,false),
            new ResultPair(0,0,0,3,0,0,200,1,1,1,false,true,false),
            new ResultPair(0,0,0,2,3,6,0,0,0,1,false,true,false),
            new ResultPair(0,0,0,0,0,0,201,1,1,0,false,false,false),
            new ResultPair(0,0,0,0,0,0,201,1,402,1,false,false,true),
            new ResultPair(1,1,1,3,0,0,201,1,402,3,true,true,true)
    );

    @Test
    public void test() {
        for(ResultPair p : pairs) {
            SampleProcessor sut = new SampleProcessor(
                    p.length,
                    p.width,
                    p.weight,
                    p.attr1,
                    p.attr2,
                    p.attr3,
                    p.amount,
                    p.health,
                    p.age
            );
            assertEquals(p.res, sut.res);
            assertEquals(p.measuresOK, sut.measuresOK);
            assertEquals(p.attrOK, sut.attrOK);
            assertEquals(p.healthOK, sut.healthOK);
        }
    }
    //----------------
    @Test
    public void test1() {
        for(ResultPair p : pairs) {
            SampleProcessor1 sut = new SampleProcessor1(
                    p.length,
                    p.width,
                    p.weight,
                    p.attr1,
                    p.attr2,
                    p.attr3,
                    p.amount,
                    p.health,
                    p.age
            );
            assertEquals(p.res, sut.getResult());
            assertEquals(p.measuresOK, sut.isMeasurementsValid());
            assertEquals(p.attrOK, sut.isAttributesValid());
            assertEquals(p.healthOK, sut.isHealthValid());
        }
    }
    @Test
    public void test2() {
        for(ResultPair p : pairs) {
            SampleProcessor2 sut = new SampleProcessor2(
                    p.length,
                    p.width,
                    p.weight,
                    p.attr1,
                    p.attr2,
                    p.attr3,
                    p.amount,
                    p.health,
                    p.age
            );
            assertEquals(p.res, sut.getResult());
            assertEquals(p.measuresOK, sut.isMeasuresOK());
            assertEquals(p.attrOK, sut.isAttributesOK());
            assertEquals(p.healthOK, sut.isHealthOK());
        }
    }
    @Test
    public void test3() {
        for(ResultPair p : pairs) {
            SampleProcessor3 sut = new SampleProcessor3(
                    p.length,
                    p.width,
                    p.weight,
                    p.attr1,
                    p.attr2,
                    p.attr3,
                    p.amount,
                    p.health,
                    p.age
            );
            assertEquals(p.res, sut.getResult());
            assertEquals(p.measuresOK, sut.isMeasuresOK());
            assertEquals(p.attrOK, sut.isAttrOK());
            assertEquals(p.healthOK, sut.isHealthOK());
        }
    }
    @Test
    public void test4() {
        for(ResultPair p : pairs) {
            SampleProcessor4.SampleData data = new SampleProcessor4.SampleData(
                    p.length,
                    p.width,
                    p.weight,
                    p.attr1,
                    p.attr2,
                    p.attr3,
                    p.amount,
                    p.health,
                    p.age
            );
            SampleProcessor4 sut = new SampleProcessor4();
            int res = sut.compute(data);
            assertEquals(p.res, res);
        }
    }
}
