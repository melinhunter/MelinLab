package com.melin.thread;

public class ExampleRunnable implements Runnable {
	private int i; // 將被共用!!

	@Override
	public void run() {
		for (i = 0; i < 10; i++) {
			System.out.print("i:" + i + ", ");
			//sleep(0.2);
		}
	}

	public static void main(String[] args) {
		ExampleRunnable r1 = new ExampleRunnable();
		Thread t1 = new Thread(r1);
		t1.start();
		Thread t2 = new Thread(r1);
		t2.start();
	}
	
	private static void sleep(double sec)
	{
		try {
			Thread.sleep((int) (sec * 1000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
