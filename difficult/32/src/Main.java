import java.util.Scanner;
import java.util.Stack;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the string: ");
        String s = input.next();
        System.out.println(solution.longestValidParentheses(s));
    }
}
class Solution {
    public int longestValidParentheses(String s)
    {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        stack.push(-1);
        for(int i = 0; i < s.length(); i++)
        {
            if(left(s.charAt(i)))
            {
                stack.push(i);
            }
            else
            {
                stack.pop();
                if (stack.empty())
                {
                    stack.push(i);
                }
                else
                {
                    max = Math.max(max, i - stack.peek());
                }
            }
        }
        return max;
    }
    public boolean left(char element)
    {
        return element == 40;
    }
    public boolean right(char element)
    {
        return element == 41;
    }
}