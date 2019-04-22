package LeetCode;

import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Auther:vincent-Dou
 * Date: 2019/4/21
 * Time: 22:18
 * Description：逆波兰表达式求值
 */
public class Solution150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
//        while ()
        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].equals("+")){
                s.push(s.pop() + s.pop());
            }else if (tokens[i].equals("-")){
                int second = Integer.valueOf(s.pop());
                int first = Integer.valueOf(s.pop());
                s.push(first - second);
            }else if(tokens[i].equals("*")){
                s.push(s.pop() * s.pop());
            }else if(tokens[i].equals("/")){
                int second = Integer.valueOf(s.pop());
                int first  = Integer.valueOf(s.pop());
                s.push(first/second);
            }else {
                s.push(Integer.valueOf(tokens[i]));
            }
        }
        return Integer.valueOf(s.pop());
    }
}
