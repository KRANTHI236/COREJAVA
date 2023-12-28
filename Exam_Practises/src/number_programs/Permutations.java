package number_programs;

public class Permutations {

	public static void main(String[] args) {
		String s="abc";
		
        String res="";
        
        for(int i=0;i<s.length();i++) {
        	char ch =s.charAt(i);
        	
        	for(int j=0;j<s.length();j++) {
        		char ch1=s.charAt(j);
        		for(int k=0;k<s.length();k++) {
        			char ch2=s.charAt(k);
        			if(ch!=ch1&&ch1!=ch2&&ch!=ch2) {
        				
        				res=res+ch+ch1+ch2;
        				System.out.println(res);
        				
        				

        				
        			}
        			//System.out.println(res);

        		}
        	}
        	//System.out.println(res);

        }
      // System.out.println(res);

        
        		
	}
	
}
