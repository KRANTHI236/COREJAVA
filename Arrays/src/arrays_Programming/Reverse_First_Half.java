package arrays_Programming;

public class Reverse_First_Half {
public static void main(String[] args) {
	int[] a= {1,2,3,4,5,6};
	int len=a.length;
	int half=len/2;
	for(int j=half-1;j>=0;j--)
	{
		System.out.println(a[j]);
		
}
}
}