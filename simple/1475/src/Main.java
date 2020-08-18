import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] prices = {10,1,1,6};
        System.out.println(Arrays.toString(solution.finalPrices(prices)));
    }
}
class Solution {
    public int[] finalPrices(int[] prices) {
        int[] result = new int[prices.length];
        int j = 0;
        for (int i = 0; i < prices.length; i++)
        {
            j = i + 1;
            while (j < prices.length)
            {
                if (prices[j] <= prices[i])
                {
                    result[i] = prices[i] - prices[j];
                    break;
                }
                else
                {
                    result[i] = prices[i];
                }
                j++;
            }
        }
        result[prices.length - 1] = prices[prices.length - 1];
        return result;
    }
}