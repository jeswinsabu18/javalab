
/*file			:	Reverse.java
 * Author		:	Jeswin sabu
 * version		:	1.0
 * description	:	to print the reverse of  string
 * date			:	31/10/23
 */
package javalab;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		String str;
		int len,j=0;
		Scanner sc= new Scanner(System.in);
		char [] chararray;
		char [] chararray2=new char[30];
		System.out.println("enter the string ");
		str=sc.nextLine();
		chararray=str.toCharArray();
		len=str.length();
		for(int i=len-1;i>=0;i--) 
		{
			chararray2[j]=chararray[i];
				j++;	
		}
		System.out.println("the reversed string:");
		for(int i=0;i<len;i++) {
			System.out.print(chararray2[i]);
		}
		
	}

}
