package com.melin.thread;

public class ExampleThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("i:" + i);
			sleep(0.1);
		}
	}

	public static void main(String[] args) {
		System.out.println("START ----------------");
		ExampleThread t1 = new ExampleThread();
		t1.start();
		System.out.println("END ----------------");
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
