import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        String[] words = {"a", "b", "c", "d"};
        System.out.println(solution.getValidT9Words("2", words));
    }
}
class Solution {
    public List<String> getValidT9Words(String num, String[] words) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        List<String> result = new ArrayList<>();
        int i = 0; //num的长度
        int j = 0; //words的长度
        int k = 0; //words中其中一个字符串的长度
        for (j = 0; j < words.length; j++)
        {
            while (i < num.length() && k < words[j].length())
            {
                String temp = words[j].charAt(k) + "";
                if (map.get(num.charAt(i) - 48).contains(temp))
                {
                    i++;
                    k++;
                    if (k == words[j].length())
                    {
                        result.add(words[j]);
                        i = 0;
                        k = 0;
                        break;
                    }
                }
                else
                {
                    i = 0;
                    k = 0;
                    break;
                }
            }
        }
        return result;
    }
}