package arrays_Programming;

public class Even_Odd_SeparateArray {
	public static void main(String[] args) {
		int[] a= {2,3,4,1,6,5};
		int n=a.length;
		System.out.println("even numbers are:");
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]+" ");
			}
		
		}
		
		System.out.println("odd numbers are:");
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==1)
			{
				System.out.println(a[i]+" ");
			}
		
	}

}
}