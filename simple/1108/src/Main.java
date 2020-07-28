import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the address: ");
        String address = input.next();
        System.out.println(solution.defangIPaddr(address));
    }
}
class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
