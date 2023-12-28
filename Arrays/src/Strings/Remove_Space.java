package Strings;

public class Remove_Space {
	public static void main(String[] args) {
		String s = "raja rani hero";
//	int n=s.length();
		int c = 0;
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch != ' ') {

				res = res + ch;
			}
		}
		System.out.println(res);
	}
}
