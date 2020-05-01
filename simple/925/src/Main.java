import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution s = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name: ");
        String name = input.next();
        System.out.println("Please enter the typed: ");
        String typed = input.next();
        System.out.println(s.isLongPressedName(name, typed));
    }
}
/*class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int[] Name = new int[26];
        int[] Typed = new int[26];//string-97
        int count = 0;
        for(int i = 0; i < name.length(); i++)
        {
            Name[name.charAt(i) - 97]++;
        }
        for(int i = 0; i < typed.length(); i++)
        {
            Typed[typed.charAt(i) - 97]++;
        }
        for(int i = 0; i < 26; i++)
        {
            if(Name[i] <= Typed[i])
            {
                count++;
            }
        }
        return count == 26;
    }
}*/
/*class Solution {
    public boolean isLongPressedName(String name, String typed) {
        char[] Name = name.toCharArray();
        char[] Typed = typed.toCharArray();
        int i = 0;
        int j = 0;
        while(i < name.length() && j < typed.length())
        {
            if(Name[i] == Typed[j])
            {
                i++;
            }
            j++;
            if(i == name.length())
            {
                return true;
            }
        }
        return false;
    }
}*/
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int j = 0;
        for (char c: name.toCharArray()) {
            if (j == typed.length())
                return false;

            // If mismatch...
            if (typed.charAt(j) != c) {
                // If it's the first char of the block, ans is false.
                if (j==0 || typed.charAt(j-1) != typed.charAt(j))
                    return false;

                // Discard all similar chars
                char cur = typed.charAt(j);
                while (j < typed.length() && typed.charAt(j) == cur)
                    j++;

                // If next isn't a match, ans is false.
                if (j == typed.length() || typed.charAt(j) != c)
                    return false;
            }

            j++;
        }

        return true;
    }
}