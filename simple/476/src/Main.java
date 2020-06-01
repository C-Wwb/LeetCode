import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = input.nextInt();
        System.out.println(solution.findComplement(num));
    }
}
class Solution {
    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        StringBuilder binaryReverse = new StringBuilder();
        for(int i = 0; i < binary.length(); i++)
        {
            if(binary.charAt(i) == '0')
            {
                binaryReverse.append('1');
            }
            else
            {
                binaryReverse.append('0');
            }
        }
        return Integer.parseInt(binaryReverse.toString(), 2);
    }
}