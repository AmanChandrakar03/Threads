package threading.com;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		//System.out.println("My Thread");
		
		if(this.isDaemon()) {
			System.out.println("This is a daemon thread that s running");
		}else{
			System.out.println("this is a user thread that is running ");
		}
	}
	
}
