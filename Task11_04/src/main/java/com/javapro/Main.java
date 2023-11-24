package com.javapro;

public class Main {
    public static void main(String[] args) {
        try {
            MyThread thread1=new MyThread("First Thread");
            thread1.setPriority(Thread.MAX_PRIORITY);
            MyThread thread2=new MyThread("Second Thread");
            thread2.setPriority(9);
            MyThread thread3=new MyThread("Third Thread");
            thread3.setPriority(8);
            thread1.start();
            thread2.start();
            thread3.start();

            Thread.sleep(1000);
            System.out.println("All threads finished!");
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
