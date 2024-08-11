/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
*/
 public void reverse(int[] nums,int s,int e)
    {
   //used two pointer to reverse the array
        while(s<=e)
        {
           int temp  =  nums[s];
            nums[s] = nums[e];
            nums[e] = temp;

            s++;
            e--;
        }
    }
    public void rotate(int[] nums, int k) {


      //adjust  k value if it greater than nums length
        while(k>nums.length)
        k-=nums.length;

      //reverse whole array first
        reverse(nums,0,nums.length-1);
      //reverse before k  elements
        reverse(nums,0,k-1);
      //reverse k to  end elements
        reverse(nums,k,nums.length-1);
    }
