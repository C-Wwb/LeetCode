import java.util.Stack;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        System.out.println(solution.isValid("(("));
    }
}
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
            {
                stack.push(s.charAt(i));
            }
            else
            {
                char temp = stack.empty() ? '\0' : stack.pop();
                if ((s.charAt(i) == ')' && temp != '(') || (s.charAt(i) == ']' && temp != '[')
                        || (s.charAt(i) == '}' && temp != '{')) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}