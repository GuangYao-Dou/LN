package LeetCode;

/**
 * Auther:vincent-Dou
 * Date: 2019/4/12
 * Time: 19:33
 * description：只出现一次的数字,给定一个非空整数数组，除了某个元素只出现一次以外，
 * 其余每个元素均出现两次。找出那个只出现了一次的元素。
 */
public class solution136 {
    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean flag = false;
            for(int j = 0; j < nums.length;j++){
                if(i == j){
                    continue;
                }
                if(nums[i] == nums[j]){
                    flag = true;
                }
            }
            if(flag == false){
                return nums[i];
            }
        }
        return -1;
    }
}