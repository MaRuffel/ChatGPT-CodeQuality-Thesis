package de.rueffreck.smellsamples.smells.duplicate;

import java.util.ArrayList;

public class SampleRepository {
    public ArrayList<Sample> samplesA = new ArrayList<>();
    public ArrayList<Sample> samplesB = new ArrayList<>();
    private final int MIN_WIDTH = 120;
    private final int MIN_LENGTH = 500;
    public void saveSampleInA(Sample sample) {
        if(sample.length >= MIN_LENGTH) {
            if(sample.width >= MIN_WIDTH) {
                sample.valid = true;
                samplesA.add(sample);
            } else if(sample.ignoreWidth) {
                sample.valid = false;
                samplesA.add(sample);
            } else {
                sample.valid = false;
            }
        } else {
            sample.valid = false;
        }
    }

    public void saveSampleInB(Sample sample) {
        if(sample.length >= MIN_LENGTH) {
            if(sample.width >= MIN_WIDTH) {
                sample.valid = true;
                samplesB.add(sample);
            } else if(sample.ignoreWidth) {
                sample.valid = false;
                samplesB.add(sample);
            } else {
                sample.valid = false;
            }
        } else {
            sample.valid = false;
        }
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