package leetcode;
//Condition no two consecutive elements can be equal
public class GreatestElementInLognTime {
    public static void main(String[] args) {
        int[] arr={6,7,0,1,2,3,4 };
        System.out.println(findPeakElement(arr));
    }
    static int findPeakElement(int[] arr) {
        if(arr.length==1){
            return 0;
        }
        int low = 0;
        int high = arr.length - 1;
        while (low<high) {
            int mid = low+ ((high-low)/2);
            if(arr.length==1){
                return 0;
            }
            if(mid==0){
                if(arr[mid]>arr[mid+1]){
                    return mid;
                }
                else{
                    return mid+1;
                }
            }
            if (arr[mid] < arr[mid-1]) {
                high=mid;
            }
            else if (arr[mid] < arr[mid+1]) {
                low=mid+1;
            }
            else if((arr[mid]>arr[mid+1])&&(arr[mid]>arr[mid-1])){
                return mid;
            }
        }
        return low;
    }
}
