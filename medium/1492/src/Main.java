import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        System.out.println(solution.kthFactor(1, 1));
    }
}
class Solution {
    public int kthFactor(int n, int k) {
        int i = 1;
        List<Integer> list = new ArrayList<>();
        while (i <= n)
        {
            if (n % i == 0)
            {
                list.add(i);
            }
            i++;
            if (list.size() >= k)
            {
                return list.get(k - 1);
            }
        }
        return -1;
    }
}