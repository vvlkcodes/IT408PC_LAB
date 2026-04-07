// L7P2
// Creating the thread "hello world" and printing it by using the life cycle 

public class ThreadDemo1 extends Thread{
	public static void main(String...args){
		ThreadDemo1 t = new ThreadDemo1();
		t.start();
	}

	@Override
	public void run(){
		System.out.println("Hello World");
	}
}

// when the start method is called, the run method id revoked! 
