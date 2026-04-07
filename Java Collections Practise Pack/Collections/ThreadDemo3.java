// L7P5
//  

class ThreadDemo3 extends Thread{

	ThreadDemo3(String s){
		super(s);
	}
	public static void main(String...args)Throws Exception{
		ThreadDemo3 te = new ThreadDemo3("Even");
		ThreadDemo3 to = new ThreadDemo3("Odd");
		te.start();
		t0.start();
	}

	@Override
	public void run(){
		try{
			for(int i=1;i<=20;i++){
				if(this.getName().equals("Even") && (i&1) == 0){
					System.out.println(this.getName()+" : "+i);
					Thread.sleep();
				}
				else{
					if((i&1) != 0){
						System.out.println(this.getName()+" : "+i);
						Thread.sleep();
					} 
				}
			}
		}catch(Exception e){}
	}
}