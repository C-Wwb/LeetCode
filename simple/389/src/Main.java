import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the string1: ");
        String s = input.next();
        System.out.println("Please enter the string2: ");
        String t = input.next();
        System.out.println(solution.findTheDifference(s, t));
    }
}
class Solution {
    public char findTheDifference(String s, String t) {
        int[] S = new int[26];
        int[] T = new int[26];
        for(int i = 0; i < s.length(); i++)
        {
            S[(int)s.charAt(i) - 97]++;
        }
        for(int i = 0; i < t.length(); i++)
        {
            T[(int)t.charAt(i) - 97]++;
        }
        for(int i = 0; i < S.length; i++)
        {
            if(S[i] != T[i])
            {
                return (char)(i + 97);
            }
        }
        return 0;
    }
}
/*
text
    abcd
    abcde
 */