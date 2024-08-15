/*
Given a string s consisting of words and spaces, return the length of the last word in the string.
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
*/
public int lengthOfLastWord(String s) {
        
        int j = s.length()-1;
//start from last  index decrement until space  found
        while(s.charAt(j)==' ')
        { j--;}

        int len=0;
//count length of last word 
        while(j>=0 && s.charAt(j)!=' ')
        { len++;j--;}
      //return length
        return len;
    }
