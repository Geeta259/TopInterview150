/*
The board is made up of an m x n grid of cells, where each cell has an initial state: live (represented by a 1) or dead (represented by a 0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):

Any live cell with fewer than two live neighbors dies as if caused by under-population.
Any live cell with two or three live neighbors lives on to the next generation.
Any live cell with more than three live neighbors dies, as if by over-population.
Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
*/
public void gameOfLife(int[][] board) {
        int  row = board.length;
        int  col = board[0].length;

  //create a 8 dimensions
        int x[] = {0,-1,-1,-1,0,1,1,1};
        int y[] = {-1,-1,0,1,1,1,0,-1};

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                int dead=0,live=0;
              //for  each cell count how  many dead & live cells
                for(int d=0;d<8;d++)
                {
                  //go for 8  direcions
                    int nr = x[d] + i;
                    int nc = y[d] + j;
                    //if it is valid  cell
                   if(nr>=0 && nr<row && nc>=0 && nc<col)
                    {
                      //count dead and live  cell 
                      //for 2 also  considered dead means it later make dead
                        if(board[nr][nc]==0 || board[nr][nc]==2)
                        dead++;
                        else
                        live++; //otherwise live cell
                    }
                }

                //check if it is  dead
                if(board[i][j]==0) //dead
                {
                  //if adjacent live  cell is 3 it will be live make it  2 (means currently considered dead but  later it will be live)
                    if(live==3)
                    board[i][j]=2;
                }
                else
                {
                    //if it is live but adjacent live less than 2 or greater  than 3 make it dead by  put  -1 
                    if(live<2 || live>3)
                    board[i][j]=-1;
                }

              
            }
        }


        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
              //if it  is  2  make it  live
                if(board[i][j]==2)
                board[i][j]=1;
            //if it is -1 make it  dead
                if(board[i][j]==-1)
                board[i][j]=0;
            }
        }
