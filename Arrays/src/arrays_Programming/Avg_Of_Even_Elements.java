package arrays_Programming;

public class Avg_Of_Even_Elements {
public static void main(String[] args) {
	int[] a= {1,3,2,4,6,5,7};
	int n=a.length;
	int sum=0;
	int c=0;
	for(int i=0;i<n;i++)
	{
		int ele=a[i];
		if(i%2==0)
		{
			sum=sum+ele;
			c++;
		}
	}
	int avg=sum/c;
	System.out.println(avg);
}
}
