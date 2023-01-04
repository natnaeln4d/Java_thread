package com.example.thread_practice;

public class Threadrunble implements Runnable{
    @Override
    public void run() {
        try {
            for(int i=5;i>0;i--){
                System.out.println("child thread:"+i);
                 Thread.sleep(500);
            }
        }catch (Exception E){
            System.out.println("Child thread interpreted");
        }
        System.out.println("child thread exiting.");
    }
}
