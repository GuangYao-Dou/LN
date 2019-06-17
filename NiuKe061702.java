package niuke;

/**
 * Date: 2019/6/17
 * Time: 18:36
 * Author: vincent-Dou
 * Description：
 */
public class NiuKe061702 {
    public static void main(String[] args) {
//        int[][] arr = {
//                {1,2,3,4,5,6},
//                {5,6,9,7,3},
//                {5,6,9,7,3,9},
//                {5,6,9,7,3,6},
//        };

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println(erfen(arr,12));
    }
    public static boolean Find(int target, int [][] array) {
        //定义多维数组的行数
        int m = array.length - 1;
        //定义多维数组的列数
        int i = 0;
        while(m >= 0 && i < array[0].length){
            if(array[m][i] > target)
                m--;
            else if(array[m][i] < target)
                i++;
            else
                return true;
        }
        return false;
    }
    public static boolean fing(int[][] array, int target){
        int cal = array[0].length;
        int row = array.length;
        int i = row / 2;
        int j = cal / 2;
        while (i >= row){
            if(array[i][0] == target){
                return true;
            }else if(array[i][0] > target){
                i = (i + row) / 2 + 1;
            }
        }
        return false;
    }
    public static int  erfen(int[] arr, int target){
        int low = 0;
        int hig = arr.length - 1;
        while (low <= hig){
            int mid = (low + hig) / 2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                low = mid + 1;
            }else if(arr[mid] > target){
                hig = mid - 1;
            }
        }
        return -1;
    }
}
