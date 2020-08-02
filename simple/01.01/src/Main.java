import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args)
    {
        String astr = "abc";
        Solution solution = new Solution();
        System.out.println(solution.isUnique(astr));
    }
}
class Solution {
    public boolean isUnique(String astr) {
        HashMap<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < astr.length(); i++)
        {
            int count = result.getOrDefault(astr.charAt(i), 0) + 1;
            result.put(astr.charAt(i), count);
        }

        for (Map.Entry<Character, Integer> entry : result.entrySet())
        {
            if (entry.getValue() != 1)
            {
                return false;
            }
        }
        return true;
    }
}