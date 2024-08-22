/*
Given two strings s and t of lengths m and n respectively, return the minimum window 
substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".
The testcases will be generated such that the answer is unique.

Example 1:

Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
*/

 public String minWindow(String s, String t) {
        
        //create a map to stored  frequency of each character
        HashMap<Character,Integer> tmap = new  HashMap<>();

        for(int i=0;i<t.length();i++)
        tmap.put(t.charAt(i),tmap.getOrDefault(t.charAt(i),0)+1);

        //create another map to  track  valid  substring
        int i=0,j=0;
        HashMap<Character,Integer> smap = new HashMap<>();

        //count no of  valid  character
        int valid=0;
        //use to track starting & ending pointer
        int start=-1,end=-1,len=Integer.MAX_VALUE;

        while(j<s.length())
        {
            //stored into map with update freq
            char c1 = s.charAt(j);
            smap.put(c1,smap.getOrDefault(c1,0)+1);

            //if  it contained in tmap and its freq greater  than equal to smap  charcter freq
            if(tmap.containsKey(c1) && tmap.get(c1) >= smap.get(c1))
            valid++; //it is valid character in  a substring increment  valid

            //if valid count equal to  t string length all  valid character found
        
            while(i<=j && valid ==  t.length())
            {
                //shrink  window size until valid  count equal to t.length 
                //first get length of current valid substring if its len minimum 
                if(len > j-i+1)
                {
                    //update  len & stored starting & ending point
                    len = j-i+1;
                    start=i;
                    end=j;
                }
                

                //get  charcter of  ith  indexx  which  we  want to  remove
                //update freq in smap
                 char c2 = s.charAt(i);
                  smap.put(c2,smap.get(c2)-1);
                
                //if  this charcter present in  tmap and  after decrease c2 freq by 1 
                //overall  freq  decrease than required valid character remove
                if(tmap.containsKey(c2) && tmap.get(c2) > smap.get(c2))
                valid--; //valid decrease by 1

                i++; //increment i
            }

            //incremenet  j by  1
            j++;
        }

        //if start -1 means no  valid substring found return blank 
        if(start==-1)return "";
        else if(end==-1)return s.substring(start); //if end==-1 means from start to  last valid  substring
        return  s.substring(start,end+1); //return valid substring from start to end+1
    }

