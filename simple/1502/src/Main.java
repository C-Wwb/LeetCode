import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] arr = {3, 4, 1};
        System.out.println(solution.canMakeArithmeticProgression(arr));
    }
}
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if (arr.length <= 1)
        {
            return true;
        }
        Arrays.sort(arr);
        for (int i = 1; i < arr.length - 1; i++)
        {
            if (arr[i] * 2 != arr[i - 1] + arr[i + 1])
            {
                return false;
            }
        }
        return true;
    }
}