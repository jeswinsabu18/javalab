package java_programs;
import java.util.Scanner;

public class QuicksortString {
	public static void main(String [] args) {
		 Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the number of strings");
		    int limit = sc.nextInt();
		    String[] array = new String[10];
		    System.out.println("Enter the strings:");
		    for (int i = 0; i < limit; i++) {
		      array[i] = sc.next();
		    }
		    quicksort(array, 0, limit - 1);
		    System.out.print("Sorted strings:");
		    for (int i=0;i<limit;i++) {
		      System.out.print(array[i]+ " ");
		    }
		    System.out.println();
		  }

		   static void quicksort(String[] array, int first, int last) {
		    if (first < last) {
		      int pivot = first;
		      int i = first;
		      int j = last;
		      while (i < j) {
		        while (i < last && array[i].compareToIgnoreCase(array[pivot]) <= 0) {
		          i++;
		        }
		        while (array[j].compareToIgnoreCase(array[pivot]) > 0) {
		          j--;
		        }
		        if (i < j) {
		          String temp = array[i];
		          array[i] = array[j];
		          array[j] = temp;
		        }
		      }
		      String temp = array[pivot];
		      array[pivot] = array[j];
		      array[j] = temp;
		      quicksort(array, first, j - 1);
		      quicksort(array, j + 1, last);
		    }
		  }
		}