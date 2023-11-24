package com.javapro;

public class Main {
    public static void main(String[] args) {
        try {

            MyThread thread1=new MyThread("First Thread");
            MyThread thread2=new MyThread("Second Thread");
            MyThread thread3=new MyThread("Third Thread");

            thread1.start();
            thread1.join(200);
            thread2.start();
            thread1.join();

            thread3.start();
            try {
                thread1.join();
                thread2.join();
                thread3.join();
            } catch (Exception e) {
                System.out.println(e);;
            }

            System.out.println("All threads finished!");
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
