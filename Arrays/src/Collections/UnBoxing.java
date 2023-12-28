package Collections;

public class UnBoxing {
public static void main(String[] args) {
	Integer i=45;
	int v=i.intValue();// explicit or typeValue()
	System.out.println(v);
	
	int r=i; //implicit or auto boxing
	System.out.println(r);
			}
}
