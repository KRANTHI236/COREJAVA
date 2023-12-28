package arrays_Programming;

public class Reverse_Even_Index {
public static void main(String[] args) {
	int[] a= {1,2,3,4,5,6};
	int n=a.length;
	for(int i=n-1;i>=0;i--)
	{
		if(i%2==0)
		{
			System.out.println(a[i]);
		}
	}
}
}
