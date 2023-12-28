package arrays_Programming;

public class Sum {
public static void main(String[] args) {
	int[] a= {1,2,4,3,5,7};
	int sum=0;
	int n=a.length;
	for(int i=0;i<n;i++)
	{
		sum =sum+a[i];
	}
System.out.println(sum);
}
}
