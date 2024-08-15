/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
*/
   public String longestCommonPrefix(String[] strs) {
     //sort given array first
       Arrays.sort(strs);

     //stored  first  string
       String small = strs[0];
     
       for(int i=1;i<strs.length;i++)
       {
            String res="";
         //match character of current string
            for(int j=0;j<small.length();j++)
            {
              //if not match break it
                if(strs[i].charAt(j)!=small.charAt(j))
                break;
              
                res+=strs[i].charAt(j);
            }

         //if this length is smaller than small string  update small string by current string
            if(res.length()<small.length())
            small=res;
       }   

       //return small string
       return small;
    }
