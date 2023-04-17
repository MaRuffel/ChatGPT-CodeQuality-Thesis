import de.rueffreck.gptgenerated.samplerepository.SampleRepository1;
import de.rueffreck.gptgenerated.samplerepository.SampleRepository2;
import de.rueffreck.gptgenerated.samplerepository.SampleRepository3;
import de.rueffreck.gptgenerated.samplerepository.SampleRepository4;
import de.rueffreck.smellsamples.smells.duplicate.SampleRepository;
import de.rueffreck.smellsamples.smells.duplicate.SampleRepository.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleRepositoryTest {

    private class ResultPair<T> {
        public T sample;
        public boolean expectValid;
        public boolean expectContain;

        public ResultPair(T sample, boolean expectValid, boolean expectContain) {
            this.sample = sample;
            this.expectValid = expectValid;
            this.expectContain = expectContain;
        }
    }

    private <T> List<ResultPair<T>> generatePairs(Class<T> clazz) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return List.of(
                new ResultPair<>(clazz.getDeclaredConstructor(int.class, int.class, boolean.class).newInstance(499, 0, false), false, false),
                new ResultPair<>(clazz.getDeclaredConstructor(int.class, int.class, boolean.class).newInstance(500,119,false),false,false),
                new ResultPair<>(clazz.getDeclaredConstructor(int.class, int.class, boolean.class).newInstance(500,119,true),false,true),
                new ResultPair<>(clazz.getDeclaredConstructor(int.class, int.class, boolean.class).newInstance(500,120,false),true,true)
        );
    }

    @Test
    public void test() {
        try {
            SampleRepository sut = new SampleRepository();
            List<ResultPair<Sample>> pairs = generatePairs(SampleRepository.Sample.class);
            for(ResultPair<Sample> p : pairs) {
                boolean origValid = p.sample.valid;
                sut.samplesA = new ArrayList<>();
                sut.samplesB = new ArrayList<>();
                sut.saveSampleInA(p.sample);
                assertEquals(p.expectValid, p.sample.valid);
                assertEquals(p.expectContain, sut.samplesA.contains(p.sample));
                p.sample.valid = origValid;
                sut.saveSampleInB(p.sample);
                assertEquals(p.expectValid, p.sample.valid);
                assertEquals(p.expectContain, sut.samplesB.contains(p.sample));
            }
        } catch (Exception e) {
            Assertions.fail(e);
        }
    }
    //----------------
    @Test
    public void test1() {
        try {
            SampleRepository1 sut = new SampleRepository1();
            List<ResultPair<SampleRepository1.Sample>> pairs = generatePairs(SampleRepository1.Sample.class);
            for(ResultPair<SampleRepository1.Sample> p : pairs) {
                boolean origValid = p.sample.valid;
                sut.addSampleToCollectionA(p.sample);
                assertEquals(p.expectValid, p.sample.valid);
                assertEquals(p.expectContain, sut.getCollectionA().contains(p.sample));
                p.sample.valid = origValid;
                sut.addSampleToCollectionB(p.sample);
                assertEquals(p.expectValid, p.sample.valid);
                assertEquals(p.expectContain, sut.getCollectionB().contains(p.sample));
            }
        } catch (Exception e) {
            Assertions.fail(e);
        }
    }
    @Test
    public void test2() {
        try {
            SampleRepository2 sut = new SampleRepository2();
            List<ResultPair<SampleRepository2.Sample>> pairs = generatePairs(SampleRepository2.Sample.class);
            for(ResultPair<SampleRepository2.Sample> p : pairs) {
                boolean origValid = p.sample.valid;
                sut.addSampleToA(p.sample);
                assertEquals(p.expectValid, p.sample.valid);
                assertEquals(p.expectContain, sut.getSamplesA().contains(p.sample));
                p.sample.valid = origValid;
                sut.addSampleToB(p.sample);
                assertEquals(p.expectValid, p.sample.valid);
                assertEquals(p.expectContain, sut.getSamplesB().contains(p.sample));
            }
        } catch (Exception e) {
            Assertions.fail(e);
        }
    }
    @Test
    public void test3() {
        try {
            SampleRepository3 sut = new SampleRepository3();
            List<ResultPair<SampleRepository3.Sample>> pairs = generatePairs(SampleRepository3.Sample.class);
            for(ResultPair<SampleRepository3.Sample> p : pairs) {
                boolean origValid = p.sample.valid;
                sut.saveSampleInA(p.sample);
                assertEquals(p.expectValid, p.sample.valid);
                assertEquals(p.expectContain, sut.samplesA.contains(p.sample));
                p.sample.valid = origValid;
                sut.saveSampleInB(p.sample);
                assertEquals(p.expectValid, p.sample.valid);
                assertEquals(p.expectContain, sut.samplesB.contains(p.sample));
            }
        } catch (Exception e) {
            Assertions.fail(e);
        }
    }
    @Test
    public void test4() {
        try {
            SampleRepository4 sut = new SampleRepository4();
            List<ResultPair<SampleRepository4.Sample>> pairs = generatePairs(SampleRepository4.Sample.class);
            for(ResultPair<SampleRepository4.Sample> p : pairs) {
                boolean origValid = p.sample.valid;
                sut.saveSample(p.sample, sut.validSamples);
                assertEquals(p.expectValid, p.sample.valid);
                assertEquals(p.expectContain, sut.validSamples.contains(p.sample));
                p.sample.valid = origValid;
                sut.saveSample(p.sample, sut.invalidSamples);
                assertEquals(p.expectValid, p.sample.valid);
                assertEquals(p.expectContain, sut.invalidSamples.contains(p.sample));
            }
        } catch (Exception e) {
            Assertions.fail(e);
        }
    }
}
