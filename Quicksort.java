package javalab;

import java.util.Scanner;

public class Quicksort {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit of array");
		int limit=sc.nextInt();
		int array[]=new int[limit];
		System.out.println("Enter the elements of array:");
		for(int i=0;i<limit;i++) {
			array[i]=sc.nextInt();
		}
		quicksort(array, 0, limit-1);
		System.out.print("Sorted array:");
		for(int i=0;i<limit;i++) {
			System.out.print(array[i]+"  ");
		}
		System.out.println();
	}
public static void quicksort(int array[],int first,int last) {
	int pivot,j,temp,i;
    if(first<last){
        pivot=first;
        i=first;
        j=last;
        while(i<j){
            while(array[i]<=array[pivot]&&i<last)
                i++;
            while(array[j]>array[pivot])
                j--;
            if(i<j){
                temp=array[i];
                 array[i]=array[j];
                 array[j]=temp;
            }
        }
        temp=array[pivot];
        array[pivot]=array[j];
        array[j]=temp;
        quicksort(array,first,j-1);
        quicksort(array,j+1,last);
   }
}
}
