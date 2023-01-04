package com.example.thread_practice;

class OneThread extends Thread {
    String name;
    OneThread(String nm) {
        name = nm;
    }
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("Child Thread" + name + ": " + i);
        }
        System.out.println("Exiting child thread " + name + ".");
    }
}