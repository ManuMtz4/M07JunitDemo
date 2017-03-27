package m07junitdemo20test;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author manuel y angel
 */
public class JunitDemo20Test {
	@Test
	public void testConcurrent() throws InterruptedException {
		ExecutorService exec = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			int finalI = i;
			exec.execute(() -> runTestThread("ThreadTest " + finalI));
		}
		exec.shutdown();
		exec.awaitTermination(50, TimeUnit.SECONDS);
	}

	private void runTestThread(String threadName) {
		try {
			System.out.println("Soy thread " + threadName);
			Thread.sleep(2000);
			System.out.println("Fin de thread " + threadName);
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
