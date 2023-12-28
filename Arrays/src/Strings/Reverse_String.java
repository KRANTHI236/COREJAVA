package Strings;

public class Reverse_String {
public static void main(String[] args) {
	String s="oreyyy daridraa";
	int n=s.length();
	String res="";
	for(int i=n-1;i>=0;i--)
	{
		char ch=s.charAt(i);
		res=res+ch;
	}
	System.out.println(res);
}
}
