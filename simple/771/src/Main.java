import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the string1: ");
        String J = input.next();
        System.out.println("Please enter the string2: ");
        String S = input.next();
        System.out.println(solution.numJewelsInStones(J, S));
    }
}
class Solution {
    public int numJewelsInStones(String J, String S) {
        int[] count = new int[58];//122 - 65 + 1 A-z
        int result = 0;
        int index = 0;
        for(int i = 0; i < S.length(); i++)
        {
            count[S.charAt(i) - 65]++;
            if(i == S.length() - 1)
            {
                while(index < J.length())
                {
                    result += count[J.charAt(index) - 65];
                    index++;
                }
            }
        }
        return result;
    }
}
/*
text
aA
aAAbbbb
 */