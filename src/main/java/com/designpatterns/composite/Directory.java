package com.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Composite pattern can be used only when you have some tree structure to implement where
// there are 2 types of objects - leaf and container -> both implements the same interface.
// A container can contain a leaf or another container.

// Composite pattern lets a client treat both leaf and the container in a uniform way.

//A Decorator is like a Composite but only has one child component. There’s another
// significant difference: Decorator adds additional responsibilities to the wrapped object,
// while Composite just “sums up” its children’s results.
public class Directory implements OSObject {
    List<OSObject> container;

    public Directory() {
        this.container = new ArrayList<>();
    }

    public Directory(List<OSObject> container) {
        super();
        this.container.addAll(container);
    }

    public boolean add(OSObject obj) {
        return this.container.add(obj);
    }

    public boolean remove(OSObject obj) {
        return this.container.remove(obj);
    }

    // Composite pattern talks to child and calculates some value
    @Override
    public long bytes() {
        long bytes = 0;
        for(OSObject child: container) {
            bytes += child.bytes();
        }

        return bytes;
    }

    @Override
    public String name() {
        return "Random directory " + new Random().nextInt(15);
    }

    @Override
    public String type() {
        return "Directory";
    }
}
