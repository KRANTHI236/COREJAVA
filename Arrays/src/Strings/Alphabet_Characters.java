package Strings;

public class Alphabet_Characters {
public static void main(String[] args) {
	String s="kiran@18866";
	int n=s.length();
	for(int i=0;i<n;i++)
	{
		char ch=s.charAt(i);
		if(ch>=97&&ch<=122||ch>=65&&ch<=90)
		{
			System.out.print(ch);
		}
	}
}
}
