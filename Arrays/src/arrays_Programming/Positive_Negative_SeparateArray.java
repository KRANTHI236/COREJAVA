package arrays_Programming;

public class Positive_Negative_SeparateArray {
public static void main(String[] args) {
	int[] a= {2,1,3,4,-1,-3,-4};
	int n=a.length;
	System.out.println("positive elements are : ");
	for(int i=0;i<n;i++)
	{
		int ele=a[i];
		if(a[i]>=0)
		{
			System.out.println(a[i]+" ");
		}
	}
	System.out.println("negative elements : ");
	for(int i=0;i<n;i++)
	{
		int ele=a[i];
		if(a[i]<=0)
		{
			System.out.println(a[i]+" ");
		}
	}
}
}
