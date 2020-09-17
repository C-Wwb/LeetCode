import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        System.out.println(solution.lexicalOrder(130));
    }
}
class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        for (int i = 1; i <= n; i++)
        {
            temp.add(String.valueOf(i));
        }
        Collections.sort(temp);
        for (String e : temp)
        {
            result.add(Integer.valueOf(e));
        }
        return result;
    }
}