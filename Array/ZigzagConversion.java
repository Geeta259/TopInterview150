/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
*/
  public String convert(String s, int n) {
         //if no  of row is 1 return original string
        if(n==1)return s;

       String  arr[] = new String[n];   //create a string array of  n length

      
        int row=0,i=0;
        boolean  rev=false;

        while(i<s.length())
        {
          //get current row string
          //if it is not null add current charcter into it
            String temp = arr[row];
            if(temp!=null)
            temp+=s.charAt(i);
            else
            temp=String.valueOf(s.charAt(i)); //otherwise convert current character into string and add into temp

          //add temp string into row
            arr[row]=temp;

          //if rev is false 
            if(rev==false)
            { 
              //incremnet row if it reach to last row rev true and point to last  second row
               row++; 
              if(row==n)
              { rev=true; row=n-2;}
            }
            else
            {
              //otherwise rev true row decrement it is reach  to -1 point to second row
                row--;
                if(row==-1)
                {
                  row=1;
                  rev=false;
                }
            }

            i++;
        }

      //append all character into ans string row wise
        String ans="";
        for(int t=0;t<n;t++)
        {
            if(arr[t]==null)break;
            
            ans+=arr[t];
        }
        return ans;
    }
