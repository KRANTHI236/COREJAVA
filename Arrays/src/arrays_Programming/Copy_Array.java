package arrays_Programming;

public class Copy_Array {

	 public static void main(String[] args) {
		
		 int [] a= {2,4,2,212,34,78};
		 int b[]= new int[a.length];
		 int c=0;
		 for(int i=0;i<a.length;i++) {
			 b[c]=a[i];
			 c++;
		 }
		 for(int i=0;i<b.length;i++) {
			 System.out.print( b[i]+" ,");
		 }
		 
		 
		 
		 
	}
}
