import java.util.Scanner;
public class WhileReverse {
    public static void main(String[] args){
      Scanner input=new Scanner(System.in);
      System.out.println("enter a number");
        int number=input.nextInt();
             int reverse=0;
        while(number!=0)
        {
            int remainder=number%10;
            reverse=reverse*10+remainder;
            number=number/10;
        }
        System.out.println("reverse of number is : " +reverse);
    }
}
