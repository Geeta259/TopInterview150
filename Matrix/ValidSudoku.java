public boolean checkValid(char[][] board,int i,int j,char num)
    {
        //check in 9*9 grid cell
        for(int t=0;t<9;t++)
        {
          //check  in each row  of  given column
            if(board[t][j] == num && t!=i)
            return false;

          //check in  each column of  given row
            if(board[i][t] == num && t!=j)
            return false;


            //in a grid 3*3
            int row = (3 * (i/3)) + t/3;
            int col = (3 * (j/3)) + t%3;

          //if it is  equal to  num return false
            if(board[row][col]==num && row!=i && col!=j)
            return false;
        }

        return true; //otherwise return true
    }
    public boolean isValidSudoku(char[][] board) {
      //traverse through a board 
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
              //if it  is not  empty check is it valid no   in a grid if not return false 
                char ch = board[i][j];
                if(ch!='.' && !checkValid(board,i,j,ch))
                return false;
            }
        }

        return true;
    }
