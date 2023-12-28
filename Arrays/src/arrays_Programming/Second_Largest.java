package arrays_Programming;

public class Second_Largest {
	public static int secElement(int[] a)
	{
		int  maxElement=a[0];
		int n=a.length;
		int secElement=a[0];
		for (int i=0;i<n;i++)
		{
			int ele=a[i];
			if(secElement>maxElement)
			{
				secElement=ele;
						
			}
		}
		return secElement;
	}
	public static void main(String[] args) {
		int[] a= {21,12,2,4,2,31};
		System.out.println(secElement(a));
	}
	}