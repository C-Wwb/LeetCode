import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        Integer n = input.nextInt();
        System.out.println(solution.hammingWeight(n));
    }
}
class Solution {
    public int hammingWeight(int n) {
       return Integer.bitCount(n);
    }
}
/*
text
00000000000000000000000000001011
00000000000000000000000010000000
11111111111111111111111111111101
 */