public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        System.out.println(solution.integerBreak(10));
    }
}
/*class Solution {
    public int integerBreak(int n) {
        int sum = 1;
        if (n == 2)
        {
            return 1;
        }
        if (n == 3)
        {
            return 2;
        }
        if (n > 3)
        {
            while (n > 1)
            {
                if (n >= 3)
                {
                    n -= 3;
                    sum *= 3;
                }
                if (n == 1)
                {
                    sum = sum / 3 * 4;
                }
                if (n == 2)
                {
                    sum *= 2;
                }
            }
        }
        return sum;
    }
}*/

class Solution {
    public int integerBreak(int n) {
        if(n <= 3)
        {
            return n - 1;
        }
        if(n % 3 == 0)
        {
            return (int)Math.pow(3, n / 3);
        }
        if(n % 3 == 1)
        {
            return (int)Math.pow(3, n / 3 - 1) * 4;
        }
        return (int)Math.pow(3, n / 3) * 2;
    }
}
