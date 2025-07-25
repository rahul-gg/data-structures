package leetcode;

import java.util.ArrayList;

public class Magic {
    public static void main(String[] args) {
        int [] arr ={5,1,4,2,3};
      ArrayList<Integer> ans=  magicArr(arr,5);
        System.out.println(ans);
    }

    static ArrayList<Integer> magicArr(int[] arr, int n){
        ArrayList<Integer> ans=new ArrayList<>();
        for (int i = 0; i < n-1; i++) {

            int count =0;
            for (int j = i; j < n-1 ; j++) {
                if(arr[j+1]<arr[i]){
                    count++;
                }

            }
            ans.add(count);

        }
        ans.add(0);
        return ans;
    }
}
