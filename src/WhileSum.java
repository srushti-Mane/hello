import java.util.Scanner;
public class WhileSum {
    public static void main(String[] args){
        int x, i=1;
        int sum=0;
        System.out.println("enter the number : ");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        while(i <= x)
        {
            sum = sum +x;
            i++;
        }
        System.out.println("sum of "+x+" number is : " +sum);
    }
}
