import java.util.Scanner;

/**
 * Intro2CS, Ex1 - very basic "main template"
 * Make sure your implementation of this main performs as the Ex1Sol.jar solution implement all needed functions.
 *
 */
public class Ex1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = "", num2="", quit = "quit";
        while (!num1.equals(quit) && !num2.equals(quit)) {
            System.out.println();
            System.out.println("Ex1 class solution:");
            System.out.println("Enter a string as number#1 (or \"quit\" to end the program): ");
            num1 = sc.next();
            boolean n1 = Ex1.isNumber(num1);
            System.out.println(n1);
            System.out.println("Enter a string as number#2 (or \"quit\" to end the program): ");
            num2 = sc.next();
            boolean n2 = Ex1.isNumber(num2);
            System.out.println(n2);
            System.out.println("Enter the base");
           int base = Integer.parseInt(sc.next());
            int dacimal1 = Ex1.number2Int(num1);
            int dacimal2 = Ex1.number2Int(num2);
            int sum = dacimal1 + dacimal2;
            int multi = dacimal1 * dacimal2;
            boolean check = Ex1.equals(num1, num2);
            System.out.println(check);
            String [] numbers = new String [] {num1 ,num2,sum, multi} ;
             int max1 = Ex1.maxIndex(numbers[]);
            // System.out.println(sum);
               if (!num1.equals("quit")) {



               String y = Ex1.int2Number(sum,base);
                System.out.println(y);
            }
        }
        System.out.println("quiting now...");
    }
}
