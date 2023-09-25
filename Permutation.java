package Strings;

public class Permutation {
	public static String swapString(String a, int i, int j) {    
        char[] b =a.toCharArray();    
        char ch;    
        ch = b[i];    
        b[i] = b[j];    
        b[j] = ch;    
        return String.valueOf(b);    
    }    
        
    public static void main(String[] args)    
    {    
        String str = "ABC";    
        int len = str.length();    
        System.out.println("All the permutations of the string are: ");    
        generatePermutation(str, 0, len);    
    }    
        
    //Function for generating different permutations of the string    
    public static void generatePermutation(String str, int start, int end)    
    {    
        //Prints the permutations    
        if (start == end-1)    
            System.out.println(str);    
        else    
        {    
            for (int i = start; i < end; i++)    
            {    
                //Swapping the string by fixing a character    
                str = swapString(str,start,i);    
                //Recursively calling function generatePermutation() for rest of the characters     
                generatePermutation(str,start+1,end);    
                //Backtracking and swapping the characters again.    
                str = swapString(str,start,i);    
            }    
        }    
    }    

}

2.to print all permutation of the string
import java.util.Scanner;

public class Permutation {
    
    
    
    public static void main (String args[])
    {
        System.out.println("Please enter the string whose permutations we need to show ");
        Scanner in = new Scanner(System.in);
        String original=in.nextLine();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Results are :");
        System.out.println("");
        System.out.println("");
        permute(original);
    }
    
    
    
    public static   void permute( String input)
    {
        int inputLength = input.length();
        boolean[ ] used = new boolean[ inputLength ];
        StringBuffer outputString = new StringBuffer();
        char[ ] in = input.toCharArray( );
        doPermute ( in, outputString, used, inputLength, 0 );
        
    }
    
    public static    void doPermute ( char[ ] in, StringBuffer outputString,
    boolean[ ] used, int inputLength, int level)
    {
        if( level == inputLength) {
            System.out.println ( outputString.toString());
            return;
        }
        
        for( int i = 0; i < inputLength; ++i )
        {
            
            if( used[i] ) continue;
            
            outputString.append( in[i] );
            used[i] = true;
            doPermute( in,   outputString, used, inputLength, level + 1 );
            used[i] = false;
            outputString.setLength(   outputString.length() - 1 );
        }
    }
    
}
