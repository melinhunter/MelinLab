package course.c12.testMulti;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class MultiThreadTest {
	public static void main(String[] args) {
		System.out.println("MultiThreadTest starts at: " + new Date());
		ExecutorService es = Executors.newCachedThreadPool();
		String host = "localhost";
		
		Map<SocketBean, Future<SocketBean>> callables = new HashMap<>();
		// loop to create and submit a bunch of Callable instances
		for (int port = 10000; port < 10005; port++) {
			SocketBean bean = new SocketBean(host, port);
			SocketClientCallable callable = new SocketClientCallable(bean);
			Future<SocketBean> future = es.submit(callable);
			callables.put(bean, future);
		}
		
		//shutdown ExecutorService
		es.shutdown();
		try {
			es.awaitTermination(5, TimeUnit.SECONDS);
		} catch (InterruptedException ex) {
			System.out.println("Stopped waiting early");
		}

		// get result
		for (SocketBean bean : callables.keySet()) {
			Future<SocketBean> future = callables.get(bean);
			try {
				bean = future.get();
				System.out.println("Call " + bean.host + ":" + bean.port + ", and get: " + bean.feedback + " at " + new Date());
			} catch (ExecutionException | InterruptedException ex) {
				System.out.println("Error talking to " + bean.host + ":" + bean.port);
			}
		}
	}
}
