import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = input.nextInt();
        System.out.println(solution.climbStairs(n));
    }
}
/*class Solution {
    public int climbStairs(int n) {
        if(n == 1)
        {
            return 1;
        }
        else if(n == 2)
        {
            return 2;
        }
        else
        {
            return climbStairs(n - 1) + climbStairs(n - 2);
        }
    }
}*/
class Solution {
    public int climbStairs(int n) {
        int[] result = new int[n + 3];
        result[0] = 0;
        result[1] = 1;
        result[2] = 2;
        for(int i = 3; i < n + 1; i++)
        {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n];
    }
}
