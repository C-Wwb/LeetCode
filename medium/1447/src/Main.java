import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        System.out.println(solution.simplifiedFractions(6));
    }
}
class Solution {
    public List<String> simplifiedFractions(int n) {
        int denominator = 2;
        List<String> result = new ArrayList<>();
        while (denominator <= n)
        {
            for (int molecular = 1; molecular < denominator; molecular++)
            {
                if (coPrime(denominator, molecular) == 1)
                {
                    result.add(molecular + "/" + denominator);
                }
            }
            denominator++;
        }
        return result;
    }
    public static int coPrime(int m, int n)
    {
        if (m == 0 || n == 0)
        {
            return 1;
        }
        if (m % n == 0)
        {
            return n;
        }
        else
        {
            return coPrime(n, m % n);
        }
    }
}