package Strings;

public class Prime_Index {
	public static void main(String[] args) {
		String s = "kranthikiran";
		int n = s.length();
		for (int i = 0; i < n; i++) {
			char ch = s.charAt(i);
			int num = i;
			int c = 0;
			for (int j = 1; j <= n; j++) {
				if (num % j == 0) {
					c++;
				}
			}
			if (c == 2) {
				System.out.print(i);
				System.out.println(" "+ch);
			}
		}
	}
}
