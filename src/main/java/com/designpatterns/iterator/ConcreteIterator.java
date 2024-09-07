package com.designpatterns.iterator;

import java.util.Random;

public class ConcreteIterator implements Iterator {
    Integer lastElement;
    int modCount;

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Integer getNext() {
        return new Random().nextInt(100);
    }
}
