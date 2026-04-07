// L7P4
// Creating the thread using Runnable (Interface) 

public class RunnableDemo implements Runnable{
	public static void main(String...args) throws Exception{
		RunnableDemo r1 = new RunnableDemo();
		Thread t1 = new Thread(r1, "Thread-A");
		System.out.println(t1.getState());

		t1.start();
		System.out.println(t1.getState());

		Thread.sleep(500);
		System.out.println(t1.getState());
		t1.join();
		System.out.println(t1.getState());		
	}

	public void run(){
		String name = Thread.currentThread().getName();
		System.out.println("At present the thread -"+name+"- is running");

		try{
			for(int i=0;i<=3;i++){
				System.out.println("In the loop number: "+i);
				System.out.println(Thread.currentThread().getState());
				Thread.currentThread().sleep(1000);
			}
			Thread.currentThread().sleep(500);
		}catch(Exception e){}		
	}
}
