
/*file			:	Matrixmultiplication.java
 * Author		:	Jeswin sabu
 * version		:	1.0
 * description	:	to multiply two given matrix
 * date			:	10/10/23
 */
package javalab;
import java.util.Scanner;
public class MatrixMultiplication {

	public static void main(String[] args) {
		int row1,col1,row2,col2,i,j,k;
		Scanner sc =new Scanner (System.in);
		System.out.println("enter the row and coloumn of two matrix");
		row1=sc.nextInt();
		col1=sc.nextInt();
		row2=sc.nextInt();
		col2=sc.nextInt();
		int[][]matrix1=new int[row1][col1];
		int[][]matrix2=new int[row2][col2];
		int[][]resultmatrix=new int[row1][col2];
		if(row2!=col1)
		{
		    System.out.println("invalid order");
		}
		else
		{
		
		System.out.println("enter the values of first matrix");
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col1;j++)
			{
				matrix1[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("enter the values of second matrix");
		for(i=0;i<row2;i++)
		{
			for(j=0;j<col2;j++)
			{
				matrix2[i][j]=sc.nextInt();
			}
		}
		System.out.println("first matrix:");
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col1;j++)
			{
				System.out.print(matrix1[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("second matrix:");
		for(i=0;i<row2;i++)
		{
			for(j=0;j<col2;j++)
			{
				System.out.print(matrix2[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("multiplied matrix:");
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col2;j++)
			{
				resultmatrix[i][j]=0;
				for(k=0;k<col1;k++)
				{
					resultmatrix[i][j]=resultmatrix[i][j]+matrix1[i][k]*matrix2[k][j];
				}
				System.out.print(resultmatrix[i][j]+"\t");
					
			}
			System.out.println();
						
				
		}
		}
		

	}

}
