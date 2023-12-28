package arrays_Programming;

public class Avg_Of_Odd_Index_Elements {
public static void main(String[] args) {
	int[] a= {1,3,2,4,6,7,8};
	int n=a.length;
	int c=0;
	int sum=0;
	for(int i=0;i<n;i++)
	{
		int ele=a[i];
		if(i%2!=0)
		{
			sum=sum+a[i];
			c++;
					
		}
	}
	double avg=sum/c;
	System.out.println(avg);
}
}
