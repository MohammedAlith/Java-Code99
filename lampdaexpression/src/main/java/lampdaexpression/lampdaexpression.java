package lampdaexpression;



public class lampdaexpression {

	public static void main(String[] args) throws InterruptedException{
		
		
		Thread thread = new Thread(()->{
			System.out.println("Thread is running using lambda Expression");
		});
		
		Thread th = new Thread(()->{
			System.out.println("text");
		});
 thread.start();
 Thread.sleep(5000);
 th.start();
	}

}
