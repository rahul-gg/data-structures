package Algo;

public class Nknights {
    public static void main(String[] args) {
        int n=3;
        boolean[][] board=new boolean[n][n];
        knight(board,0,0,n);
    }

    static void knight(boolean[][] board,int row,int col,int targets){
        int count=0;
        if(targets==0){
            display(board);
            return ;
        }

        //if u reach the last cell without finding a valid ans, return
        if (row== board.length-1 && col== board.length){
            return ;
        }

        if (col== board.length){
            knight(board,row+1,0,targets);
            return;
        }

        //checking whether the cell is safe or not
    if (isSafe(board, row, col) == true) {
        board[row][col] = true;
        knight(board, row, col + 1, targets - 1);
        board[row][col] = false;
    }
    else {
        knight(board, row , col+1, targets);
    }
      knight(board,row,col+1,targets);
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        if (row>1 && col>0) {
            if (board[row - 2][col - 1] == true) {
                return false;
            }
        }

        if (row>1 && col< board.length-1) {
            if (board[row - 2][col + 1] == true) {
                return false;
            }
        }

        if (row>0 && col< board.length-2) {
            if (board[row - 1][col + 2] == true) {
                return false;
            }
        }

        if (row>0 && col>1) {
            if (board[row - 1][col - 2] == true) {
                return false;
            }
        }
        return true;
    }

    static void display(boolean[][] board){
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                if (board[row][col] == true) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
