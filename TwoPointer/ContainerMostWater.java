/*
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
Notice that you may not slant the container.
*/
 public int maxArea(int[] height) {
        
        int area=0;
        //use two  pointer  approach
        int i=0,j=height.length-1;
        while(i<j)
        {
            int h = 0,w=0;
          //considered small  height 
            if(height[i] <= height[j])
            {
                h = height[i];
              //width  is j-i
                w = j-i;
              //ith index height considered increement i
                i++;
            }
            else
            {
              //otherwise jth  index height considered  decrement j
                h = height[j];
                w=j-i;
                j--;
            }
         
        //calculate area and update with  maxarea
            area = Math.max(area,h*w);
        }
   //return area
        return  area;
    }
