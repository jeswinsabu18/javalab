package test;

public class Exceptiondemo {
	public static void main(String[] args) {
		try
		{
			String str="123";
			int array[]=new int[5];
			System.out.println(Integer.parseInt(str));
			System.out.println("div ="+10/5);
			System.out.println(array[6]);
			
		}
		catch(NumberFormatException e) {
			System.out.println("sorry !numberformat");
			//e.printStackTrace();
		}
		catch(ArithmeticException e) {
			System.out.println("SORRY!! Arthmetic error");
		}
		catch(Exception e) {
			System.out.println("unexpected exception!!");
		}
		finally {
			System.out.println("hlo jeswin");
		}
	}

}
