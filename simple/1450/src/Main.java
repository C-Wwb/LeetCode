public class Main {
    public static void main(String[] args)
    {

        int[] startTime = {4};
        int[] endTime = {4};
        int queryTime = 4;
        Solution solution = new Solution();
        System.out.println(solution.busyStudent(startTime, endTime, queryTime));
    }
}
class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++)
        {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime)
            {
                count++;
            }
        }
        return count;
    }
}