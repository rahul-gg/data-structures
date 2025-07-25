package leetcode;

import java.util.Arrays;

public class FirstandLastOcc {
    public static void main(String[] args) {
int[] arr={5,7,7,8,8,10};
int target=6;
       System.out.println(Arrays.toString(searchRange(arr,target)));
    }
    static int[] searchRange(int[] arr, int target) {
        int[] ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        if(arr.length==0){
            return ans;
        }
        int val=binarysearch(arr,target);
        if(val==-1){
            return ans;
        }
        ans[0]=searchStart(arr,target,0,val);
        ans[1]=searchEnd(arr,target,val, arr.length-1);
        return ans;
    }
    static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start+ ((end-start)/2);
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    static int searchStart(int[] arr,int target, int start,int end){
        while (start <= end) {
            int mid = start+ ((end-start)/2);
            if (arr[mid] > target) {
                end = mid - 1;
            } else if(arr[mid]<target)  {
                start = mid + 1;
            }
            else {
                end=mid;
                if((mid==0)||(arr[mid-1]<arr[mid])){
                    return mid;
                }
            }
        }
        return -1;
    }
    static int searchEnd(int[] arr,int target,int start,int end){
        if(arr[start]==arr[end]){
            return end;
        }
        while (start <= end) {
            int mid = start+ ((end-start)/2);
            if (arr[mid] > target) {
                end = mid - 1;
            } else if(arr[mid]<target) {
                start = mid + 1;
            }
            else{
                start=mid;
                if((mid== arr.length-1)||(arr[mid+1]>arr[mid])){
                    return mid;
                }
            }
        }
        return -1;
    }
}
