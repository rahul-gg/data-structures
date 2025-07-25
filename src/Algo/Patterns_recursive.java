package Algo;

public class Patterns_recursive {
    public static void main(String[] args) {
        pattern1(4,1);
    }
    static void pattern1(int i, int j){
        if(i==1){
            System.out.print("* ");
            return;
        }
        if(j<=i){
            System.out.print("* ");
             pattern1(i,j+1);
        }
        else {
            System.out.println();
            pattern1(i-1,1);
        }
    }
}
