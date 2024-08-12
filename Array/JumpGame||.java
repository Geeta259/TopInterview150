/*
You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].

Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:

0 <= j <= nums[i] and
i + j < n
Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].

Input: nums = [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
*/

  public int jump(int[] nums) {
        int jump=0;
        int maxidx=0;
        int lastjump=0;

        //if given array length is 1  return 0
        if(nums.length==1)return 0;

        for(int i=0;i<nums.length;i++)
        {
            //add index with value if greater than maxidx update maxidx
            if(nums[i] + i > maxidx)
             maxidx = nums[i]+i;
            
            //if i reach  at lastmaxjump
            if(i>=lastjump)
            {
                //increment jump by 1 and update by maxidx
                jump++;
                 lastjump = maxidx;
             }

            //if last jump reach  at   last index  break
             if(lastjump==nums.length-1)
             break;

        }
        return jump; //return jump
    }
