package leetcode;

public class longestSubArrayWithSumK {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,1,1};
        System.out.println(longestK(arr,5));
    }
    static int longestK(int[] arr,int k){
        int i=0;
        int j=i+1;
        int ans=0;
        while(j< arr.length){
            int sum=0;
            for (int l = i; l <=j ; l++) {
                sum=sum+arr[l];
            }
           if(i==j){
                sum=arr[i];
           }


           if(sum>k){
               if(i<j){
                   i++;
               }
               else {
                   j++;
               }
           }

           else if(sum<k){
               j++;
           }

           else {
               if((j-i)+1 > ans){
                   ans=(j-i)+1;
               }
               j++;
           }

        }

        return ans;
    }
}
