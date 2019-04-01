package LeetCode;

/**
 * Auther:vincent-Dou
 */
/*
假设你正在爬楼梯。需要 n 阶你才能到达楼顶。

每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

注意：给定 n 是一个正整数。
 */
public class Solution70 {
    public static void main(String[] args){
        System.out.println(step2(20));
        System.out.println(step1(20));
        System.out.println(step3(20));
    }

    //直接用递归实现，算法效率低下
    public static int step1(int n){
        if(n <= 2){
            return n;
        }
        return step1(n-1) + step1(n - 2);
    }

    //交换的思想,效率真滴好高
    public static int step2(int n){
        if(n <= 2){
            return n;
        }
        int first = 1;
        int second = 2;
        for(int i = 3; i <= n; i++){
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }

    //将台阶看成数组，浪费空间
    public static int step3(int n){
        if(n <= 2){
            return  n;
        }
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 2;
        for(int i = 2; i < arr.length; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n - 1];
    }
}
