package javalab;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizer_demo {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string contains number");
		String str=sc.nextLine();
		StringTokenizer input=new StringTokenizer(str);
		System.out.println("The entered numbers are:");
		while(input.hasMoreElements()) {
			int data=Integer.parseInt(input.nextToken());
			System.out.println(data);
			sum=sum+data;
		}
		System.out.println("The sum of numbers in string="+sum);

	}

}
