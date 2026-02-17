import java.lang.Exception;
import java.util.*;

class AgeException extends Exception{
	public AgeException(String msg){
		super(msg);
	}
}

public class L5P1{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		try{
			int age = s.nextInt();
			if(age < 18) throw new AgeException("Sorry you are not eligible!");
			else System.out.println("Please cast your vote");
		}catch(AgeException ae){
			System.out.println(ae.getMessage());
		}
	}
}
