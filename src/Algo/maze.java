package Algo;

import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
        int ans= mazeCount(3,3);
//        System.out.println(ans);
        System.out.println(mazeList("",3,3));
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathRestrictions("",board,0,0);
    }

    //counting all paths to a point(down, right and diagonal moves allowed)
    static int mazeCount(int row, int col){
        if(row==1||col==1){return 1;}
        return mazeCount(row-1,col)+ mazeCount(row-1,col-1)+ mazeCount(row,col-1);
    }

    //returning all paths to the point inside a list of strings(down right and diagonal moves allowed)
    static ArrayList<String> mazeList(String p, int row,int col){
        if (row==1&&col==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        if (row==0||col==0){
            return new ArrayList<>();
        }
        ArrayList<String> list1=mazeList(p+'d',row-1,col);
        ArrayList<String> list2=mazeList(p+'c',row-1,col-1);
        ArrayList<String> list3=mazeList(p+'r',row,col-1);
        list1.addAll(list2);
        list1.addAll(list3);
        return list1;
    }

    //Problem: Maze with obstacles
    //Given is a boolean matrix , we have to print all paths to a point,but we cannot go to
    //a path where there is an obstacle/restriction
    //in the matrix false - represents an obstacle, so wherever there is an obstacle just return
    static void pathRestrictions(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (maze[r][c]==false) {
            return;
        }

        if (r < maze.length - 1) {
            pathRestrictions(p + 'D', maze, r+1, c);
        }

        if (c < maze[0].length - 1) {
            pathRestrictions(p + 'R', maze, r, c+1);
        }
    }


}
