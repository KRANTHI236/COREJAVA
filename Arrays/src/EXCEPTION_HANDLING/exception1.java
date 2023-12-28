package EXCEPTION_HANDLING;

public class exception1 {
public static void main(String[] args) {
	String st=null;
	int a=10;
	int b=0;
	try
	{
		System.out.println(a/b);
		System.out.println(st.charAt(0));
	}
	catch(NullPointerException e)
	{
		System.out.println("oreyyyy kiranaaaaa");
		
	}
	catch(ArithmeticException e)
	{
		System.out.println("wasteee kranthiiiii");
	}
}
}
