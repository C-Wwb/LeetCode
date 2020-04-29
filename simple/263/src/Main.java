import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = input.nextInt();
        Solution s = new Solution();
        System.out.println(s.isUgly(num));
    }
}
class Solution {
    public boolean isUgly(int num) {
        if(num < 1)
        {
            return false;
        }
        while (num % 5 == 0)
        {
            num /= 5;
        }
        while (num % 3 == 0)
        {
            num /= 3;
        }
        while (num % 2 == 0)
        {
            num /= 2;
        }
        return num == 1;
    }
}