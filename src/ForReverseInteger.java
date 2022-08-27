import java.util.Scanner;
public class ForReverseInteger {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("enter a number");
            int number = input.nextInt();
            int reverse = 0;
            for(;number!= 0; number=number/10)
            {
                int remainder = number % 10;
                reverse = reverse * 10 + remainder;
            }
            System.out.println("reverse of number is :" + reverse);
        }
    }

