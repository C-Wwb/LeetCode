import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("The size of array1: ");
        int sizeA = input.nextInt();
        System.out.println("Please enter array1: ");
        int[] A = new int[sizeA];
        for(int i = 0; i < A.length; i++)
        {
            A[i] = input.nextInt();
        }
        System.out.println("The size of array2: ");
        int sizeB = input.nextInt();
        System.out.println("Please enter array2: ");
        int[] B = new int[sizeA];
        for(int i = 0; i < B.length; i++)
        {
            B[i] = input.nextInt();
        }
        System.out.println(solution.findLength(A, B));

    }
}
/*class Solution {
    public int findLength(int[] A, int[] B) {
        String a = toString(A);
        String b = toString(B);
        int i = 0;
        int count = 0;
        while(i < a.length() - 1)
        {
            String current = "";
            for(int j = i + 1; j < a.length(); j++)
            {
                current = a.substring(i, j + 1);
                if(b.contains(current))
                {
                    count = Math.max(count, j - i + 1);
                }
            }
            i++;
        }
        return count;
    }
    public static String toString(int[] A)
    {
        String result = "";
        for (int value : A) {
            result += value;
        }
        return result;
    }
}*/
class Solution {
    public int findLength(int[] A, int[] B) {
        int[][] result = new int[A.length + 1][B.length + 1];
        int count = 0;
        for (int i = A.length - 1; i >= 0; i--)
        {
            for (int j = B.length - 1; j >= 0; j--)
            {
                result[i][j] = A[i] == B[j] ? result[i + 1][j + 1] + 1 : 0;
                count = Math.max(count, result[i][j]);
            }
        }
        return count;
    }
}
/*
text
1 2 3 2 1
3 2 1 4 7
 */