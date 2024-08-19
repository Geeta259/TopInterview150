/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
*/

public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
//convert given string to lowercase
        s = s.toLowerCase();

//use two pointer  approach
        while(i<=j)
        {
          //get two character
            char  c1 = s.charAt(i);
            char c2 = s.charAt(j);
          //if both character are valid 
           if(((c1>='a' && c1<='z') || (c1>='0'  && c1<='9')) && ((c2>='a' && c2<='z') || (c2>='0' && c2<='9')))
           {
             //if not  match return false 
                if(c1!=c2)
                return false;
          //otherwise move pointer by 1
                i++;
                j--;
           }
             //if c1 is invalid move  i by 1
           else if((c1<'a' || c1>'z') && (c1<'0' || c1>'9'))
           i++;
           else
           j--; //otherwise move j by 1
        }
        return true; //if  all match return true
    }
