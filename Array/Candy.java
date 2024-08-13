/*
There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.
You are giving candies to these children subjected to the following requirements:
Each child must have at least one candy.
Children with a higher rating get more candies than their neighbors.
Return the minimum number of candies you need to have to distribute the candies to the children.

Input: ratings = [1,0,2]
Output: 5
Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.
*/

public int candy(int[] ratings) {
        int  n = ratings.length;
  //fill  right to left intially all have one candy
        int rtol[] = new int[n];
        Arrays.fill(rtol,1);

        for(int i=1;i<n;i++) //left to  right 
        {
            //left neighbour check 
          //if current index have higher rating than previous increment its candy by 1 from previous
            if(ratings[i]> ratings[i-1])
            rtol[i] = rtol[i-1]+1;
        }

        //traverse from right to left
        for(int i=n-2;i>=0;i--)
        {
          //check right neighbour if cuurent index have higher ratings than next one increment rating by 1 and update with  max candy
            if(ratings[i]>ratings[i+1])
            rtol[i] = Math.max(rtol[i+1]+1,rtol[i]);
        }

  //calculate total candy
        int candy=0;
        for(int i=0;i<n;i++)
        candy+=rtol[i];

        return candy;
    }
