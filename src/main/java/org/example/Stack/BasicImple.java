package org.example.Stack;

public class BasicImple {
    int[] arr = new int[5];
    int top = 0;
    int n = arr.length;

    public boolean isEmpty() {
        if (top == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (top >= n) {
            return true;
        } else {
            return false;
        }
    }

    public void Push(int num) {
        if (isFull()) {
            System.out.println("Full in the array");
        } else {
            arr[top] = num;
            top++;
            System.out.println("Addeed Stack!!");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            return arr[--top];
        }
    }


    public void printMetheod() {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BasicImple stack = new BasicImple();
        stack.Push(5);
        stack.Push(6);
        stack.Push(7);
        stack.Push(8);
        stack.Push(9);

        stack.printMetheod();

        stack.Push(10);
        System.out.println("Poped data ");
        stack.pop();
        stack.pop();
        stack.printMetheod();

    }
}
