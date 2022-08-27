import java.util.Scanner;
public class ForPalindromeNumber {
    public static void main(String[] args) {
        int rem, s, u;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int number = input.nextInt();
        int reverse = 0;
        u = number;
        for (; number != 0; number = number / 10) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("reverse of number is :" + reverse);
        for (s = 0; number > 0; number/=10)
        {
            rem = number % 10;
            s = (s * 10) + rem;
        }
        if (s==u)
            System.out.println(" palindrome");
        else
            System.out.println(" not palindrome");
    }
}

