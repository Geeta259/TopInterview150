/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.
Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
*/
public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pro = new int[n];

  //pointer to check  0  present or not
        int c0=0;
        
        int prefixpro=1;

        for(int i=0;i<n;i++)
        {
          //if current element  is 0 increment 0 count
            if(nums[i]==0)c0++;
            else 
            prefixpro*=nums[i]; //otherwise product of current  element
        }


        for(int i=0;i<n;i++)
        {
            if(c0>0) //if count of 0 greater  than 0
            {
                if(nums[i]==0 && c0==1) //if current  value is  0  theck  count of 0 if  it is  1
                pro[i] = prefixpro; //current product value is stored at ith index
                else
                pro[i]=0; //otherwise 0
            }
            else
            {
              //if 0 not present then product value  divide by current value
                pro[i] = prefixpro/nums[i];
            }
        }

    //return product array
        return pro;
    }
