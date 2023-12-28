package arrays_Programming;

public class Second_Min_Element {
	public static int minElement(int[] a)
	{
		int  minElement=a[0];
		int n=a.length;
		int secElement=a[0];
		for (int i=0;i<n;i++)
		{
			int ele=a[i];
			if(secElement<minElement)
			{
				secElement=ele;
						
			}
		}
		return secElement;
	}
	public static void main(String[] args) {
		int[] a= {21,12,2,4,2,31};
		System.out.println(minElement(a));
	}
	}