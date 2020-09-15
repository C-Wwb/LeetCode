import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        //int[] arr = {3, 3, 3, 3, 5, 5, 5, 2, 2, 7};
        //int[] arr = {7, 7, 7, 7, 7, 7};
        //int[] arr = {1, 9};
        //int[] arr = {2, 2, 3, 7};
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Solution solution = new Solution();
        System.out.println(solution.minSetSize(arr));
    }
}
class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int e : arr)
        {
            int count = map.getOrDefault(e, 0) + 1;
            map.put(e, count);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Comparator.comparingInt(Map.Entry::getValue));
        int index = map.size() - 1;
        int count = 0;
        int sum = 0;
        while (index > 0)
        {
            sum += list.get(index).getValue();
            count++;
            if (sum >= arr.length / 2)
            {
                return count;
            }
            index--;
        }
        return 1;
    }
}