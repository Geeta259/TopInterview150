/*
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number
Example 1:
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
*/

public int[] twoSum(int[] numbers, int target) {
  //create an array  of size 2  to  stored index
        int ans[] = new  int[2];

  //use two pointer approach
        int i=0,j=numbers.length-1;
        while(i<j)
        {
          //if  two value sum equal to  target 
            if(numbers[i] + numbers[j] == target)
            {
              //stored their index and break from it
                ans[0] = i+1;
                ans[1] = j+1;
                break;
            }
          //if its  sum less than target  increment i 
            else if(numbers[i] + numbers[j] < target)
            i++;
        //otherwise decrement j
            else
            j--;
        }
  //return ans
        return  ans;
    }
