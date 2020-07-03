import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the left: ");
        int left = input.nextInt();
        System.out.println("Please enter the right: ");
        int right = input.nextInt();
        System.out.println(solution.selfDividingNumbers(left, right));
    }
}
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new LinkedList<>();
        int count = 0;
        for(int i = left; i <= right; i++)
        {
            //char[] current = Integer.toString(i).toCharArray();
            String current = Integer.toString(i);
            count = 0;
            int j = 0;
            while(j < current.length())
            {
                if((current.charAt(j) - 48) != 0 &&i % (current.charAt(j) - 48) == 0)
                {
                    count++;
                }
                if(count == current.length())
                {
                    result.add(i);
                }
                j++;
            }
        }
        return result;
    }
}
/*
text
1
22
 */