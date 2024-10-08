/*
Given an integer array nums sorted in non-decreasing order, remove some duplicates 
in place such that each unique element appears at most twice. The relative order of the elements should be kept the same.
Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
*/

 public int removeDuplicates(int[] nums) {
        int i=0,j=1;
        while(j<nums.length)
        {
            if(nums[j]==nums[i] && i>0 && nums[i]==nums[i-1])
            { j++; continue; }

            nums[++i] = nums[j++];
        }
        return i+1;
    }
