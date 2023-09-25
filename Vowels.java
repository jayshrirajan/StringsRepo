package Strings;

public class Vowels {
	public static void main(String[] args) {
		int vcount=0, ccount=0;
		String str="This is a really simple sentence";
		  str = str.toLowerCase();    
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u') {
				vcount++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				ccount++;
			}
		}
		System.out.println(vcount);
		System.out.println(ccount);
	}

}
