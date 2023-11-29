package javaclasswork;

public class Thread_multiplication_table {

	public static void main(String[] args) {
		Multiplication_table m=new Multiplication_table();
		Mythread1 t=new Mythread1(m);
		Mythread2 z=new Mythread2(m);
		z.setPriority(3);
		t.setPriority(6);
		t.start();
		z.start();
		
		}

} 
class Multiplication_table{
	synchronized void printmultiplicationTable(int number) {
		//synchronized(this){
			for(int i=1;i<=10;i++) {
				System.out.println(number+"X"+i+"="+i*number);
			//}
		}
		
	}
}
class Mythread1 extends Thread{
	Multiplication_table t;
	 Mythread1(Multiplication_table t) {
		this.t=t;
	}
	 public void run() {
		// System.out.println(Thread.currentThread().getName());
		// System.out.println(Thread.currentThread().getPriority());
		 t.printmultiplicationTable(6);
	 }
	
}
class Mythread2 extends Thread{
	Multiplication_table t;
	Mythread2(Multiplication_table t){
		this.t=t;
	}
	public void run() {
		// System.out.println(Thread.currentThread().getName());
		// System.out.println(Thread.currentThread().getPriority());
		t.printmultiplicationTable(7);
	}
}