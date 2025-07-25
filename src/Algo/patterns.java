package Algo;

public class patterns {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        inverseTriangle(5);
        pattern4(5);
        diamond(7);
triangle(5);
    }
    static void pattern1 (int n){
        for (int row = 0; row <n; row++) {
            for (int space = 0; space <row; space++) {
                System.out.print(" ");
            }
                for (int col = 0; col < n-row; col++) {
                    System.out.print("*");
                }
                System.out.println();
        }
    }
    static void pattern2 (int n){
        for (int row = 0; row <n; row++) {
            for (int space = 0; space <(n-row-1); space++) {
                System.out.print(" ");
            }
            for (int col = 0; col < row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void inverseTriangle (int n){
        for (int row = 0; row <n; row++) {
            for (int space = 0; space <(row); space++) {
                System.out.print(" ");
            }
            for (int col = 0; col < n-row; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    static void triangle(int n){
        for (int row = 1; row <=n; row++) {
            for (int space = 1; space <=(n-row); space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4 (int n){
        //triangle without using space
        for (int row = 1; row <=n; row++) {
            for (int lspace = 1; lspace <=(n-row); lspace++) {
                System.out.print(" ");
            }
                for (int col = 1; col <= (2*row) - 1; col++) {
                    System.out.print("*");
                }

            for (int rsp = 1; rsp <=(n-row) ; rsp++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void diamond(int n){
        triangle(n/2+1);
        inverseTriangle(n/2);
    }

    }

