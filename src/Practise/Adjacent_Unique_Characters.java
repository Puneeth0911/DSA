package Practise;

public class Adjacent_Unique_Characters {
	public static void main(String[] args) {
//		String s="AABAAB";  //ABAB
		String s="AAABBABAABB";  //ABABAB
		String res="";
        for(int i=0;i<s.length();i++) {
        		if(i==0 || s.charAt(i)!=s.charAt(i-1)) {
        			res+=s.charAt(i);
        		} 
        } 
        System.out.println(res); 
	}
}
