/*
Input: num = 3749

Output: "MMMDCCXLIX"
Explanation:
3000 = MMM as 1000 (M) + 1000 (M) + 1000 (M)
 700 = DCC as 500 (D) + 100 (C) + 100 (C)
  40 = XL as 10 (X) less of 50 (L)
   9 = IX as 1 (I) less of 10 (X)
Note: 49 is not 1 (I) less of 50 (L) because the conversion is based on decimal places
*/

 public String intToRoman(int num) {
     //stored numbers with corresponding roman 
        int[] val =  {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] str = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

      
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<13;i++)
        {
          //start from greater value to smallest value 
           while(num >= val[i]) //append current number until it is greater than given num 
           {ans.append(str[i]); num-=val[i];}
        }

//return ans
        return ans.toString();
       
    }
