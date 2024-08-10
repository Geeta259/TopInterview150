/*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
*/

  public int removeDuplicates(int[] nums) {
        int i=0,j=1;
        while(j<nums.length)
        {
          //if current element equal to ith index element its duplicate continue
            if(nums[j]==nums[i])
            { j++; continue; }

          //if it is unique then increment i  and placed it there.
            nums[++i] = nums[j];
            j++;
        }
    //return i+1  which point to no  of element in a nums after removing duplicates
        return i+1;
    }
