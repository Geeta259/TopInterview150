/*
Given an array of positive integers nums and a positive integer target, return the minimal length of a 
subarray
 whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
*/

  public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0;
    //first  intialize with  max value
        int len=Integer.MAX_VALUE;

    //use sliding window
        int sum=0;
        while(j<nums.length)
        {
          //current element add into  sum
            sum+=nums[j];
          //if sum greater than equal to target
            while(sum>=target)
            {
                  //minimize windowto get  minimum size
                    len = Math.min(len,j-i+1); //get current window size update with minimum length
                    sum-=nums[i]; //decrease window  size
                    i++; //increment  i  decreaes until size greater   than target
            }
            j++;
        }
      //if it  equal to max length  return 0 otherwise return length
        if(len==Integer.MAX_VALUE)return 0;
        
        return len;
    }
