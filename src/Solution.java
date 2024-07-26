import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public static boolean isValid(String s) {
        String[] tmp = s.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(tmp));
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i).equals("(") || list.get(i).equals("[") || list.get(i).equals("{")) {

                stack.push(list.get(i));

            } else if (list.get(i).equals(")")) {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.peek().equals("(") ) {
                    stack.pop();
                }
            } else if (list.get(i).equals("]")) {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.peek().equals("[")) {
                    stack.pop();
                } else return false;
            } else if (list.get(i).equals("}")) {
                if (stack.isEmpty()) return false;
                if (stack.peek().equals("{") ) {
                    stack.pop();
                } 
            }
        
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isValid("(])"));
    }
}