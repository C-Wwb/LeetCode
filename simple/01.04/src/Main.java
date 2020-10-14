import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        System.out.println(solution.canPermutePalindrome("ttaaacccdd"));
    }
}
class Solution {
    public boolean canPermutePalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
        {
            int count = map.getOrDefault(s.charAt(i), 0) + 1;
            map.put(s.charAt(i), count);
        }
        int count = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet())
        {
            if (entry.getValue() % 2 != 0)
            {
                count++;
            }
        }
        return count <= 1;
    }
}