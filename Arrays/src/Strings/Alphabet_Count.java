package Strings;

public class Alphabet_Count {
public static void main(String[] args) {
	String s="rachhakiran";
	int n=s.length();
	int c=0;
	for(int i=0;i<n;i++)
	{
		char ch=s.charAt(i);
		if(ch>=90&&ch<=122||ch>=65&&ch>=90)
		{
			c++;
		}
	}
	System.out.println(c);
}
}
