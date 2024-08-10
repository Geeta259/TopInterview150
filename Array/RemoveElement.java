/*
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
*/

public int removeElement(int[] nums, int val) {
        int  i=0,j=0;

  //use two pointer j point to current index and i point to where this element should be if val removed
        while(j<nums.length)
        {
          //if  it is equal  to  val
          //no need  to  placed at i continue
            if(nums[j]==val)
            { j++; continue; }
            
        //otherwise current element at j index put into i index
          //increment both
            nums[i] = nums[j];
            i++;
            j++;
        }
  //return i which point to no  of element after removing val
        return i;
    }
