
/*file			:	SmallestNumberInArray.java
 * Author		:	Jeswin sabu
 * version		:	1.0
 * description	:	to print the second smallest number in array
 * date			:	31/10/23
 */
package javalab;
import java.util.Scanner;
public class SmallestNumberInArray {

	public static void main(String[] args) {
		int limit,i,j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit of array");
		limit=sc.nextInt();
		int []array=new int[limit];
		System.out.println("enter the values of array");
		for( i=0;i<limit;i++) {
			array[i]=sc.nextInt();
		}
		for(i=0;i<limit;i++) {
			for(j=i+1;j<limit;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("the second smallest elment in array="+array[1]);
		

	}

}
