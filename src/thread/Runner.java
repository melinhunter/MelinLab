package thread;

public class Runner extends Task {
	
	
	
	
	public static void main(String args[]) 
	{
		Runner run = new Runner();
		run.run();
		
	}
	
	public void run()
	{
		System.out.println(Thread.currentThread().getId());
	}
}
