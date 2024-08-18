/*
Given an input string s, reverse the order of the words.
Input: s = "the sky is blue"
Output: "blue is sky the"
*/

 public String reverseWords(String s) {
        String ans="";
        int i=0;

        //remove all  blank  spaces at first
        while(s.charAt(i)==' ')
         i++;

        String temp="";
         while(i<s.length())
         {
           //if current charcter is space
            if(s.charAt(i)==' ')
            { 
              //if  it is first word  add in ans
                if(ans=="")
                ans=temp;
                else
                ans = temp +" "+ ans; //append current word at starting
                 
                 temp=""; //for next word

                i++; //increment i until  space were detected  
                 while(i<s.length() && s.charAt(i)==' ')i++;
            }
            else 
            { temp+=s.charAt(i); i++; }  //otherwsie add charcter in temp
         }
      
        if(ans=="")
                ans=temp;
                else
                ans = temp +" "+ ans;
              
        //remove all spaces at beginning
         i=0;
         while(i<ans.length() && ans.charAt(i)==' ')
         i++;

         return ans.substring(i);
    }
