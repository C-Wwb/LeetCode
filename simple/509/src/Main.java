import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int N = input.nextInt();
        System.out.println(solution.fib(N));
    }
}
class Solution {
    public int fib(int N)
    {
        if(N < 2)
        {
            return N;
        }
        return fib(N - 1) + fib(N - 2);
    }
}