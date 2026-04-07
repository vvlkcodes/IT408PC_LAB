// L7P5
// Create 2 threads which print even and odd numbers from 1 to 20

class ThreadEO extends Thread{

	ThreadEO(String s){
		super(s);
	}
	public static void main(String...args)throws Exception{
		ThreadEO te = new ThreadEO("Even");
		ThreadEO to = new ThreadEO("Odd");
		to.start();
		to.join(); // use join only when you have to terminate the first thread 
		te.start();
	}

	@Override
	public void run(){
		try{
			for(int i=1;i<=20;i++){
				if(this.getName().equals("Even") && (i%2) == 0){
					System.out.println(this.getName()+" : "+i);
					Thread.sleep(200);
				}
				else if(this.getName().equals("Odd") && (i%2) != 0){
					System.out.println(this.getName()+" : "+i);
					Thread.sleep(200);
				}
			}
		}catch(Exception e){}
	}
}

/* output
	Odd : 1
	Even : 2
	Odd : 3
	Even : 4
	Odd : 5
	Even : 6
	Odd : 7
	Even : 8
	Odd : 9
	Even : 10
	Odd : 11
	Even : 12
	Odd : 13
	Even : 14
	Odd : 15
	Even : 16
	Odd : 17
	Even : 18
	Odd : 19
	Even : 20
*/
