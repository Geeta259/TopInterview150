/*
Input: s = "III"
Output: 3
Explanation: III = 3.
*/

public int romanToInt(String s) {
  //store roman number with corresponding value stored into  map
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int n = s.length()-1;
//start from right to  left
        int total=map.get(s.charAt(n));

        for(int i=n-1;i>=0;i--)
        {
          //if current roman value greater than next one
            int next = map.get(s.charAt(i+1));
            int curr = map.get(s.charAt(i));
          //add current into total otherwise subtract from total
            if(curr >= next)
            total+=curr;
            else
            total-=curr;
        }
        return total;
    }
