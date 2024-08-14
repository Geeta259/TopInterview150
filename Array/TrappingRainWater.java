/*
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. 
In this case, 6 units of rain water (blue section) are being trapped.
*/

 public int trap(int[] height) {
        int n = height.length;

   //create an array for stored next greater element
        int nge[] = new int[n];

        int max=0;

     //start traversing from right to left
        for(int i=n-1;i>=0;i--)
        { max = Math.max(max,height[i]); //stored max height till index  i
            nge[i]=max;
        }

    
        int leftmax=0;
        int trap=0;

   //traverse from left  to right
        for(int i=0;i<height.length;i++)
        {
                int rightmax = nge[i];
          //get min height from left and right max height and decrease current height 
                int h  = Math.min(leftmax,rightmax)-height[i];
                if(h>0)trap+=h; //add into trap
            //update leftmax variable
            leftmax = Math.max(leftmax,height[i]);
        }
  //return trap
        return trap;
    }
