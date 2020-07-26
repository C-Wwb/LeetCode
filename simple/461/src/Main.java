import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number1: ");
        int x = input.nextInt();
        System.out.println("Please enter number2: ");
        int y = input.nextInt();
        System.out.println(solution.hammingDistance(x, y));
    }
}


