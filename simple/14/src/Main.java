import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of strs: ");
        int size = input.nextInt();
        System.out.println("Please enter the strs: ");
        String[] strs = new String[size];
        for(int i = 0; i < strs.length; i++)
        {
            strs[i] = input.next();
        }
        System.out.println(solution.longestCommonPrefix(strs));
    }
}
class Solution {/*
    public String longestCommonPrefix(String[] strs) {
        String standard = "";
        int wordIndex = 0;
        while(wordIndex < 10000)
        {
            if (strs == null || strs.length == 0) {
                return "";
            }
            if(strs[0].charAt(0) == 34)
            {
                return "";
            }
            int count = 0;
            for(int i = 0; i < strs.length - 1; i++)
            {
                if(strs[i].charAt(wordIndex) == strs[i + 1].charAt(wordIndex))
                {
                    count++;
                }
            }
            if(count == strs.length - 1)
            {
                standard += strs[strs.length - 1].charAt(wordIndex);
                wordIndex++;
            }
            else
            {
                return standard;
            }
        }
        return null;
    }*/
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String standard = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String str = strs[i];
            if (str.equals("") || standard.equals("")) {
                return "";
            }
            int start = 0;
            while (start < standard.length() && start < str.length()
                    && str.charAt(start) == standard.charAt(start)) {
                start++;
            }
            standard = standard.substring(0, start);
        }
        return standard;
    }
}
/*
text
flower
flow
flight

dog
cat
pig
 */