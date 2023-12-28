package Collections;
import java.util.*;
public class Merge_Two_Maps {
public static void main(String[] args) {
	HashMap<Integer,Integer> h1=new HashMap<>();
	h1.put(1,10);
	h1.put(2, 20);
	h1.put(3, 30);
	HashMap<Integer,Integer> h2=new HashMap<>();
	h2.put(4, 40);
	h2.put(5, 50);
	h2.put(6, 60);
	h1.putAll(h2);
	System.out.println(h1);
}
}
