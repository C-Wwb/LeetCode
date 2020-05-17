import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String s = input.nextLine();
        System.out.println(solution.firstUniqChar(s));
    }
}
class Solution {
    public char firstUniqChar(String s) {
        int[] result = new int[128];
        for(int i = 0; i < s.length(); i++)
        {
            result[(int)s.charAt(i)]++;
        }
        for(int i = 0; i < s.length(); i++)
        {
            if(result[(int)s.charAt(i)] == 1)
            {
                return s.charAt(i);
            }
        }
        return ' ';
    }
}
/*
text
abaccdeff
 */