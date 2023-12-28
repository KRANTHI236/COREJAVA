package Collections;
import java.util.*;
public class Map {
public static void main(String[] args) {
	HashMap<Integer,String> h1=new HashMap<>();
	h1.put(1,"hima");
	h1.put(2, "kiran");
	h1.put(3, "kranthi");
	Set<Integer> s=h1.keySet();
	for(Integer i:s)
	{
		
	
	System.out.println(h1.get(i));
}
}
}