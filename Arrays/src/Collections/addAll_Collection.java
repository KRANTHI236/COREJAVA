package Collections;
import java.util.*;
public class addAll_Collection {
public static void main(String[] args) {
	ArrayList<Integer> a=new ArrayList<>();
	a.add(10);
	a.add(30);
	a.add(32);
	ArrayList<Integer> b=new ArrayList<>();
	b.add(56);
	b.add(45);
	b.add(90);
	b.addAll(a);
	System.out.println(b);
}
}
