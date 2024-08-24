/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.

Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
*/

  public boolean canConstruct(String ransomNote, String magazine) {
    //create a map to store character  with  frequency
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<magazine.length();i++)
        map.put(magazine.charAt(i),map.getOrDefault(magazine.charAt(i),0)+1);

        for(int i=0;i<ransomNote.length();i++)
        {
          //check  if it contained in map if  not  return false  not  constructed
            if(!map.containsKey(ransomNote.charAt(i)))
            return false;

          //if  their freq less than 0 still return false
            if(map.get(ransomNote.charAt(i))<=0)
            return false;
          //update  original map  frequency  decrease by 1 that character has been used.
            map.put(ransomNote.charAt(i),map.get(ransomNote.charAt(i))-1);
        }
        return true;
    }
