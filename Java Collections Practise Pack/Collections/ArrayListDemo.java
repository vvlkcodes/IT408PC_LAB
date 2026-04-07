// Problem 1
// ArrayList

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ArrayListDemo{
	public static void main(String...args){
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int n = 1;
		
		System.out.println("You can follow the below listed commands to manipulate the list: ");
		System.out.println("ADD X");
		System.out.println("ADD_AT I X");
		System.out.println("SET I X");
		System.out.println("REMOVE_AT I");
		System.out.println("REMOVE_VAL X");
		System.out.println("CONTAINS X");
		System.out.println("INDEX_OF X");
		System.out.println("RANGE L R");
		System.out.println("SORT");
		System.out.println("CLEAR");
		System.out.println("SIZE");
		System.out.println("");

		do{
			System.out.println("Enter 1 to pass command, Enter 0 to Exit: ");
			n = s.nextInt();
			if(n == 0) break;
			s.nextLine();
			System.out.println("Please Enter The Command: ");
			String str = s.nextLine();
			String[] strArr = str.split(" ");
			String command = strArr[0];
			int z;
			int x;

			switch(command){
				case "ADD":
					z = Integer.parseInt(strArr[1]);
					list.add(z);
					System.out.println("Added "+z+" to the list.");
					break;
				case "ADD_AT":
					z = Integer.parseInt(strArr[1]);
					x = Integer.parseInt(strArr[2]);
					list.add(z, x);
					System.out.println("Added "+x+" at "+z);
					break;
				case "SET":
					z = Integer.parseInt(strArr[1]);
					x = Integer.parseInt(strArr[2]);
					list.set(z, x);
					System.out.println("Replaced "+x+" at "+z);
					break;
				case "REMOVE_AT":
					z = Integer.parseInt(strArr[1]);
					list.remove(z);
					System.out.println("Removed element at the index "+z);
					break;
				case "REMOVE_VAL":
					z = Integer.parseInt(strArr[1]);
					list.remove((Integer) z);
					System.out.println("Removed "+z+" from the list");
					break;
				case "CONTAINS":
					z = Integer.parseInt(strArr[1]);
					System.out.println("The list contains "+z+"? "+list.contains(z));
					break;
				case "INDEX_OF":
					z = Integer.parseInt(strArr[1]);
					System.out.println("Index of "+z+" in the list is: "+list.indexOf(z));
					break;
				case "RANGE":
					z = Integer.parseInt(strArr[1]);
					x = Integer.parseInt(strArr[2]);
					System.out.println("Given Range consists of the following elements in the list :");
					System.out.println(list.subList(z, x));
					break;
				case "SORT":
					Collections.sort(list);
					System.out.println("The sorted List is: "+ list);
					break;
				case "CLEAR":
					list.clear();
					System.out.println("The list after clearing the elements: "+list);
					break;
				case "SIZE":
					System.out.println("The size of the list: "+list.size());
					break;
				default:
					System.out.println("Please pass a valid command!");
			}	
		}while(n != 0);

		System.out.println("The End");
	}
}