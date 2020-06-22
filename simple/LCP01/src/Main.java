import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of array: ");
        int size = input.nextInt();
        System.out.println("Please enter the guess: ");
        int[] guess = new int[size];
        for(int i = 0; i < guess.length; i++)
        {
            guess[i] = input.nextInt();
        }
        System.out.println("Please enter the answer: ");
        int[] answer = new int[size];
        for(int i = 0; i < answer.length; i++)
        {
            answer[i] = input.nextInt();
        }
        System.out.println(solution.game(guess, answer));
    }
}
class Solution {
    public int game(int[] guess, int[] answer) {
        int index = 0;
        int count = 0;
        while (index < guess.length)
        {
            if(guess[index] == answer[index])
            {
                count++;
            }
            index++;
        }
        return count;
    }
}
/*
text
3
1 2 3
1 2 3
2 2 3
 */