import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        System.out.println(solution.letterCombinations("234"));
    }
}
/*class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        if (digits.length() == 0) {
            return result;
        }
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        int k = 0;//遍历字符串
        while (k < digits.length())
        {
            int i = 0;
            String left = map.get(digits.charAt(i) - 48);
            while (i < left.length())
            {
                String right = map.get(digits.charAt(k + 1) - 48);
                for (int j = 0; j < right.length(); j++)
                {
                    result.add(String.valueOf(left.charAt(i)) + right.charAt(j));
                }
                i++;
            }
            k++;
        }
        return result;
    }
}*/
class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList<>();
        if (digits.length() == 0) {
            return result;
        }
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        result.add("");
        for (int k = 0; k < digits.length(); k++)
        {
            String current = map.get(digits.charAt(k) - 48);
            int recordSize = result.size();
            for (int i = 0; i < recordSize; i++)
            {
                String inner = result.remove();
                for (int j = 0; j < current.length(); j++)
                {
                    result.add(inner + current.substring(j, j + 1));
                }
            }
        }
        return result;
    }
}