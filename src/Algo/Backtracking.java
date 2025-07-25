package Algo;

import java.util.ArrayList;
import java.util.Arrays;

public class Backtracking {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] matrix = new int[board.length][board.length];
       // allPaths(board,0,0,"");
       // System.out.println(allPathsList(board,0,0,""));
        allPathsMatrix(board,0,0,1,matrix);
    }
//printing the paths
    static void allPaths(boolean[][] arr,int row, int col,String p){
        if(row==arr.length-1 && col==arr[0].length-1){
            System.out.println(p);
            return;
        }
        if(row<0||row== arr.length||col<0||col==arr[0].length){
            return;
        }
        if(arr[row][col]==false){
            return;
        }
// making the change
        arr[row][col]=false;

        allPaths(arr,row+1,col,p+'D');
        allPaths(arr,row,col+1,p+'R');
        allPaths(arr,row-1,col,p+'U');
        allPaths(arr,row,col-1,p+'L');
// reversing the change- backtracking
        arr[row][col]=true;
    }
// returning all the paths in an array list
    static ArrayList<String> allPathsList(boolean[][] arr, int row, int col, String p){
        if(row==arr.length-1 && col==arr[0].length-1){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        if(row<0||row== arr.length||col<0||col==arr[0].length){
            return new ArrayList<>();
        }
        if(arr[row][col]==false){
            return new ArrayList<>();
        }

        arr[row][col]=false;

        ArrayList<String> l1= allPathsList(arr,row+1,col,p+'D');
        ArrayList<String> l2= allPathsList(arr,row,col+1,p+'R');
        ArrayList<String> l3= allPathsList(arr,row-1,col,p+'U');
        ArrayList<String> l4= allPathsList(arr,row,col-1,p+'L');
        l1.addAll(l2);
        l1.addAll(l3);
        l1.addAll(l4);

        arr[row][col]=true;
        return l1;
    }

    //printing the path matrix
    static void allPathsMatrix(boolean[][] arr,int row, int col,int step,int[][] matrix){
        if(row==arr.length-1 && col==arr[0].length-1){
            matrix[row][col]=step;
            for (int i = 0; i < matrix.length; i++) {
                System.out.println(Arrays.toString(matrix[i]));
            }
            System.out.println();
            return;
        }
        if(row<0||row== arr.length||col<0||col==arr[0].length){
            return;
        }
        if(arr[row][col]==false){
            return;
        }
// making the change
        arr[row][col]=false;
        matrix[row][col]=step;

        allPathsMatrix(arr,row+1,col,step+1,matrix);
        allPathsMatrix(arr,row,col+1,step+1,matrix);
        allPathsMatrix(arr,row-1,col,step+1,matrix);
        allPathsMatrix(arr,row,col-1,step+1,matrix);
// reversing the change- backtracking
        arr[row][col]=true;
        matrix[row][col]=0;
    }

}
