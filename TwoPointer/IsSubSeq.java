/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false
*/

 public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
   //use two  pointer i point to  first string index
   //j point to second string index
        while(i<s.length() && j<t.length())
        {
          //if both character  match at i  & j index
            if(s.charAt(i) == t.charAt(j))
            i++; //increment i to match next  character

            j++; //increment j by  1
        }

   //if i indexx reach out of bound all character match return true otherwise return false
        if(i==s.length())
        return true;

        return false;
    }
