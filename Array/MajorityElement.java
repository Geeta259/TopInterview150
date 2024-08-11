/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 
*/

 public int majorityElement(int[] nums) {

     //majority element can be only 1
        int maj1=nums[0],c1=1;

        for(int i=1;i<nums.length;i++)
        {
          //if current element is equal  to  majority increment count
            if(nums[i]==maj1)
            c1++;
            else
            c1--;  //otherwise decrement count

            //if it  becomes to 0 current element becomes majority element
            if(c1==0)
            { maj1=nums[i]; c1=1; }
        }
   //return majority element
        return  maj1;
    }
