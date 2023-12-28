package arrays_Programming;

public class Arithmetic_Operations {

	 public static void main(String[] args) {
		
		 int [] a= {3,4,2,1,3,4};
		 int n =a.length;
		 int sum =0;
		 int prod=1;
		 int sub=1;
		 int div=3;
		 for(int i=0;i<n-1;i++) {
			 sum=sum+a[i];
			 sub=sub-a[i];
			 prod=prod*a[i];
			 div=div/a[i];
			 System.out.println(sum);
			 //System.out.println(sub);
			 //System.err.println(prod);
			 //System.out.println(div);
		 }
	}
}
