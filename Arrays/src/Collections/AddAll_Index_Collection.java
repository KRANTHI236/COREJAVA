package Collections;
import java.util.*;
public class AddAll_Index_Collection {
public static void main(String[] args) {
	ArrayList<Integer> a=new ArrayList<>();
	a.add(10);
	a.add(20);
	a.add(30);
	ArrayList<Integer> b=new ArrayList<>();
	b.add(25);
	b.add(80);
	b.addAll(1,a);
	System.out.println(b);
}
}
