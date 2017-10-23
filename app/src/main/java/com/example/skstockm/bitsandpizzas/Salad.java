package com.example.skstockm.bitsandpizzas;

/**
 * Created by skstockm on 10/23/2017.
 */

public class Salad {
    private String name;
    private int imageResourceId;

    public static final Salad[] salads = {
            new Salad("Caesar Salad", R.drawable.caesarsalad),
            new Salad("House Salad", R.drawable.housesalad),
    };

    private Salad(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
