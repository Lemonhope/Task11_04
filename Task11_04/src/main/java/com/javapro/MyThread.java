package com.javapro;

public class MyThread extends Thread{
    Thread t;
    MyThread(String name) {
        t = new Thread(name);
        t.start();
    }
    public void run()
    {
        try
        {
            if(t.getName().equals("First Thread")) {
                System.out.println(t.getName()+": finished");
            }
            else if(t.getName().equals("Second Thread"))
            {
                Thread.sleep(10);
                System.out.println(t.getName()+": finished");
            }
            else
            {
                Thread.sleep(100);
                System.out.println(t.getName()+": finished");
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(t.getName()+" is interrupted");
        }
    }
}