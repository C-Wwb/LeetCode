import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        int[] arr = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        Solution solution = new Solution();
        System.out.println(solution.uniqueOccurrences(arr));
    }
}
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int e : arr)
        {
            int count = map.getOrDefault(e, 0) + 1;
            map.put(e, count);
        }
        List<Integer> judge = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if (!judge.contains(entry.getValue()))
            {
                judge.add(entry.getValue());
            }
        }
        return judge.size() == map.size();
    }
}