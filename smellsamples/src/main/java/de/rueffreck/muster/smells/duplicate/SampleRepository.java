package de.rueffreck.muster.smells.duplicate;

import java.util.ArrayList;

public class SampleRepository {
    public ArrayList<Sample> samplesA = new ArrayList<>();
    public ArrayList<Sample> samplesB = new ArrayList<>();
    private final int MIN_WIDTH = 120;
    private final int MIN_LENGTH = 500;

    private void saveSampleInArrayList(Sample sample, ArrayList<Sample> list) {
        if(sample.length >= MIN_LENGTH) {
            if(sample.width >= MIN_WIDTH) {
                sample.valid = true;
                list.add(sample);
            } else if(sample.ignoreWidth) {
                sample.valid = false;
                list.add(sample);
            } else {
                sample.valid = false;
            }
        } else {
            sample.valid = false;
        }
    }
    public void saveSampleInA(Sample sample) {
        saveSampleInArrayList(sample, samplesA);
    }

    public void saveSampleInB(Sample sample) {
        saveSampleInArrayList(sample, samplesB);
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