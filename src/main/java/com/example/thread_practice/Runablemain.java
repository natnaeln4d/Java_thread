package com.example.thread_practice;

public class Runablemain {
    public static void main(String[] args) {
        Thread thread=new Thread(new Threadrunble());
        thread.start();
        try {
            for(int i=5;i>0;i--){
                System.out.println("Main thread:"+i);
                Thread.sleep(500);
            }
        }catch (Exception E){
            System.out.println("Main thread interpreted");
        }
        System.out.println("Main thread exiting.");

    }
}
