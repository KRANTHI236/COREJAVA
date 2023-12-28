package Strings;

public class Special_Symblos {
public static void main(String[] args) {
	String s="@#!kranthi&*&*";
	int n=s.length();
	for(int i=0;i<n;i++)
	{
		char ch=s.charAt(i);
		if(!(ch>=48&&ch<=57||ch>=97&&ch<=122||ch>=65&&ch<=90))
		{
			System.out.println(ch);
		}
	}
}
}
