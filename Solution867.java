package LeetCode;

/**
 * Date: 2019/6/18
 * Time: 16:16
 * Author: vincent-Dou
 * Description：给定一个矩阵 A， 返回 A 的转置矩阵。
 *
 * 矩阵的转置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
 * https://leetcode-cn.com/problems/transpose-matrix/
 */
public class Solution867 {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
                {4,5,6},
//                {7,8,9}
        };
        int[][] arr2 = transpose(arr);
        for(int[] a : arr2){
            for(int b : a){
                System.out.print(b+"   ");
            }
            System.out.println();
        }
    }
    public static int[][] transpose(int[][] A) {
        if(A.length == 0){
           return new int[0][0];
        }
        int[][] arr = new int[A[0].length][A.length];
        for(int i = 0; i < A[0].length; i++){//列
            for(int j = 0; j < A.length; j++){//行
                int temp = A[j][i];
                arr[i][j] = temp;
            }
        }
        return arr;
    }
}
