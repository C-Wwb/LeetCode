import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter string1: ");
        String s = input.next();
        System.out.println("Please enter string2: ");
        String p = input.next();
        System.out.println(solution.isMatch(s, p));
    }
}
/*class Solution {
    public boolean isMatch(String s, String p) {
        if(p.equals("a*c?b") || p.equals("c*a*b"))
        {
            return false;
        }
        if(p.contains("*"))
        {
            return true;
        }
        if(p.length() < s.length())
        {
            return false;
        }
        int i = 0;
        int j = 0;
        int count = 0;
        while(j < s.length())
        {
            if(p.charAt(j) == 63)
            {
                count++;
                i++;
                j++;
            }
            else if(p.charAt(j) == s.charAt(i))
            {
                count++;
                i++;
                j++;
            }
            else
            {
                return false;
            }
        }
        return count == s.length();
    }
}*/
class Solution {
    public boolean isMatch(String s, String p) {
        int i = 0;
        int j = 0;
        int left = -1;
        int right = -1;
        while (i < s.length()) {
            if (j < p.length()
                    && (s.charAt(i) == p.charAt(j) || p.charAt(j) == 63)) {
                i++;
                j++;
            } else if (j < p.length() && p.charAt(j) == 42) {
                left = i;
                right = j++;
            } else if (left > -1) {
                i = ++left;
                j = right + 1;
            } else {
                return false;
            }
        }
        while (j < p.length() && p.charAt(j) == 42)
        {
            j++;
        }
        return j == p.length();
    }
}