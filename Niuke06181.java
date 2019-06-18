package niuke;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 2019/6/18
 * Time: 12:53
 * Author: vincent-Dou
 * Description：输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10
 * https://www.nowcoder.com/practice/9b4c81a02cd34f76be2659fa0d54342a?tpId=13&tqId=11172&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Niuke06181 {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
//                {13,14,15,16},
        };
//        int[][] arr = {
//                {1,2},
//                {3,4},
//                {5,6},
//                {7,8},
//                {9,10}
//        };
        ArrayList<Integer> list = printMatrix(arr);
        for(int i : list){
            System.out.println(i);
        }
    }
    public  static ArrayList<Integer> printMatrix(int [][] matrix) {
        if(matrix.length == 0){
            return new ArrayList<>();
        }
        int row = matrix.length; //行数
        int cal = matrix[0].length;//列数
        int sum = row * cal; //总数
        int count = 0;
        int i = 0;
        int j = 0;
        int[] arr = {0,0,0,0};//约束
        List<Integer> list = new ArrayList<>();
        while (count < sum){
            if(i == arr[3] && j == arr[2]){
                while (j <= cal - 1 - arr[0]){
                    list.add(matrix[i][j]);
                    count++;
                    j++;
                }
                arr[3]++;
                j--;
                i++;
                continue;
            }else if(i == arr[3] && j == cal - 1 - arr[0]){
                while (i <= row - 1 - arr[1]){
                    list.add(matrix[i][j]);
                    count++;
                    i++;
                }
                j--;
                i--;
                arr[0]++;
                continue;
            }else if (i == row -1 - arr[1] && j == cal - 1 - arr[0]){
                while ( j >= 0 + arr[2]){
                    list.add(matrix[i][j]);
                    count++;
                    j--;
                }
                i--;
                j++;
                arr[1]++;
                continue;
            }else if(i == (row - 1 - arr[1]) && j == arr[2]){
                while (i >= 0 + arr[3]){
                    list.add(matrix[i][j]);
                    count++;
                    i--;
                }
                j++;
                i++;
                arr[2]++;
                continue;
            }
        }
        return (ArrayList<Integer>) list;
    }
}
