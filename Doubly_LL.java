/*file			:	Doubly_LL.java
 * Author		:	Jeswin sabu
 * version		:	1.0
 * description	:	implementation of doubly linked list
 * date			:	08/12/23
 */
package javalab;

import java.util.LinkedList;
import java.util.Scanner;

public class Doubly_LL {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		DoublyLinkedList<Integer> doublyLinkedList=new DoublyLinkedList<Integer>();
		int choice;
		do {
			System.out.println("________________________");
			System.out.printf("1.insert at front\n 2.insert at end\n 3.insert at any position\n "
					+ "4.remove at any position\n 5.display\n 6.exit\n");
			System.out.println("enter the choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the element to be added");
				int element=sc.nextInt();
				doublyLinkedList.insertfront(element);
				break;
				
			case 2:
				System.out.println("Enter the element to be added");
				 element=sc.nextInt();
				 doublyLinkedList.insertend(element);
				 break;
			case 3:
				System.out.println("Enter the element to be added");
				 element=sc.nextInt();
				System.out.println("Enter the position");
				int index=sc.nextInt();
				 doublyLinkedList.insertAtAnyPos(index, element);
				 break;
			case 4:
				System.out.println("Enter the position to be removed");
				index=sc.nextInt();
				 doublyLinkedList.remove(index);
				 break;
			case 5:
				System.out.println("List:");
				doublyLinkedList.display();
				break;
			case 6:
				break;
			default:
				System.out.println("Wrong choice");
			}
		}while(choice!=6);
	}

}
class DoublyLinkedList<z>{
	private LinkedList<z> list=new LinkedList<>();
	public void insertfront(z element) {
		list.addFirst(element);
	}
	public void insertend(z element) {
		list.addLast(element);
	}
	public void insertAtAnyPos(int index,z element) {
		list.add(index, element);
	}
	public void remove(int index) {
		list.remove(index);
	}
	public void display() {
		for(z element:list) {
			System.out.print(element+" ");
		}
		System.out.println();
	}
}
