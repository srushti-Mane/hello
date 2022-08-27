import java.util.Scanner;
public class DigitNumber {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number : ");
            int n=sc.nextInt();
            int b=n % 10;
            int a=n / 10;
            String[] one_digits = new String[]{"zero","one","two","three","four","five", "six","seven","eight","nine"};
            if(a==1 || b==0)
            {
                System.out.println("two_digit");
            }
           else
                System.out.println(one_digits[b]);
        }
    }


