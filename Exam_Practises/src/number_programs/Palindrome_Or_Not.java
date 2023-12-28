package number_programs;

public class Palindrome_Or_Not {

	 public static void main(String[] args) {
		
		 //String s="madam teaches Malayalam";
		 String s="level madam malayalam teaches" ;
		 String[] s1=s.split(" ");
		 int n=s1.length;
		 for (int i = 0; i < n; i++) {
			 
			 String s2=s1[i];
			 String res="";
			 for (int j = 0; j < s2.length(); j++) {
				 res=s2.charAt(j)+res;
				
			}
			 
			s1[i]=res;
			
		}
		 s="";
		for(int i=0;i<n;i++) {
			s=s+s1[i]+"";
			//if(s3.equals(s1)) {
		}
			//}		
			System.out.println(s.trim());
		 }
		//System.out.println(s3.trim());
	}


