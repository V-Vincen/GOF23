package com.example.gof23.creational_patterns.singleton;

import java.util.concurrent.CountDownLatch;

public class ClientTimes {
    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();
        int threadNum = 10;
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);

        for (int i = 0; i < threadNum; i++) {
            new Thread(new Runnable() {
                public void run() {
                    for (int i = 0; i < 1000000; i++) {
                        //分别对下面的单例模式进行测试
                        SingletonHungry hungry = SingletonHungry.getInstance();
//                        SingletonLazy lazy = SingletonLazy.getInstance();
//                        SingletonDC dc = SingletonDC.getInstance();
//                        SingletonSIC sic = SingletonSIC.getInstance();
//                        SingletonEnum anEnum = SingletonEnum.INSTANCE;
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }

        //main线程阻塞，直到计数器变为0，才会继续执行
        countDownLatch.await();
        long end = System.currentTimeMillis();
        System.out.println("总耗时：" + (end - start));
    }
}
