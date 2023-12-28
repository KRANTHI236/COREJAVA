package number_programs;

public class Fibonacci_Series {
 
	public static void fibnocci(int num) {
		int i=0;
		int j=num;
		int a=0;
		int b=1;
		while(i<j) {
			int c=a+b;
			System.out.println(c);
			i++;
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {
		//int a=0;
		//int b=1;
		fibnocci(10);
		
	}
		
		
		
		
	}

