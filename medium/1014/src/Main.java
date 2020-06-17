import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of array: ");
        int size = input.nextInt();
        System.out.println("Please enter the array: ");
        int[] A = new int[size];
        for(int i = 0; i < A.length; i++)
        {
            A[i] = input.nextInt();
        }
        System.out.println(solution.maxScoreSightseeingPair(A));
    }
}
/*
class Solution {
    public int maxScoreSightseeingPair(int[] A) {
        int max = 0;
        int i = 0;
        while(i < A.length)
        {
            int j = i + 1;
            while(j < A.length)
            {
                max = Math.max(max, A[i] + A[j] + i - j);
                j++;
            }
            i++;
        }
        return max;
    }
}*/
class Solution {
    public int maxScoreSightseeingPair(int[] A) {
        //A[i] + i 和 A[i] - i
        int max = 0, left = A[0];
        for (int i = 1; i < A.length; i++) {
            max = Math.max(max, left + A[i] - i);
            left = Math.max(left, A[i] + i);
        }
        return max;
    }
}
/*
text
8 1 5 2 6
 */