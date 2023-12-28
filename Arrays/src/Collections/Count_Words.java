package Collections;
import java.util.*;
public class Count_Words {
public static void main(String[] args) {
	String s="I Love My Country And I Love My State";
	String[] s1=s.split(" ");
	HashMap<String,Integer> h1=new HashMap<>();
	for(String s2:s1)
	{
		if(h1.containsKey(s2))
		{
			h1.put(s2,h1.get(s2)+1);
		}
		else
		{
			h1.put(s2, 1);
		}
	}
	System.out.println(h1);
}
}
