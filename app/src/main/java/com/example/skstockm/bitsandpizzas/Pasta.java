package com.example.skstockm.bitsandpizzas;

/**
 * Created by skstockm on 10/23/2017.
 */

public class Pasta {
    private String name;
    private int imageResourceId;

    public static final Pasta[] pastas = {
            new Pasta("Spaghetti Bolognese", R.drawable.spaghettibolognese),
            new Pasta("Lasagne", R.drawable.lasagne),
    };

    private Pasta(String name, int imageResourceId) {
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