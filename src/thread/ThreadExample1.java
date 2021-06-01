package thread;

public class ThreadExample1 extends Thread {
    private String message;
    public ThreadExample1(String message) {
      this.message = message;
    }
    public void run() {
      System.out.println("Thread message is:" + this.message);
    }
}