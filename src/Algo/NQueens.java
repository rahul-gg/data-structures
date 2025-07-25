package Algo;

public class NQueens {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        System.out.println(queens(board,0));
    }

    //given a 2d boolean array
    //start placing queens row wise, check for every cell in the row and then go to the next row
    //checking if the spot is safe or not by checking 2 the presence of a queen upward and in both diagonals
    //if safe return true , place the queen
    //if queen is placed in a row successfully, go to the next row(recursive call)
    //when do you know you have found the answer?- when queens have been placed in all the rows, the row will
    //become equal to the length. Return when that happens , this is the base condition

    static int queens(boolean[][] board,int row){
        if(row== board.length){
            display(board);
            return 1;
        }
        int count=0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board,row,col)==true){
                board[row][col]=true;
                count+=queens(board,row+1);
                board[row][col]=false;
            }
        }
        return count;
    }

     static boolean isSafe(boolean[][] board, int row, int col) {
         for (int i = 0; i < row; i++) {
             if (board[i][col] == true) {
                 return false;
             }
         }
             int maxLeft=Math.min(row,col);
             for (int i = 0; i < maxLeft; i++) {
                 if (board[row-1-i][col-1-i]==true){
                     return false;
                 }
             }
             int maxRight=Math.min(row, board.length-col-1);
         for (int i = 0; i < maxRight; i++) {
             if (board[row-1-i][col+1+i]==true){
                 return false;
             }
         }
             return true;
         }
         static void display(boolean[][] board){
             for (int row = 0; row < board.length; row++) {
                 for (int col = 0; col < board.length; col++) {
                     if (board[row][col] == true) {
                         System.out.print("Q ");
                     } else {
                         System.out.print("X ");
                     }
                 }
                 System.out.println();
             }
             System.out.println();
         }
    }

