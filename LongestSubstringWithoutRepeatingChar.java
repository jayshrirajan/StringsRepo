package Strings;

public class LongestSubstringWithoutRepeatingChar {

	public static int longestSubstrWithoutRepeat(String str)
    {
  String longestSubstr = "";
  // Result
  int maxLength = -1;
  // Return 0 if the input string is empty
  if (str.isEmpty()) {
    return 0;
  }
  // Return 1 is if the input string contains only one char
  else if (str.length() == 1) {
    return 1;
  }
  for (char c : str.toCharArray()) {
    String current = String.valueOf(c);
    if (longestSubstr.contains(current)) {
      longestSubstr =
              longestSubstr.substring(
                      longestSubstr.indexOf(current) + 1);
    }
    longestSubstr = longestSubstr + String.valueOf(c);
    maxLength = Math.max(longestSubstr.length(), maxLength);
  }
  return maxLength;
}
  public static void main(String[] args) {
      // TODO Auto-generated method stub
       String str = "beginnersbook";
          System.out.println("The given string is " + str);
          int len = longestSubstrWithoutRepeat(str);
          System.out.println("The length of the longest " +
                  "substring without repeating " +
                  "characters is: "+ len);
  }}

