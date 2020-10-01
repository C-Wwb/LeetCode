import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] A = {3, 1, 2, 4};
        System.out.println(Arrays.toString(solution.sortArrayByParity(A)));
    }
}
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (int e : A)
        {
            if (e % 2 != 0)
            {
                odd.add(e);
            }
            else
            {
                even.add(e);
            }
        }
        even.addAll(odd);
        for (int i = 0; i < even.size(); i++)
        {
            result[i] = even.get(i);
        }
        return result;
    }
}