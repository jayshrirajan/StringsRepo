package Strings;

public class SwapTwoStrings {
	   public static void main(String[] args) {    
	        String str1 = "Good ", str2 = "morning ";    
	         System.out.println("Strings before swapping: " + str1 + " " + str2);    
	        
	        //Concatenate both the string str1 and str2 and store it in str1    
	        str1 = str1 + str2;    
	        //Extract str2 from updated str1    
	        str2 = str1.substring(0, (str1.length() - str2.length()));    
	        //Extract str1 from updated str1    
	        str1 = str1.substring(str2.length());    
	            
	        System.out.println("Strings after swapping: " + str1 + " " + str2);    
	    }    

}

//without using 3rd
//public class SwapWithoutTemp {  
//    public static void main(String args[]) {  
//        String a = "Love";  
//        String b = "You";  
//        System.out.println("Before swap: " + a + " " + b);  
//        a = a + b;  
//        b = a.substring(0, a.length() - b.length());  
//        a = a.substring(b.length());  
//        System.out.println("After : " + a + " " + b);  
//    }  
//}  
//Output:
//
//Before swap: Love You
//After : You Love
