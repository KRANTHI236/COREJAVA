package Collections;
import java.util.*;
public class Check_Key_Exi {
public static void main(String[] args) {
	HashMap<Integer,Integer> h1=new HashMap<>();
	h1.put(1,10);
	h1.put(2,20);
	h1.put(3,30);
	Set<Integer> s=h1.keySet();
	for(Integer i:s)
	{
		if(h1.containsKey(i))
		{
			System.out.println(i);
		}
	}
}
}
