package arrays_Programming;

public class Avg_Element {
	public static void main(String[] args) {
		
	
 int[] a= {2,3,5,6,23};
 int sum=0;
 int n=a.length;
 for(int i=0;i<n;i++)
 {
	 sum=sum+a[i];
 }
 double avg=sum/n;
  System.out.println(avg);
 }
}

