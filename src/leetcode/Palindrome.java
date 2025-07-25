package leetcode;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(121));
    }
    static boolean palindrome(int x){
        int rev=0;
        int n=x;
        while(n>0){
            int rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        if(rev==x){
            return true;
        }
        else{
            return false;
        }
    }
}
