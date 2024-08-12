/*
You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
Return true if you can reach the last index, or false otherwise.
Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
*/

 public boolean canJump(int[] nums) {
       int max=0;
       for(int i=0;i<nums.length;i++)
       {
         //check  if current index greater  than maxjump return false  can not reach
            if(i>max)return false;

         //if current pos + i greater than maxjump update max
           if(nums[i] + i > max)
           max = nums[i] + i;

         //if max reach at last index return true
           if(max==nums.length-1)return true;
       }   
       return true;
    }
