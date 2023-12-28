package arrays_Programming;

public class Sum_Of_Even_Index {
public static void main(String[] args) {
	int[] a= {6,9,7,3,4,2};
	int n=a.length;
	int sum=0;
	for(int i=0;i<n;i++)
	{
		if(i%2==0)
		{
			sum=sum+a[i];
					{
						System.out.println(sum);
				
					}
		}
	}
}
}
