import java.util.Scanner;

public class L2P1{
	public static void main(String... args){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		int l = 100;
		outerFor:
		for(int j=1;j<=n;j++){
			int t = 0;
			for(int i=1;i<=10;i++){
				System.out.println(j+"*"+i+"="+(i*j));
				if(i >= 10){
					System.out.println("Enter 1 to continue and 0 to exit: ");
					switch(s.nextInt()){
						case 0: 
							break outerFor;
						case 1:
							continue;
						default:
							System.out.println("Invalid input");
					}
				}
			}

		}
		System.out.println("Work Done");
	}
}
