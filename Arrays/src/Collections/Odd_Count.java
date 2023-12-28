package Collections;
import java.util.*;
public class Odd_Count {
public static void main(String[] args) {
	LinkedList<Integer> a=new LinkedList<>();
	a.add(1);
	a.add(2);
	a.add(3);
	a.add(4);
	a.add(5);
	int c=0;
	for(Integer i:a)
	{
		int ele=i;
		if(i%2!=0)
		{
			c++;
		}
	}
	System.out.println(c);
}
}
