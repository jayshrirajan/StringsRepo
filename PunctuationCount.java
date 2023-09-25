package Strings;

public class PunctuationCount {
	public static void main(String[] args) {
	String str="The World, 'full of Happy!' ";
	int count=0;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==','|| str.charAt(i)=='!'|| str.charAt(i)==' ') {
			count++;
		}
			
		
	}
	System.out.println(count);
	}

}
