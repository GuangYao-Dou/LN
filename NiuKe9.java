package niuke;

import java.util.Arrays;

/**
 * Auther:vincent-Dou
 * Date: 2019/4/17
 * Time: 22:12
 * Description：数组中出现次数超过一半的数字
 */
public class NiuKe9 {
    public int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        int len = array.length;
        int num = array[len/2];
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (array[i] == num) {
                count++;
            }
        }
        if (count > len / 2) {
            return num;
        }
        return 0;
    }
}
