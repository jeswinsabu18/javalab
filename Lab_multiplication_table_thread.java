package java_programs;
import java.util.Scanner;
public class Lab_multiplication_table_thread {
		public static void main(String[] args) {
			int num1,num2,num3;
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the Table you want to run by thread1:");
			num1=sc.nextInt();
			System.out.println("Enter the Table you want to run by thread2:");
			num2=sc.nextInt();
			System.out.println("Enter the Table you want to run by thread3:");
			num3=sc.nextInt();
			Multiplication_table m=new Multiplication_table();
			Mythread1 t=new Mythread1(m,num1);
			Mythread2 z=new Mythread2(m,num2);
			Mythread3 v=new Mythread3(m,num3);
			t.start();
			z.start();
			v.start();
			
			}

	} 
	class Multiplication_table{
		synchronized void printmultiplicationTable(int number) {
			System.out.println("multiplication table of "+number+":");
				for(int i=1;i<=10;i++) {
					System.out.println(number+"X"+i+"="+i*number);
				
			}
			
		}
	}
	class Mythread1 extends Thread{
		Multiplication_table t;
		int num1;
		 Mythread1(Multiplication_table t,int num1) {
			this.t=t;
			this.num1=num1;
		}
		 public void run() {
			
			 t.printmultiplicationTable(num1);
		 }
		
	}
	class Mythread2 extends Thread{
		Multiplication_table t;
		int num2;
		Mythread2(Multiplication_table t,int num2){
			this.t=t;
			this.num2=num2;
		}
		public void run() {
			
			t.printmultiplicationTable(num2);
		}
	}
	class Mythread3 extends Thread{
		Multiplication_table t;
		int num3;
		Mythread3(Multiplication_table t,int num3){
			this.t=t;
			this.num3=num3;
		}
		public void run() {
			
			t.printmultiplicationTable(num3);
		}
	}
