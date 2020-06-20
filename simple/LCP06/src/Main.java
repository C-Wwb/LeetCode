import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of array: ");
        int size = input.nextInt();
        System.out.println("Please enter the array: ");
        int[] coins = new int[size];
        for(int i = 0; i < coins.length; i++)
        {
            coins[i] = input.nextInt();
        }
        System.out.println(solution.minCount(coins));
    }
}
class Solution {
    public int minCount(int[] coins) {
        int result = 0;
        for (int coin : coins) {
            result += count(coin);
        }
        return result;
    }
    public static int count(int number)//计算每一个数的最多计算次数
    {
        return number / 2 + number % 2;
    }
}
/*
text
4 2 1
 */