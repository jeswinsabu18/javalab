
/*file			:	Banking.java
 * Author		:	Jeswin sabu
 * version		:	1.0
 * description	:	to make small bank application
 * date			:	17/11/23
 */
package javalab;
import java.util.Scanner;
class InvalidAmountException extends Exception{
	InvalidAmountException(String str){
		super(str);
	}
}
class InsufficientAmountException extends Exception{
	InsufficientAmountException(String str2){
		super(str2);
	}
}
public class Banking {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int j;
		InvalidAmountException amountException=new InvalidAmountException("Invalid amount ");
		InsufficientAmountException amountException2=new InsufficientAmountException("Insufficient balance");
		int limit,i,choice;
		System.out.println("enter the number customers you want to enter");
		limit=sc.nextInt();
		Customer[] customer=new Customer[limit];
		for(i=0;i<limit;i++) {
			customer[i]=new Customer();
		customer[i].set_customer_details();
	    }
		for(i=0;i<limit;i++) {
		customer[i].printdetails();
		}
		do {
			System.out.printf("1.display account details\n "
					+ "2.search by account number\n 3. deposit the amount\n "
					+ "4.withdraw the amount\n 5.exit\n");;
			System.out.println("enter your choice");
			choice=sc.nextInt();
			switch(choice) {
		     case 1:
				for(i=0;i<limit;i++) {
					customer[i].printdetails();
					}
				break;
		     case 2:
		    	 int searchaccNo;
	    	   System.out.println("Enter the account number you want to search");
		       searchaccNo=sc.nextInt();
		       j=0;
		       for(i=0;i<limit;i++) {
		    	   if(customer[i].acc_no==searchaccNo) {
					customer[i].printdetails();
					j++;
					}
		       }
		    	   if(j==0) {
		    		   System.out.println("Account not found!!");
		    	   }
		       
		       break;
		     case 3:
		    	   System.out.println("Enter the account number you want to deposit amount");
			       searchaccNo=sc.nextInt();
			       try {
			       System.out.println("enter the amount to deposit");
			       int depositamount=sc.nextInt();
			       if(depositamount<=0) {
			    	   throw amountException;
			       }
			       else {
			    	   j=0;
			       for(i=0;i<limit;i++) {
			    	   if(customer[i].acc_no==searchaccNo) {
			    		   customer[i].balance= customer[i].balance+depositamount;
						customer[i].printdetails();
						j++;
						}
			       }
			       if(j==0){
			    		   System.out.println("Account not found!!");
			    	   }
			       
			       }
			}
			       catch(InvalidAmountException e) {
			    	   System.out.println(e.getMessage());
			       }
			       break;
		     case 4:
		    	 System.out.println("Enter the account number you want to withdraw amount");
			       searchaccNo=sc.nextInt();
			       try {
			       System.out.println("enter the amount to withdraw");
			       int withdrawAmount=sc.nextInt();
			       if (withdrawAmount<=0) {
			    	   throw amountException;
			       }
			       else {
			    	   j=0;
			    	   for(i=0;i<limit;i++) {
				    	   if(customer[i].acc_no==searchaccNo) {
				    		   j++;
				    		 if(withdrawAmount>customer[i].balance)  {
				    			 throw amountException2;
				    		 }
				    		 else
				    		 {
				    			 customer[i].balance=customer[i].balance-withdrawAmount;
				    			 customer[i].printdetails();
				    		 }
				    		 
			       }
			    	   }
				    	   if(j==0) {
				    		   System.out.println("Account not found!!");
				    	   }
			       
			       }
			       }
			       catch(InvalidAmountException e) {
			    	   System.out.println(e.getMessage());  
			       }
			       catch(InsufficientAmountException e) {
			    	   System.out.println(e.getMessage());
			       }
			       break;
			default:
			}
		}
		while(choice!=5);

}}
 class Customer{
	 Scanner sc=new Scanner(System.in);
	int acc_no,balance;
	String name,accountType;
	public void set_customer_details()
	{
		System.out.println("Enter the name=");
		name=sc.nextLine();
		System.out.println("Enter the account number=");
		acc_no=sc.nextInt();
		System.out.println("Enter the account type=");
		accountType=sc.next();
		System.out.println("Enter the balance=");
		balance=sc.nextInt();

	}
	public void printdetails()
	{
		System.out.println("________________________________");
		System.out.println("CUSTOMER DETAILS:");
		System.out.println("Customer Name="+name);
		System.out.println("Account Balance="+balance);
		System.out.println("Accountnumber="+acc_no);
		System.out.println("Accounttype="+accountType);
		System.out.println("________________________________");
	}
}
