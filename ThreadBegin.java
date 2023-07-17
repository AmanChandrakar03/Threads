package threading.com;

public class ThreadBegin {

	public static void main(String[] args) throws InterruptedException {
		
//		System.out.println(Thread.activeCount());
//		
//		System.out.println(Thread.currentThread().getName()); //to see name of thread
		
		//System.out.println(Thread.currentThread());
		
//		Thread.currentThread().setName("Mainnnnn"); //to set name of thread
//		System.out.println(Thread.currentThread().getName()); Mainnn
		
//		System.out.println(Thread.currentThread().getPriority()); //5
//		Thread.currentThread().setPriority(1);
//		System.out.println(Thread.currentThread().getPriority());
//		
//		System.out.println(Thread.currentThread().isAlive());
//		System.out.println(Thread.currentThread().isDaemon()); //false
//		System.out.println(Thread.currentThread().isInterrupted()); //false
//		
//		for(int i = 3;i>0;i--) {
//			System.out.println(i);
//			Thread.sleep(1000);
//			
//		}
//		System.out.println("You are done");
		
		MyThread thread2 = new MyThread();
		thread2.setDaemon(true);
		System.out.println(thread2.isDaemon());
		thread2.start();
		//thread2.run();
		//System.out.println(thread2.isAlive());
		
		//thread2.setName("Thread - 2");
		
		//System.out.println(thread2.getName());
		
		//System.out.println(thread2.activeCount());
		
		
			
	}

}
