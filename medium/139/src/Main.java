import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the string: ");
        String s = input.next();
        List<String> wordDict = new LinkedList<>();
        wordDict.add("cats");
        wordDict.add(("dog"));
        wordDict.add("sand");
        wordDict.add("and");
        wordDict.add("cat");
        System.out.println(solution.wordBreak(s, wordDict));
    }
}
class Solution {
    public boolean wordBreak(String s, List<String> dict) {
        boolean[] flag = new boolean[s.length() + 1];
        flag[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (String str : dict) {
                if (str.length() <= i && flag[i - str.length()]
                        && str.equals(s.substring(i - str.length(), i))) {
                    flag[i] = true;
                    break;
                }
            }
        }
        return flag[s.length()];
    }
}
