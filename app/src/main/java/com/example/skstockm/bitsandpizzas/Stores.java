package com.example.skstockm.bitsandpizzas;

/**
 * Created by skstockm on 10/23/2017.
 */

public class Stores {
    private String name;
    private int imageResourceId;

    public static final Stores[] stores = {
            new Stores("Cambridge", R.drawable.cambridgesign),
            new Stores("Sebastopol", R.drawable.sebastopol)
    };

    private Stores(String name, int imageResourceId) {
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
