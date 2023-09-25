package Strings;


	public class UniqueCharacter {
	    public static void main(String[] args) {
	        String a = "ProtijayiGiniGina";

	        allunique(a);
	    }

	    private static void allunique(String a) {
	        int[] count = new int[256];// taking count of characters
	        for (int i = 0; i < a.length(); i++) {
	            char ch = a.charAt(i);
	            count[ch]++;
	        }

	        for (int i = 0; i < a.length(); i++) {
	            char chh = a.charAt(i);
	            // character which has arrived only one time in the string will be printed out
	            if (count[chh] == 1) {
	                System.out.println("index => " + i + " and unique character => " + a.charAt(i));

	            }
	        }

	    }// unique

	}

	//Unique Value
//	import java.util.*;
//
//	public class uniquevalue{
//
//	public static String input = "10 5 5 10 6 6 2 3 1 3 4 5 3";
//
//	public static void uniqueValue (String numbers) {
//	    String [] str = input.split(" ");
//	    Set <String> unique = new HashSet <String> (Arrays.asList(str));
//	    System.out.println(unique);
//
//	    for (String value:unique) {
//	        int count = 0;
//	        for ( int i= 0; i<str.length; i++) {
//	            if (value.equals(str[i])) {
//	                count++;
//	            }
//	        }
//	        System.out.println(value+"\t"+count);
//	    }
//	}
//	public static void main(String [] args) {
//	    uniqueValue(input);
//	}
//	}

	//UniqueCharacterUsing Hashset
//	import java.util.*;
//
//	public class uniquevalue{
//
//	public static void main(String[] args)
//	{
//	    Scanner input = new Scanner(System.in);
//	    String str = input.next();
//	    char arr[] = str.toCharArray();
//	    
//	    HashSet<Character> set1=new HashSet<Character>();
//	    HashSet<Character> set2=new HashSet<Character>();
//
//	    
//	    for(char i:arr)
//	    {
//	        if(set1.contains(i))
//	        {
//	            set1.add(i);
//	            set2.remove(i);
//	            
//	        }
//	        else
//	        {
//	            
//	            set1.add(i);
//	            set2.add(i);
//	        }
//	    }
//	    
//	    System.out.println(set2); 
//
//	}
//	}
