import java.util.Scanner;
public class ArithmeticOperations {
    public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("enter 1st number: ");
            int a = in.nextInt();
            System.out.print("enter 2nd number: ");
            int b = in.nextInt();
            System.out.println("enter 3rd number:");
            int c=in.nextInt();
            System.out.println("max= "+Math.max(a,b));
            System.out.println("min ="+Math.min(a,b));
            int s=0;
            s=a+b*c;
            System.out.println("s= "+s);
            s=c+a/b;
            System.out.println("s= "+s);
            s=a%b+c;
            System.out.println("s ="+s);
            s=a*b+c;
            System.out.println("s ="+s);
        }
    }


