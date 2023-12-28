package arrays_Programming;

public class Alphabetics{
	public static void main(String[] args) {
	String s []= {"kiran@123","kranthi@123"};
	int n=s.length;
	for(int i=0;i<n;i++)
	{
		String res=s[i];
		for(int j=0;j<res.length();j++)
		{
			char ch=res.charAt(i);
					if(ch>=65&&ch<=90||ch>=97&&ch<=122)
					{
						System.out.println(ch);
					}
		}
	}

 }
}