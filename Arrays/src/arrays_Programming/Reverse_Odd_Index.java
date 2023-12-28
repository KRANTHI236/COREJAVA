package arrays_Programming;

public class Reverse_Odd_Index {
public static void main(String[] args) {
	int[] a= {2,5,3,6,7,4};
	int n=a.length;
	for(int i=n-1;i>=0;i--)
	{
		if(i%2!=0)
		{
			System.out.println(a[i]);
		}
	}
}
}
