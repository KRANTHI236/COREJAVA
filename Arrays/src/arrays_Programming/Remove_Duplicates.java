package arrays_Programming;

public class Remove_Duplicates {
public static void main(String[] args) {
	int[] a= {1,1,2,2,3,3,3,4};
	int n=a.length;
	int j=0;
	int[] b=new int[a.length];
	for(int i=0;i<n-1;i++)
	{
		if(a[i]!=a[i+1])
	{
		b[j]=a[i];
		j++;
	}
	}
	b[j]=a[n-1];
	for(int i=0;i<=j;i++)
	{
		System.out.println(b[i]);


				}
		
	}
}
	