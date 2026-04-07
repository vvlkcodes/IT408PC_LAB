// L7P3
// Creating the thread and printing the life cycle using Thread (class) 

public class ThreadDemo2 extends Thread{
	
	ThreadDemo2(){

	}
	ThreadDemo2(String str){
		super(str);
	}
	public static void main(String...args) throws Exception{
		ThreadDemo2 t1 = new ThreadDemo2("Thread-A");
		System.out.println(t1.getState());

		t1.start();
		System.out.println(t1.getState());

		Thread.sleep(500);
		System.out.println(t1.getState());
		t1.join();
		System.out.println(t1.getState());		
	}

	@Override
	public void run(){
		System.out.println("At present the thread -"+this.getName()+"- is running");

		try{
			for(int i=0;i<=3;i++){
				System.out.println("In the loop number: "+i);
				System.out.println(this.getState());
				this.sleep(1000);
			}
			this.sleep(500);
		}catch(Exception e){}		
	}
}
