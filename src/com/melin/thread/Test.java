package com.melin.thread;

public class Test {
    public static void main(String args[]) throws Exception{
    	System.out.println("start");
    	System.out.println("Thread.activeCount() " + Thread.activeCount());
      ThreadExample1 thread1 = new ThreadExample1("message1");
      ThreadExample1 thread2 = new ThreadExample1("message2");
      ThreadExample1 thread3 = new ThreadExample1("message3");
      ThreadExample1 thread4 = new ThreadExample1("message4");
      ThreadExample1 thread5 = new ThreadExample1("message5");
      ThreadExample1 thread6 = new ThreadExample1("message6");
      ThreadExample1 thread7 = new ThreadExample1("message7");
      ThreadExample1 thread8 = new ThreadExample1("message8");
      ThreadExample1 thread9 = new ThreadExample1("message9");
      ThreadExample1 thread10 = new ThreadExample1("message10");
      thread1.start();
      thread2.start();
      thread3.start();
      thread4.start();
      thread5.start();
      thread6.start();
      thread7.start();
      thread8.start();
      thread9.start();
      thread10.start();
      int finished = 0;
      while(finished <= 1 || Thread.activeCount() > 1 )
      {
//    	  System.out.println("isAlive " + thread1.isAlive());
//    	  System.out.println("isDaemon " + thread1.isDaemon());
//    	  System.out.println("isInterrupted " + thread1.isInterrupted());
    	  Thread.sleep(1000);
    	  finished++;
    	  if(finished > 3 && thread1.isAlive())
    	  {
    		  thread1.interrupt();
    		  Thread.sleep(3000);
    		  System.out.println("thread1 is Alive ? " + thread1.isAlive());
    	  }
    	  System.out.println("Thread.activeCount() " + Thread.activeCount());
      }
      System.out.println("end");
    }
}