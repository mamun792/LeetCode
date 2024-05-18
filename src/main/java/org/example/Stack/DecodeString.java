package org.example.Stack;

import java.util.Stack;

public class DecodeString {
    public  static  void StringDecoder(String s){
        Stack<Integer> count=new Stack<>();
        Stack<String> stack=new Stack<>();
        int c=0;
        int i=0;
        while (i<s.length()){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){

            }
        }
    }
    public static void main(String[] args) {
        String str="3[a]2[bc]";
        StringDecoder(str);
    }
}
