/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that 
i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.
*/
 public List<List<Integer>> threeSum(int[] nums) {
   //create an ans  arraylist
      List<List<Integer>> ans = new  ArrayList<>();

   //first  sort given nums so  that can use two  pointer  approach
        Arrays.sort(nums);

        int i=0;
      while(i<nums.length-2)
      {
          int j = i+1;
          int k = nums.length-1;

          while(j<k)
          {
            //if sum equal to 0
             int sum = nums[i] + nums[j] + nums[k];
             if(sum == 0)
             {
               //stored index into list  add into  ans list
                List<Integer> li = new ArrayList<>();
                li.add(nums[i]);
                li.add(nums[j]);
                li.add(nums[k]);

                ans.add(li);

               //increment j  until unique element  not found
                j++;
                while(j<k && nums[j] == nums[j-1])
                j++;

              //decrement k  until  unique element not found
                k--;  
                while(j<k && nums[k] == nums[k+1])
                k--;
             }
             else if(sum<0)  //if  sum less  than 0  increement j 
             j++;
             else //otherwise decrement k
             k--;
          }

            i++;
          //increase until unique value not found
            while(i<nums.length-2 && nums[i] == nums[i-1])
            i++;
      }   

      return ans;
    }
