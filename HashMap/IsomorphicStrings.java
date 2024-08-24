/*
Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
Example 1:
Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true
*/

 public boolean isIsomorphic(String s, String t) {
   //if both  length are not  equal  return false
        if(s.length()!=t.length())return false;

   //create two map  to  store  frequency  of each character
        HashMap<Character,Character> smap = new  HashMap<>();
         HashMap<Character,Character> tmap = new  HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            char c1 = s.charAt(i);
            char  c2 = t.charAt(i);
            //check  if current character present in  another map & its freq should be equal to  replace
            if(smap.containsKey(c1))
            {
                if(smap.get(c1)!=c2)
                return false;
            }
            else
            smap.put(c1,c2); //put into  map if not present 

          //same check  for  vice versa
            if(tmap.containsKey(c2))
            {
                if(tmap.get(c2)!=c1)
                return false;
            }
            else
            tmap.put(c2,c1);
        }
      //return true  
        return true;
    }
