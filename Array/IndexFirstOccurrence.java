/*
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
*/

   public int strStr(String haystack, String needle) {
        
        int flag=-1;
      //traverse through  string
        for(int i=0;i<haystack.length();i++)
        {
          //if first chaarcter match
            if(needle.charAt(0) == haystack.charAt(i))
            {
                flag=i;
                int k=1;
              //check for i+1 to  last to check other character
                for(int j=i+1;j<haystack.length() && k<needle.length();j++,k++)
                {
                  //if not match break
                    if(haystack.charAt(j)!=needle.charAt(k))
                    {flag=-1; break;}
                }
            //if all charcter match break from loop otherwise flag value reset which contain first match character index
                if(k==needle.length())
                break;
                else
                flag=-1;
            }
        }
     //return flag  value -1 if not  match
        return flag;
    }
