package leetcode;
/*
 * 实现 strStr() 函数。

给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。

示例 1:

输入: haystack = "hello", needle = "ll"
输出: 2

示例 2:

输入: haystack = "aaaaa", needle = "bba"
输出: -1

 */
public class Solution28 {
	public static void main(String[] args) {
		String s1 = new String("hepllo");
		String s2 = new String("lo");
		String s = s1.substring(0,1);
		System.out.println(s);
		System.out.println(strStr(s1, s2));
	}
	public static int strStr(String haystack, String needle) {
	    if(needle == null || needle.equals("")) {
	    	return 0;
	    }
	    int index = -1;
	    for(int i = 0; i < haystack.length(); i++) {
	    	for(int j = i+1; j < haystack.length()+1; j++) {
	    		String s = haystack.substring(i,j);
	    		if(s.equals(needle) == true) {
	    			index = i;
	    			break;
	    		}
	    	}
	    }
	    return index;
	}
    public static boolean isExist(String yuan, String duibi) {
    	boolean is = yuan.contains(duibi);
    	return false;
    }
	
}