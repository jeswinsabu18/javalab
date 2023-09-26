/*file			:	Attendencemark.java
 * Author		:	Jeswin sabu
 * version		:	1.0
 * description	:	find attendence mark from attendence percentage
 * date			:	26/09/23
 */
package javalab;
import java.util.Scanner;
public class Attendencemark {
	public static void main(String[] args) {
		int attendencePercentage;
		float attendenceMark;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the attendence percentage");
		attendencePercentage=sc.nextInt();
		if(attendencePercentage>=90)
		{
			attendenceMark=10;
			System.out.println("attendence mark="+attendenceMark);
		}
		else {
			attendenceMark=(float)attendencePercentage/10;
			System.out.println("attendence mark="+attendenceMark);
		
		}
	}

}
