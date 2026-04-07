// L7P1
// Creating the thread "hello world" and printing it without using the life cycle 

public class ThreadDemo extends Thread{
	
	ThreadDemo(){

	}
	ThreadDemo(String str){
		super(str);
	}
	public static void main(String...args){
		// Method 1
		ThreadDemo t1 = new ThreadDemo("Hello World 1");
		System.out.println(t1.getName());

		// Method 2
		ThreadDemo t2 = new ThreadDemo();
		t2.setName("Hello World 2");
		System.out.println(t2.getName());
	}
}
