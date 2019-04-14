package LeetCode;
import java.util.Stack;
/**
 * Auther:vincent-Dou
 * Date: 2019/4/14
 * Time: 17:02
 * description：简单的括号匹配的问题
 */
class Solution20 {
    public static void main(String[] agrs){
        System.out.println(isValid("(){}{}[]"));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(')
                stack.push(')');
            if(c == '[')
                stack.push(']');
            if(c == '{')
                stack.push('}');
            if(c == '}' || c == ']' || c == ')'){
                if(stack.empty()){
                    return false;
                }
                if(stack.pop() != c){
                    return false;
                }
            }
        }
        if(stack.empty()){
            return true;
        }
        return false;
    }
}
