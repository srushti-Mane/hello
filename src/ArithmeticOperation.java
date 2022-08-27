import java.util.Scanner;
public class ArithmeticOperation {
    public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Input 1st integer: ");
            int firstInt = in.nextInt();
            System.out.print("Input 2nd integer: ");
            int secondInt = in.nextInt();
            System.out.println("Input 3rd integer:");
            int thirdInt=in.nextInt();

            System.out.printf("Sum and pro of three integers: %d%n", (firstInt + secondInt) * thirdInt);
            System.out.printf("sum and div of three integers: %d%n", (thirdInt + firstInt)/ secondInt);
            System.out.printf("pro and sum of three integers: %d%n", (firstInt % secondInt) + thirdInt);
            System.out.printf("pro and sum of three integers: %d%n",  (firstInt * secondInt) +thirdInt);

          //  int min = Math.min(firstInt,secondInt,thirdInt);
            //int max = Math.max(firstInt,secondInt,thirdInt);
            System.out.printf("Max integer: %d%n", Math.max(firstInt, secondInt, thirdInt));
            System.out.printf("Min integer: %d%n", Math.min(firstInt, secondInt, thirdInt));
        }
    }

