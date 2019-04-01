package leetcode;

public class Solution35 {
	public static void main(String[] args) {
		int[] ar = {1,3,5,6};
		int key = 5;
		System.out.println(erfen(ar, key));
	}
//	public static void main(String[] args) {
//		int[] nums = {1,3,5,6};
//		int t= 5;
//		System.out.println(searchInsert(nums, 7));
	
    public static int searchInsert(int[] nums, int target) {
        int sta = 0;
        int end = nums.length;
        int mid = (sta + end)/2;
        while(sta < end){
            if(target == nums[mid]){
                return mid;
            }
            if(target > nums[mid]){
                sta = mid + 1;
                mid = (mid + end)/2;
            }else {
                end = mid -1;
                mid = (mid + end)/2;
            }
        }
        if(nums[mid] > target){
            return mid - 1;
        }else{
            return mid + 1;
        }
    }
    public static int erfen(int[] arr, int key) {
    	int head = 0;
    	int tail = arr.length - 1;
    	int mid = 0;
    	while(head <= tail) {
    		mid = (head + tail)/2;
    		if(arr[mid] == key) {
    			return mid;
    		}
    		if(arr[mid] < key ) {
    			tail = mid -1;
    		}else {
    			head = mid + 1;
    		}
    	}
    	return -1;
    }
    
}








