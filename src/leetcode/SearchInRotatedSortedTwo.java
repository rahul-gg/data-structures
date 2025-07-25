package leetcode;

public class SearchInRotatedSortedTwo {
    public static void main(String[] args) {
        int[] nums={1,0,1};
        System.out.println(search(nums,8));
    }
    static boolean search(int[] nums, int target) {

        int pivot= pivotsearch(nums);
        if (nums[pivot]==target){
            return true;
        }
       boolean ans=binarysearch(nums,0,pivot-1,target);
        if(ans==false){
            ans=binarysearch(nums,pivot+1,nums.length-1,target);
        }
        return ans;
    }

     static int pivotsearch(int[] arr) {
        int start= 0;
        int end= arr.length-1;
        if(arr.length==1){
            return start;
        }
        while(arr[start]==arr[end]){
            if(start==end){
                return start;
            }
            if(start>end){
                return arr.length-1;
            }
            start++;
            end--;
        }
        if(arr[start]<arr[end]){
            return end;
        }

        while ( start< end) {
            int mid =start+ ((end-start)/2);
            if(arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if (arr[mid] < arr[start]) {
                end = mid - 1;
            }
            else if(arr[mid]>=arr[start]) {
                start = mid+1 ;
            }
        }
        return start;
    }



     static boolean binarysearch (int[] arr,int start ,int end, int element){
        while ( start<= end) {
            int mid = (start+ ((end-start)/2));
            if (arr[mid] > element) {
                end = mid - 1;
            } else if (arr[mid] < element) {
                start = mid+1;
            }
            if (arr[mid] == element) {
                return true;
            }
        }
        return false;
    }
}
