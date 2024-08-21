/*
Given a string s, find the length of the longest substring without repeating characters.
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
*/

 public int lengthOfLongestSubstring(String s) {
   //create a map to check that substring not contain duplicate  character
        HashMap<Character,Integer> map = new HashMap<>();
        //subrray size use sliding window
        int i=0,j=0,len=0;
        while(i<=j && j<s.length())
        {
          //get current charcter it it contained and greater than 0  
            char  ch = s.charAt(j);
            while(i<=j && map.containsKey(ch) && map.get(ch)!=0)
            {
                //shrink  window not valid substring 
                char  rmv = s.charAt(i);
              //decreaes its freq by 1 shrink  window until get  valid subarray
                map.put(rmv,map.get(rmv)-1);
                i++;
            }
          //put current charcter into map  with freq 1
            map.put(ch,1);
          //stored len of substring
            len = Math.max(len,j-i+1);
            j++;
        }
//return maximum length
        return len;
    }
