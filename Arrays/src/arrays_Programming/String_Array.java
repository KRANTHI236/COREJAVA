package arrays_Programming;

public class String_Array {
	public static void main(String[] args) {
		
	
	String[] s= {"hero","heroine"};
     for(int i=0;i<s.length;i++)
	{
		String res=s[i];
		for(int j=0;j<res.length();j++)
		{
			char ch=res.charAt(j);
			System.out.println(ch);
			
		}
		
	}
}
}
	


