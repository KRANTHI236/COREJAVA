package Strings;

public class Even_Index_Elements {
public static void main(String[] args) {
	String s="hellogoodmorning";
	int n=s.length();
	for(int i=0;i<n;i++)
	{
		char ch=s.charAt(i);
		if(i%2==0)
		{
			System.out.print(ch);
		}
	}
}
}


