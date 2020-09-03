import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.printNumbers(3)));
    }
}
class Solution {
    public int[] printNumbers(int n) {
        StringBuilder target = new StringBuilder("" + '1');
        for (int i = 0; i < n; i++)
        {
            target.append('0');
        }
        int border = Integer.parseInt(target.toString());
        int[] result = new int[border - 1];
        for (int i = 1; i < border; i++)
        {
            result[i - 1] = i;
        }
        return result;
    }
}