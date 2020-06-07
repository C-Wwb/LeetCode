import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num = input.nextInt();
        System.out.println(solution.maximum69Number(num));
    }
}
class Solution {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        StringBuilder result = new StringBuilder();
        boolean flag = false;
        for(int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '6' && !flag)
            {
                result.append('9');
                flag = true;
            }
            else
            {
                result.append(s.charAt(i));
            }
        }
       return Integer.parseInt(result.toString());
    }
}