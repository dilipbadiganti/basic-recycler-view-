package com.example.recyclerfinal;

public class SampleModel {
    String bigName;
    String smallName;
    int image;

    public SampleModel(String bigName, String smallName, int image) {
        this.bigName = bigName;
        this.smallName = smallName;
        this.image = image;
    }

    public String getBigName() {
        return bigName;
    }

    public String getSmallName() {
        return smallName;
    }

    public int getImage() {
        return image;
    }
}
