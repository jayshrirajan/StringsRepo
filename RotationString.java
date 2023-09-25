package Strings;

public class RotationString {
	public static void main(String[] args) {
		String str1="abde" , str2="deab";
		if(str1.length()!=str2.length()) {
			System.out.println("Not Rotation String");
		}
		else {
			str1=str1.concat(str2);
			if(str1.indexOf(str2)!=-1) 
				System.out.println("rotation String");
			else
				System.out.println("Not rotation String");
		}
	}

}
