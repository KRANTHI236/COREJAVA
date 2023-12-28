package EXCEPTION_HANDLING;

public class Program {
public static void main(String[] args) {
	int n1=10;
	int n2=0;
	try {
		int c=n1/n2;
		System.out.println(c);
	}
	catch(ArithmeticException e)
	{
	System.out.println("hlo");	
	}
	System.out.println("kirannnnnnnn : Bevarshiiiiiiiiii :");
}

}
