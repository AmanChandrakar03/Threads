package threading1.com;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		//create  subclass of Thread
		MyThread thread1 = new MyThread();
		
		//or
		
		//implement Runnable i/f and pass instance as an arg to Thread()
		MyRunnable runnable1 = new MyRunnable();
		Thread thread2 = new Thread(runnable1);
		
		thread1.start();
		//thread1.join();
		thread2.start();
		
//		thread1.run();
		System.out.println(Thread.activeCount());
		//System.out.println(1/0);

	}

}
