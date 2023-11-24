package com.javapro;

public class MyThread extends Thread{
    Thread t;
    MyThread(String name) {
        t = new Thread(name);
        t.start();
    }
    public void run()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(t.getName()+" is finished.");
    }
}
