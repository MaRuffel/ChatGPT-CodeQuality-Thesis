package de.rueffreck.gptgenerated.samplerepository;

import java.util.ArrayList;

public class SampleRepository3 {
    public ArrayList<Sample> samplesA = new ArrayList<>();
    public ArrayList<Sample> samplesB = new ArrayList<>();
    private final int MIN_WIDTH = 120;
    private final int MIN_LENGTH = 500;

    public void saveSampleInA(Sample sample) {
        if (!isValidSample(sample)) {
            return;
        }
        sample.valid = true;
        samplesA.add(sample);
    }

    public void saveSampleInB(Sample sample) {
        if (!isValidSample(sample)) {
            return;
        }
        sample.valid = true;
        samplesB.add(sample);
    }

    private boolean isValidSample(Sample sample) {
        if (sample.length < MIN_LENGTH) {
            sample.valid = false;
            return false;
        }
        if (sample.width < MIN_WIDTH && !sample.ignoreWidth) {
            sample.valid = false;
            return false;
        }
        return true;
    }

    public static class Sample {
        public int length;
        public int width;
        public boolean valid = true;
        public boolean ignoreWidth;

        public Sample(int length, int width, boolean ignoreWidth) {
            this.length = length;
            this.width = width;
            this.ignoreWidth = ignoreWidth;
        }
    }
}
