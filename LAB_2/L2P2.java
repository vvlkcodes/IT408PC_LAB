import java.util.Scanner;

public class L2P2{
	public static void main(String ... args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<arr.length;i++){
			arr[i] = s.nextInt();
		}

		System.out.println("checking if the array elements are prime or not: ");
		for(int element : arr){
			System.out.println("Is "+element+" a prime number? "+isPrime(element));
		}	

		int c = 0;
		for(int element : arr){
			if(isPrime(element)) c++;
		}	
		System.out.println("The total number of prime numbers in the given array are: "+c);

	}

	public static boolean isPrime(int n){
		for(int i=2;i<n;i++){
			if(n % i == 0) return false;
		}
		return true;
	}
}
