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
        System.out.println(solution.isSubsequence(s, t));
    }
}
/*
class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0)
        {
            return true;
        }
        if (s.length() > t.length() || t.length() == 0)
        {
            return false;
        }
        HashMap<Character, Integer> T = new HashMap<>();
        for (int i = 0; i < t.length(); i++)
        {
            int countT = T.getOrDefault(t.charAt(i), 0) + 1;
            T.put(t.charAt(i), countT);
        }
        for (int i = 0; i < s.length(); i++)
        {
            int countS = T.getOrDefault(s.charAt(i), 0);
            countS--;
            T.put(s.charAt(i), countS);
            if (countS < 0)
            {
                return false;
            }
        }
        return true;
    }
}*/
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < s.length() && j < t.length())
        {
            if (s.charAt(i) == t.charAt(j))
            {
                i++;
                count++;
            }
            j++;
        }
        return count == s.length();
    }
}
/*
text
acb
ahbgdc

axc
ahbgdc
 */