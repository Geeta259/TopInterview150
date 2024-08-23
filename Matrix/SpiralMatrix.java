/*
Given an m x n matrix, return all elements of the matrix in spiral order.

Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
*/

public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans  = new  ArrayList<>();

        int left=0,right=matrix[0].length-1,top=0,bottom=matrix.length-1;
        
          
            while(left<=right && top<=bottom)
            {
                  //left  to right
                  for(int i=left;i<=right && top<=bottom;i++)
                  {
                     ans.add(matrix[top][i]);
                  }

                  top++;

                  //top to  bottom
                   for(int i=top;i<=bottom && left<=right;i++)
                  {
                     ans.add(matrix[i][right]);
                  }
                  right--;

                  //right to  left
                  for(int i=right;i>=left && top<=bottom;i--)
                  {
                     ans.add(matrix[bottom][i]);
                  }
                  bottom--;

                  //bottom to  top
                  for(int i=bottom;i>=top && left<=right;i--)
                  {
                     ans.add(matrix[i][left]);
                  }
                  left++;
            }

            return ans;
    }
