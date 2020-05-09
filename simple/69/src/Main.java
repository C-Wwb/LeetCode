import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int x = input.nextInt();
        System.out.println(solution.mySqrt(x));
    }
}
/*
class Solution {
    public int mySqrt(int x) {
        return (int)(Math.sqrt(x));
    }
}
 */
class Solution {
    public int mySqrt(int x) {
        int a = 0;
        while(Math.pow(a, 2) <= x)
        {
            a++;
        }
        return a - 1;
    }
}