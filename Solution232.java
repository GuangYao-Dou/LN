package LeetCode;

import java.util.Stack;

/**
 * Auther:vincent-Dou
 * Date: 2019/4/15
 * Time: 15:56
 * description：用栈实现队列
 */
public class Solution232 {
    Stack<Integer> s1 = null;
    Stack<Integer> s2 = null;

    /** Initialize your data structure here. */
    public Solution232() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        s1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(s2.empty()){
            while (!s1.empty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(s2.empty()){
            while (!s1.empty()){
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(s1.empty() && s2.empty()){
            return true;
        }
        return false;
    }
}
