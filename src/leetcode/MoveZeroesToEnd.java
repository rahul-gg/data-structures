package leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/move-zeroes/description/
public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr={0,1,0,3,12};
moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void moveZero(int[] arr){
        int j=-1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return;
        }

       for(int i=j+1;i<arr.length;i++){
           if(arr[i]!=0){
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               j++;
           }
       }
    }
}
