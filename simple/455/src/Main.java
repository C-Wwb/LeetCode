import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of children: ");
        int numberOfChildren = input.nextInt();

        int[] g = new int[numberOfChildren];
        System.out.println("Please enter children`s appetite: ");
        for(int i = 0; i < g.length; i++)
        {
            g[i] = input.nextInt();
        }

        System.out.println("Please enter the number of biscuits: ");
        int numberOfBiscuits = input.nextInt();

        int[] s = new int[numberOfBiscuits];
        System.out.println("Please enter biscuits`s size: ");
        for(int i = 0; i < s.length; i++)
        {
            s[i] = input.nextInt();
        }

        System.out.println(solution.findContentChildren(g, s));
    }
}
class Solution {
    public int findContentChildren(int[] g, int[] s)
    {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < g.length && j < s.length)
        {
            if(s[j] >= g[i])
            {
                count++;
                i++;
            }
            j++;
        }
        return count;
    }
}