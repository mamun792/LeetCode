package org.example.Stack;

import java.util.Stack;

public class RemovingStats {
    public static void main(String[] args) {
        String s="leet**cod*e";
        Stack<Character> stack=new Stack<>();
        StringBuilder stringBuilder=new StringBuilder();
        int n=s.length();
        for(char ch: s.toCharArray()){
            if(ch == '*'){
               stack.pop();
            }else{
                stack.push(ch);
            }
        }
        while ((!stack.isEmpty())){
            stringBuilder.append(stack.pop());
        }
        stringBuilder.reverse();
        System.out.println(stringBuilder.toString());
    }
}
