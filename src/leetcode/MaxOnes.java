package leetcode;

public class MaxOnes {
    public static void main(String[] args) {
        int [] arr={1,1,0,1,1,1};
        System.out.println(consOnes(arr));
    }

    static int consOnes(int[] arr){
        int ans=0;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1){
                count++;
            }
            else{
                if (count>ans){
                    ans=count;
                }
                count=0;
            }
        }
        return Math.max(count, ans);
    }
}
