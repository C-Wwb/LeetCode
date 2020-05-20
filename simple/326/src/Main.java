import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution s = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = input.nextInt();
        System.out.println(s.isPowerOfThree(n));
    }
}
class Solution {
    public boolean isPowerOfThree(int n)
    {
        if(n == 3 || n == 1)
        {
            return true;
        }
        if(n % 3 != 0 || n == 0)
        {
            return false;
        }
        n /= 3;
        return isPowerOfThree(n);
    }
}