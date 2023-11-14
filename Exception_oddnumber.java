package java_programs;

import java.util.Scanner;

public class Exception_oddnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("enter the number");
		num=sc.nextInt();
		if(num%2!=0) {
			throw new ArithmeticException("odd number");
		}
		else 
			System.out.println("number is even");
	}

}
