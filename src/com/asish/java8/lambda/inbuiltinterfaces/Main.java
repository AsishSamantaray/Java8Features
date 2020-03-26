package com.asish.java8.lambda.inbuiltinterfaces;

public class Main {
    public static void main(String[] args) {

        /* (Option-1) => Without using lambda function */
//        Runnable runnable = new MyRunnableImpl();
//        Thread thread = new Thread(runnable);
//        thread.start();

        /* (Option-2) => Without using lambda function */
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Using anonymous Inner class..");
//                for (int i = 1; i <= 10; i++) {
//                    System.out.println("Child Thread..");
//                }
//            }
//        }).start();

        /* With lambda function */
        new Thread(() -> {
            System.out.println("Using Lambda Function..");
            for (int i = 1; i <= 10; i++) {
                System.out.println("Child Thread..");
            }
        }).start();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Main Thread..");
        }
    }
}
