 package arrays_Programming;

public class Right_Shift_By_One_Element {
public static void main(String[] args) {
	int[] a= {1,9,7,4,6,5};
	int n=a.length;
	int j=1;
	int ele=a[n-1];
	while(j!=0) {
	for(int i=n-1;i>0;i--)
	{
		a[i]=a[i-1];
		}
	a[0]=ele;
	j--;
}
for(int i=0;i<n;i++)
{
	System.out.print(a[i]);
}
}
}
