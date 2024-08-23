/*
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
*/

 public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        //transpose the given matrix
        for(int i=0;i<row;i++)
        {
            for(int j=i+1;j<col;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp; 
            }
        }

        //reverse columns value of each  row
        for(int i=0;i<row;i++)
        {
            for(int j=0,k=col-1;j<k;j++,k--)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp; 
            }
        }
    }
