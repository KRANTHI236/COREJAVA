package Strings;

public class Vowels {
public static void main(String[] args) {
	String s="himabindu kranthikiran";
	int n=s.length();
	for(int i=0;i<n;i++)
	{
		char ch=s.charAt(i);
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.print(ch);
		}
	}
}
}
