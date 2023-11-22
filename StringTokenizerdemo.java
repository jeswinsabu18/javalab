package javalabs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class StringTokenizerdemo {

	public static void main(String[] args)throws FileNotFoundException,IOException {
		int data,even=0,odd=0;
		BufferedReader in=new BufferedReader(new FileReader("myfile.txt"));
		String str=in.readLine();
		StringTokenizer string=new StringTokenizer(str);
		while(string.hasMoreTokens()) {
			data=Integer.parseInt(string.nextToken());
			if(data%2==0) {
				 even++;
			}
			else{
				odd++;
			}
		}
		System.out.println("no of evennumbers="+even);
		System.out.println("no of odd numbers="+odd);

	}

}
