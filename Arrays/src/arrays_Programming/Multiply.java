package arrays_Programming;

public class Multiply {
	public static void main(String[] args) {
		int[] a= {1,2,3,5,4};
		int n=a.length;
		int prod=1;
		for(int i=0;i<n;i++)
		{
			prod=prod*a[i];
		}
	System.out.println(prod);
	}
}
       