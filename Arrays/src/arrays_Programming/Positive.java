package arrays_Programming;

public class Positive {
public static void main(String[] args) {
	int[] a= {1,2,3,-1,-3};
	int n=a.length;
	for(int i=0;i<n;i++)
	{
		int ele=a[i];
		if(a[i]>=0)
		{
			System.out.println(a[i]);
		}
	}
}
}
