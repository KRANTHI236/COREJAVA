package arrays_Programming;

public class Count_Even_And_Odd {

	public static void main(String[] args) {
		int []a= {2,3,2,1,5,3,45,45,67,90};
		int c=0;
		int c1=0;
		//int sum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				//c++;
				c=c+a[i];
			}
			if(a[i]%2!=0) {
				//c1++;
				c1=c1+a[i];
			}
		}
		System.out.println(c);
		System.out.println(c1);
	}
}
