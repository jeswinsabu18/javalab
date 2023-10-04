import java .util.Scanner;
public class Diaganalmatrix {
	public static void main(String[]args) {
		int row,col,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row and column");
		row=sc.nextInt();
		col=sc.nextInt();
		int[][] matrix=new int[row][col];
		System.out.println("enter the values to array");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++) {
				if(i==j) {
					matrix[i][j]=0;
				}
				if((i+j)==col-1)
						
				{
					matrix[i][j]=0;
				}
			}
	}
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++) {
				System.out.print(matrix[i][j]+"  ");
			}
			System.out.println();

	}
}}
