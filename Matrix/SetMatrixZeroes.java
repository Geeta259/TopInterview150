/*
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
You must do it in place.
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
*/

 public void setZeroes(int[][] matrix) {
       int n = matrix.length, m = matrix[0].length;

   //create a separate variable for check first  column contained 0 or  not
        int col1=-1;
       for(int i=0;i<n;i++)
       {
         //if first column has 0 col1 value change from -1 to 0
            if(matrix[i][0]==0)col1=0;
            for(int j=1;j<m;j++)
            {
              //if current cell is 0 changee first cell ofcolumn and first cell  of  row  make 0
                if(matrix[i][j]==0)
                {
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
       }   

   //traverse from last to first row
       for(int i=n-1;i>=0;i--)
       {
         //except first column check first cellof each row  or column  if any  one contained 0 
            for(int j=1;j<m;j++)
            {
                if(matrix[0][j]==0 || matrix[i][0]==0) //make current cell  is  0
                matrix[i][j]=0;
            }
       }

   //if col1  value is 0  make  all  cell  0
       if(col1==0)
       {
          for(int i=0;i<n;i++)
          matrix[i][0]=0;
       }
    }
