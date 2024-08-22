/*
You are given a string s and an array of strings words. All the strings of words are of the same length.
A concatenated string is a string that exactly contains all the strings of any permutation of words concatenated.
Input: s = "barfoothefoobarman", words = ["foo","bar"]

Output: [0,9]
Explanation:
The substring starting at 0 is "barfoo". It is the concatenation of ["bar","foo"] which is a permutation of words.
The substring starting at 9 is "foobar". It is the concatenation of ["foo","bar"] which is a permutation of words.
*/


public List<Integer> findSubstring(String s, String[] words) {
        //create an ans list to sored index
        List<Integer> ans = new ArrayList<>();
        //total no  of words
        int tw = words.length;
        //length  of each  word
        int  ew = words[0].length();
        //total  length  of  each character
        int len  = tw*ew;

        //create a map to  stored each word  with its frequency
        HashMap<String,Integer> map = new HashMap<>();
        for(String st : words)
        map.put(st,map.getOrDefault(st,0)+1);

        //window size start  from 0  to  len-1
        int i=0;
        int j=len-1;

        while(j<s.length())
        {
            //each  word window size start from  i  to each  word  length-1
            int a=i,b=i+ew-1;

            //temp  used to stored word  in  each window
          HashMap<String,Integer> temp = new HashMap<>();

          while(b<=j)
            {
                //get a word from  a to b
                String part = s.substring(a,b+1);
                //add into temp  with frequency
                temp.put(part,temp.getOrDefault(part,0)+1);
                
                //pick next  word which start  from b+1 to b + each word length
                a = b+1;
                b = b + ew;
            }

           
           //check  if  both  map are  equals with same frequency index add into ans
          
                if(map.equals(temp))
                ans.add(i);
            
            //increment  starting and ending point  of main  window
            i++;   
            j++;
        }

        //return ans list
        return ans;
    }
