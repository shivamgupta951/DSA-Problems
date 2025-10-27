import java.util.Stack;

/* 20. Valid Parentheses
  Given a string s containing just the characters '(', ')', '{', '}', '[' and
  ']', determine if the input string is valid.
  An input string is valid if:
  Open brackets must be closed by the same type of brackets.
  Open brackets must be closed in the correct order.
  Every close bracket has a corresponding open bracket of the same type.
  -> 1st Approach (Optimal)
 */

public class prog29 {
    public static boolean isValid(String s) {
        char[] array = s.toCharArray();
        Stack<Character> brackets = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '{' || array[i] == '[' || array[i] == '(') {
                brackets.add(array[i]);
            } else {
                if (brackets.isEmpty()) return false;
                char top = brackets.peek();
                if (array[i] == '}' && top == '{' || array[i] == ']' && top == '[' || array[i] == ')' && top == '(') {
                    brackets.pop();
                } else {
                    return false;
                }
            }
        }
        return brackets.isEmpty();
    }

    public static void main(String args[]) {
        System.out.println(isValid("((){}"));
    }
}
