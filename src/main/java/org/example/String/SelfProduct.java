package org.example.String;

public class SelfProduct {
    public static void main(String[] args) {
        int[] num={1,2,3,4};
        int n=num.length;
        int []pref=new int[n];
        int []sef=new int[n];

        pref[0]=1;
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]*num[i-1];

        }

        sef[n-1]=1;
        for(int i=n-2;i>=0;i--){
            sef[i]=sef[i+1]*num[i+1];
        }
        int[] result = new int[n];
        for(int i=0;i<n;i++){
           result[i]= pref[i]*sef[i];

        }

        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");

        }
    }
}
