package com.designpatterns.composite;

public class Main {

    public static void main(String[] args) {
        Directory dir = new Directory();
        dir.add(new Directory());
        dir.add(new File());
        dir.add(new File());

        System.out.println("Total size: " + dir.bytes());
    }
}
