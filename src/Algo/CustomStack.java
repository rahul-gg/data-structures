package Algo;

import java.util.Arrays;
import java.util.Stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int last = -1;
    private int first = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    void push(int element) {
        if (last < this.data.length) {
            last = last + 1;
        }
        if (first == -1) {
            first = first + 1;
        }
        this.data[last] = element;
    }

    void pop() {
        if (last == -1) {
            System.out.println("stack is empty");
        }
        if(last==0){
            first=first-1;
        }
        this.data[last]=0;
        last=last-1;
    }

    void display(){
        System.out.println(Arrays.toString(this.data));
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);
        stack.push(4);
        stack.display();
        stack.pop();
        stack.display();
    }
}
