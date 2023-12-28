package Collections;
import java.util.*;
public class Count_Even_Numbers {
public static void main(String[] args) {
	LinkedList<Integer> a=new LinkedList<>();
	a.add(10);
	a.add(11);
	a.add(12);
	a.add(13);
	a.add(14);
	int c=0;
	for(Integer i:a)
	{
		int ele=i;
		if(i%2==0)
		{
			c++;
		}
	}
	System.out.println(c);
	
}
}
