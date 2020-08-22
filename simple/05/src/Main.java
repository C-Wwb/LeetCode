public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        System.out.println(solution.replaceSpace("We are happy."));
    }
}
class Solution {
    public String replaceSpace(String s) {
        return s.replace(" ", "%20");
    }
}