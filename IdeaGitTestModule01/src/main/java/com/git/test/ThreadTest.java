package com.git.test;

public class ThreadTest {
    public static void main(String[] args) {
        new Thread(()-> System.out.println("1.8特性1")).start();

        new Thread(()-> {
            for (int i = 0; i < 500; i++) {
                System.out.println(i);
            }
        }).start();
        new Thread(()-> System.out.println("1.8特性")).start();
    }

}
