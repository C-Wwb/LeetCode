import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = input.nextInt();
        System.out.println(solution.fizzBuzz(n));
    }
}
class Solution {
    List<String> list = new LinkedList();
    public List<String> fizzBuzz(int n) {
        if (n == 1)
        {
            list.add("1");
            Collections.reverse(list);
            return list;
        }
        if (n % 3 == 0 && n % 5 == 0)
        {
            list.add("FizzBuzz");
        }
        else if (n % 3 == 0)
        {
            list.add("Fizz");
        }
        else if (n % 5 == 0)
        {
            list.add("Buzz");
        }
        else
        {
            list.add(String.valueOf(n));
        }
        n -= 1;
        return fizzBuzz(n);
    }
}