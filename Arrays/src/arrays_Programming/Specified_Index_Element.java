package arrays_Programming;

public class Specified_Index_Element {
public static void main(String[] args) {
	int[] a= {1,2,3,4,5};
	int n=a.length;
	int s=3;
	for(int i=0;i<n;i++)
	{
		if(s==i)
		{
			System.out.println(a[i]);
		}
	}
	
}
}
