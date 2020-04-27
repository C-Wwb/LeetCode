import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the attendance record of student: ");
        String s = input.next();
        Solution solution = new Solution();
        System.out.println(solution.checkRecord(s));
    }
}
class Solution
{
    public boolean checkRecord(String s)
    {
        int countAbsent = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == 'A')
            {
                countAbsent++;
            }
        }
        return countAbsent <= 1 && !s.contains("LLL");
    }
}