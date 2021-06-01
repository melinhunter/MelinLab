package com.melin.thread;

import java.util.Random;

public class ThreadExample1 extends Thread {
    private String message;
    public ThreadExample1(String message) {
      this.message = message;
    }
    public void run() {
    	Random rand = new Random();
    	int max = 10;
    	int min = 1;
    	int c = rand.nextInt(max - min + 1) + min;
    	try {
			Thread.sleep(c*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	long id = Thread.currentThread().getId();
      System.out.println("Thread message is:" + this.message + "["+String.format("thread id is %o", id)+"][sleep "+c+" sec]");
    }
}