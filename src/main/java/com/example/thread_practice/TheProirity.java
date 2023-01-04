package com.example.thread_practice;

public class TheProirity {
    public static void main(String[] args) {
        Thread tt1 = new OneThread("1");
        Thread tt2 = new OneThread("2");
        tt1.setPriority(2);
        tt2.setPriority(10);

        tt1.start();
        tt2.start();
    }
}
