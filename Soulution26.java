package LeetCode;

/**
 * Auther:vincent-Dou
 * Date: 2019/4/24
 * Time: 21:47
 * Description：删除有序数组的重复元素
 */
public class Soulution26 {
    public static void main(String[] agrs){
        int[] arr = {1,1,2,33,33,44};
        for(int i : arr){
            System.out.printf(i+",");
        }
        System.out.println();
        teremoveDuplicatesst(arr);
        for(int i : arr){
            System.out.printf(i+",");
        }
    }
    public static int teremoveDuplicatesst(int[] nums){
        if(nums == null || nums.length == 0){
            return 0;
        }
        int index = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[index]){
                nums[index + 1] = nums[i];
                index++;
            }
        }
        return index + 1;
    }
}
