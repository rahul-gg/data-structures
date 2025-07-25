package leetcode;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int [] arr={-2};
        System.out.println(maxSubSum(arr));
        System.out.println(kadaneSolution(arr));
    }

    //Kadane's algorithm: Single pass, keep summing the elements.
    // On encountering a negative sum, reset sum variable to 0.
    // if sum > max, maybe a possible answer. Keep checking for a greater sum.Return the max.

    static int kadaneSolution(int[] arr){
        if(arr.length==1){
            return arr[0];
        }
        int sum=0;
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
            if(sum<0){
                max=Math.max(sum,max);
                sum=0;
            }
            else{
                max=Math.max(sum,max);
            }
        }
        return max;
    }

    static int maxSubSum(int[] arr){
        int ans=0;
        for (int i = 0; i < arr.length ; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                ans= Math.max(sum,ans);
            }
        }
        return ans;
    }
}
