import java.util.Stack;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates("acbbc"));
    }
}
class Solution {
    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++)
        {
            if (stack.empty() || S.charAt(i) != stack.peek())
            {
                stack.add(S.charAt(i));
            }
            else if (S.charAt(i) == stack.peek())
            {
                stack.pop();
            }
        }
        StringBuilder result = new StringBuilder();
        for (Character e : stack)
        {
            result.append(e);
        }
        return result.toString();
    }
}