package leetcode;
//https://leetcode.com/problems/set-mismatch/
import java.util.Arrays;
public class SetMismatch {
    public static void main(String[] args) {
    int[] arr={1,1};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    static int[] findErrorNums(int[] arr) {
        int[] ans=new int[2];
        int i=0;
        while(i< arr.length){
            int correct= arr[i]-1;
            if(arr[i]==arr[correct]){
                i++;
            }
            else{
                swap(arr,i,correct);
            }
        }
        for (int j = 0; j <= arr.length-1; j++) {
            if(j!=arr[j]-1){
                ans[0]=arr[j];
                ans[1]=j+1;
            }
        }
        return ans;
    }
    static void swap(int[] arr, int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
