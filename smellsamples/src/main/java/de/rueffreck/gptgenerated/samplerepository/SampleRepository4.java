package de.rueffreck.gptgenerated.samplerepository;

import java.util.ArrayList;

public class SampleRepository4 {
    public ArrayList<Sample> validSamples = new ArrayList<>();
    public ArrayList<Sample> invalidSamples = new ArrayList<>();
    public static final int MIN_WIDTH = 120;
    public static final int MIN_LENGTH = 500;

    public void saveSample(Sample sample, ArrayList<Sample> sampleList) {
        if(sample.length >= MIN_LENGTH) {
            if(sample.width >= MIN_WIDTH) {
                sample.valid = true;
                sampleList.add(sample);
            } else if(sample.ignoreWidth) {
                sample.valid = false;
                sampleList.add(sample);
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
