package arrays_Programming;

public class Add_Two_Arrays {

	 public static void main(String[] args) {
		    int a[]= {1,2,3};
			int b[]= {4,5,6};
			int n=0;
			int c[]=new int[a.length+b.length];
				for(int j=0;j<=a.length-1;j++)
				{
					c[n]=a[j];
				    n++;
				}
				for(int j=0;j<=b.length-1;j++)
				{
					c[n]=b[j];
					n++;
				}
			
			for(int i=0;i<=c.length-1;i++)
			{
             System.out.println(c[i]);
	}
				
}
}

