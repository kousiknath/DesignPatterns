package com.designpatterns.iterator;

public class ConcreteCollection implements IterableCollection {
    @Override
    public Iterator getIterator() {
        return new ConcreteIterator();
    }
}
