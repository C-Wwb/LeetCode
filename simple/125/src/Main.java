import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the string: ");
        String s = input.nextLine();
        System.out.println(solution.isPalindrome(s));
    }
}
class Solution {
    public boolean isPalindrome(String s)
    {
        int count = 0;
        int midLength;
        StringBuilder S = new StringBuilder();//除去s中的非字母和数字
        for(int i = 0; i < s.length(); i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                S.append(s.charAt(i));
            }
        }
        if(S.length() % 2 == 0)
        {
            midLength = S.length() / 2;
        }
        else
        {
            midLength = (S.length() + 1) / 2;
        }
        String left = "";
        String right = "";
        for(int i = 0; i < midLength; i++)
        {
            left = "";
            right = "";
            left += S.charAt(i);
            for(int j = S.length() - 1 - i; j >= midLength; j--)
            {
                right += S.charAt(j);
                if(left.equalsIgnoreCase(right))
                {
                    count++;
                    break;
                }
            }
        }
        if(S.length() % 2 == 0)
        {
            return count == S.length() / 2;
        }
        else {
            return count == (S.length() - 1) / 2;
        }
    }
}
/*
text
a man, a plan, a canal: panama
 */
/*
class Solution {
    public boolean isPalindrome(String s)
    {

        int count = 0;
        int midLength;
        StringBuilder S = new StringBuilder();//除去s中的非字母和数字
        for(int i = 0; i < s.length(); i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                S.append(s.charAt(i));
            }
        }
        if(S.length() % 2 == 0)
        {
            midLength = S.length() / 2;
        }
        else
        {
            midLength = (S.length() + 1) / 2;
        }
        for(int i = 0; i < midLength; i++)
        {
            for(int j = S.length() - 1 - i; j >= midLength; j--)
            {
                if(Character.toLowerCase(S.charAt(i)) == Character.toLowerCase(S.charAt(j)))
                {
                    count++;
                    break;
                }
            }
        }
        if(S.length() % 2 == 0)
        {
            return count == S.length() / 2;
        }
        else {
            return count == (S.length() - 1) / 2;
        }
    }
}
 */