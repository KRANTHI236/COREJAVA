package Strings;

public class Consonants {
public static void main(String[] args) {
	String s="hima@12356";
	int n=s.length();
	for(int i=0;i<n;i++)
	{
		char ch=s.charAt(i);
		if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
		{
			System.out.println(ch);
		}
	}
}
}
