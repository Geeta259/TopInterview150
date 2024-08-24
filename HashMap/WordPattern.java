/*
Given a pattern and a string s, find if s follows the same pattern.
here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Example 2:

Input: pattern = "abba", s = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false
 
*/

 public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new  HashMap<>();

   //split given  string by space
        String str[] = s.split(" ");
      //check both  length  if not  equal return false
        if(pattern.length() != str.length)
        return false;

        for(int i=0;i<pattern.length();i++)
        {
          //get  pattern characetr 
            char  ch = pattern.charAt(i);
            if(map.containsKey(ch))
            {
              //if it  already present in map  check  it  should be  equal to  map string if not  return false
                if(!map.get(ch).equals(str[i]))
                return false;
            }
            else if(map.containsValue(str[i]))  //cheeck map contains value or not  if value  present but with  diff key  also return false
            return false;
            else
            map.put(ch,str[i]); //otherwise if it  is new pair add into  map

        }
        return true;//if above conditions are failed then  return true  it's matched
    }
