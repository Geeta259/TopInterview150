/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
*/
   public boolean isAnagram(String s, String t) {

     //if both  string length  are not  equal return false
        if(s.length()!=t.length())
        return false;

     //create a  map for  stored freq of  each  character
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++)
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);

        for(int i=0;i<t.length();i++)
        {
          //if it not contained in map return false
            if(!map.containsKey(t.charAt(i)))
            return false;
        //if it contained but  its freq is 0 return false
            else if(map.get(t.charAt(i)) == 0)
            return false;
      //update freq of  current character decrease by  1
            map.put(t.charAt(i),map.get(t.charAt(i))-1);

        }
        return true; //return true
    }
