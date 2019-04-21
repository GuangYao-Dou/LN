package LeetCode;

import java.util.Stack;

/**
 * Auther:vincent-Dou
 * Date: 2019/4/15
 * Time: 16:08
 * description：设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈
 */
public class Solution155 {
    public static void main(String[] agrs){
        /**
         * 要记得包装类类型的数据在进行比较时，是对象在进行比较；
         * 要将其中一个装换为基本数据类型在进行 == 操作
         */
        Integer a = new Integer(25);
        Integer b = new Integer(25);
        int c = 25;
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a == c);
    }

    private Stack<Integer> s1;
    private Stack<Integer> s2;


    /** initialize your data structure here. */
    public Solution155() {
        s2 = new Stack<>();
        s1 = new Stack<>();
    }

    public void push(int x) {
        s1.push(x);
        if(s2.empty()){
            s2.push(x);
        }else if(s2.peek() >= x){
            s2.push(x);
        }
    }

    public void pop() {
        if(!s1.empty()){
            int data = s1.pop();
            if(data == s2.peek()){
                s2.pop();
            }
        }
    }

    public int top() {
        if(s1.empty()){
            return 0;
        }
        return s1.peek();
    }

    public int getMin() {
        if (s2.empty()) {
            return 0;
        }
        return s2.peek();
    }
}
