package org.example.Stack;

import java.util.Stack;

public class AsteroCollsion {
    public static void main(String[] args) {
        int[]arr={5,10,-5};
        Stack<Integer> stack=new Stack<>();
        StringBuilder stringBuilder=new StringBuilder();
        int n=arr.length;
        for(Integer num: arr){
         if(num>0){
             stack.push(num);
         }else{
             while(!stack.isEmpty() && stack.peek()<Math.abs(num)){
                 stack.pop();
             }

             if (stack.isEmpty() || stack.peek() < 0) {
                 stack.push(num);
             } else if (stack.peek() == Math.abs(num)) {

                 stack.pop();
             }
         }
        }
        while (!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }
        stringBuilder.reverse();
        System.out.println(stringBuilder.toString());
    }
}
