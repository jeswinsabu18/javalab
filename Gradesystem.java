
/*file			:	Gradesystem.java
 * Author		:	Jeswin sabu
 * version		:	1.0
 * description	:	to find the grade of given marks 
 * date			:	26/09/23
 */
package javalab;
import java.util.Scanner;
public class Gradesystem {
	public static void main(String[] args) {
		int totalMarks;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total marks out of 100");
		totalMarks=sc.nextInt();
		if(totalMarks>=90)
		{
			System.out.println("the grade:S ");
		}
		else if(totalMarks>=85&&totalMarks<90)
		{
			System.out.println("the grade:A+");
		}
		else if(totalMarks>=80&&totalMarks<85)
		{
			System.out.println("the grade:A");
		}
		else if(totalMarks>=75&&totalMarks<80)
		{
			System.out.println("the grade:B+");	
		}
		else if(totalMarks>=70&&totalMarks<75)
		{
			System.out.println("the grade:B");
		}
		else if(totalMarks>=65&&totalMarks<70)
		{
			System.out.println("the grade:c+");
		}
		else if(totalMarks>=60&&totalMarks<65)
		{
			System.out.println("the grade:C");
		}
		else if(totalMarks>=55&&totalMarks<60)
		{
			System.out.println("the grade:D+");
		}
		else if(totalMarks>=50&&totalMarks<55)
		{
			System.out.println("the grade:D");
		}
		else
		{
			System.out.println("the grade:F");
		}
			

}}
