package com.hfut.offer;

public class QuanPaiLie {
    static int count=0;
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("abcd");
        Permutation(str);
    }
    public static void Permutation(StringBuilder str){
        Permutation(str,0);
        System.out.println(count);  //输出全排列个数
    }
    public static void Permutation(StringBuilder str,int index){
        int n=str.length();
        if(index==n){
            System.out.println(str);
            count++;
        }else{
            for(int i=index;i<n;i++){
                char c=str.charAt(i);
                str.setCharAt(i,str.charAt(index));
                str.setCharAt(index,c);
                Permutation(str,index+1);
                c=str.charAt(i);
                str.setCharAt(i,str.charAt(index));
                str.setCharAt(index,c);
            }
        }
    }
}
