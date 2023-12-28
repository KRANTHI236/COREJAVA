package arrays_Programming;

public class Array_Empty_Or_Not {
  public static void main(String[] args) {
	//int[] a= {2,3,4,5,32,2,2};
	  int[] a= {} ;
	  int n=a.length-1;
	  if(n<0) {
			System.out.println("empty");
		}
		else {
			System.out.println("not empty");
		}
	}
}
