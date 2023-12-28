package arrays_Programming;

public class Ascending_Order {
	public static void main(String[] args) {
		
	
	int[] a= {1,8,21,35,7};
	int n=a.length;
	int j=1;
	while(j<=n)
	{
	for(int i=0;i<n-1;i++)
	{
		if (a[i]>a[i+1])
		{
			int ele=a[i];
			a[i]=a[i+1];
			a[i+1]=ele;
		}
	}
	j++;	
	}
	for(int i=0;i<n;i++)
	{
		System.out.println(a[i]);
	}
}

}


