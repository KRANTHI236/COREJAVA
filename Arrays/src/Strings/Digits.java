package Strings;

public class Digits {
public static void main(String[] args) {
	String s="@12bindu536787";
	int n=s.length();
	for(int i=0;i<n;i++)
	{
		char ch=s.charAt(i);
		if(ch>=48&&ch<=57)
		{
			System.out.println(ch);
		}
	}
}
}
