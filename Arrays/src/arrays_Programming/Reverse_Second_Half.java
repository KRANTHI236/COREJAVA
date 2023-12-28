package arrays_Programming;

public class Reverse_Second_Half {
public static void main(String[] args) {
	int[] a= {1,2,3,4,5};
	int len=a.length;
	int half=len/2;
	
	for(int j=a.length-1;j>=half;j--)
	{
		System.out.println(a[j]);
	}
}
}
