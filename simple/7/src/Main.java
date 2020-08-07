public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        System.out.println(solution.reverse(964632321));
    }
}
class Solution {
    public int reverse(int x) {
        if (x == 0)
        {
            return 0;
        }
        String temp = Integer.toString(x).replaceAll(("(0)*$"),"");
        StringBuilder result = new StringBuilder();
        if (temp.charAt(0) == '-')
        {
            result.append("-");
        }
        for (int i = temp.length() - 1; i >= 0; i--)
        {
            if (temp.charAt(i) == '-')
            {
                continue;
            }
            result.append(temp.charAt(i));
        }
        try{
            x = Integer.parseInt(result.toString());
        }catch(Exception e){
            x = 0;
        }
        return x;
    }
}