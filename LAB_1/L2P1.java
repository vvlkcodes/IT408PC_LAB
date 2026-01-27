import java.util.Scanner;

public class L2P1{
	public static void main(String... args){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		int l = 100;
		outerFor:
		while(l-- > 0){
			int t = 0;
			for(int i=1;i<=l;i++){
				t++;
				System.out.println(i+"*"+n+"="+(i*n));
				if(t >= 10){
					t = 0;
					System.out.println("Enter 1 to continue and 0 to exit: ");
					int flag = s.nextInt();
					if(flag == 0) break outerFor;
				}
			}
		}
		System.out.println("Work Done");
	}
}
