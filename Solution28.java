package leetcode;
/*
 * ʵ�� strStr() ������

����һ�� haystack �ַ�����һ�� needle �ַ������� haystack �ַ������ҳ� needle �ַ������ֵĵ�һ��λ�� (��0��ʼ)����������ڣ��򷵻�  -1��

ʾ�� 1:

����: haystack = "hello", needle = "ll"
���: 2

ʾ�� 2:

����: haystack = "aaaaa", needle = "bba"
���: -1

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