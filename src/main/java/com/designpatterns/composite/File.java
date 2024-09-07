package com.designpatterns.composite;

import java.util.Random;

public class File implements OSObject {
    @Override
    public long bytes() {
        return new Random().nextInt(20000);
    }

    @Override
    public String name() {
        return "Random - " + new Random().nextInt(200);
    }

    @Override
    public String type() {
        return "File";
    }
}
