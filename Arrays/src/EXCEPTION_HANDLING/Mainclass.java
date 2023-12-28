package EXCEPTION_HANDLING;

public class Mainclass {
	public static void main(String[] args) {
  String str=null;
  try {
	  System.out.println(str.charAt(0));
  }
  catch(NullPointerException e)
  {
	  System.out.println("leeee kiran bevarshi");
  }
  int a=10;
  int b=20;
  System.out.println(a+b);
	}

}
