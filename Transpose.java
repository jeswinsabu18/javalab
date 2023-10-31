
/*file			:	Transpose.java
 * Author		:	Jeswin sabu
 * version		:	1.0
 * description	:	to print the transpose of matrix
 * date			:	31/10/23
 */
package javalab;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		int i,j,row,col;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the row and coloumn of matrix");
		row=sc.nextInt();
		col=sc.nextInt();
		int [][]matrix=new int[row][col];
		int [][]transposeMatrix=new int[col][row];
		System.out.println("enter the value of array");
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		if(row!=col)
			System.out.println("invalid order");
		else
		{
			System.out.println("the transposed matrix:");
			for(i=0;i<row;i++) {
				for(j=0;j<col;j++) {
					transposeMatrix[i][j]=matrix[j][i];
					System.out.print(transposeMatrix[i][j]+"  ");
				}
				System.out.println();	
			}	
		}
		
	}

}
