package com.designpatterns.iterator;

public class Main {

    public static void main(String args) {
        Iterator itr = new ConcreteCollection().getIterator();
        while (itr.hasNext()) {
            System.out.println(itr.getNext());
        }
    }
}
