package java_programs;

import java.util.Scanner;

public class Exception_duplicate_number_in_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements in array");
		int limit=sc.nextInt();
		int [] array=new int[limit];
		System.out.println("enter the integers");
		for(int i=0;i<limit;i++) {
			array[i]=sc.nextInt();
		}
		for(int i=0;i<limit;i++) {
			for(int j=i+1;j<limit;j++) {
				if(array[i]==array[j]) {
					throw new ArithmeticException("duplicate numbers ");
				}
			}
			System.out.print(array[i]);
		}
	}

}
