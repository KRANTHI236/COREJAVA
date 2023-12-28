package Collections;
import java.util.*;
public class Negative {
public static void main(String[] args) {
	LinkedList<Integer> l1=new LinkedList<>();
	l1.add(10);
	l1.add(-20);
	l1.add(40);
	l1.add(-9);
	System.out.println(l1);
	
	for(Integer i:l1)
	{
		int ele=i;
		if(ele<=0)
		{
		
	System.out.println(ele);
}
}

}
}
