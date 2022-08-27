import java.util.Scanner;
public class Read_number {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=0;
        int hundreds=0;
        int tens=0;
        int one=0;
        System.out.println("Enter a digit number : ");
        int number = input.nextInt();
         hundreds=number / 100;
         System.out.printf("\nhundreds digit : ", hundreds);

          tens=(number - hundreds) /10;
         System.out.printf("\ntens digit : " , tens);

          one=(number - tens - hundreds);
          System.out.printf("\none digit : " , one);
    }
}
