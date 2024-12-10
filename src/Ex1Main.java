import java.util.Scanner;

/**
 * Intro2CS, Ex1 - very basic "main template"
 * Make sure your implementation of this main performs as the Ex1Sol.jar solution implement all needed functions.
 *
 */
public class Ex1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = "", num2 = "", quit = "quit";
        while (!num1.equals(quit) && !num2.equals(quit)) {
            System.out.println();
            System.out.println("Ex1 class solution:");
            System.out.println("Enter a string as number#1 (or \"quit\" to end the program): ");
            if (num1 != "quit") {
                num1 = sc.next();
                int dacimal1 = Ex1.number2Int(num1);
                boolean n1 = Ex1.isNumber(num1);


                if (n1 == true) {
                    System.out.println("num1= " + num1 + " is number :" + n1 + ", value: " + dacimal1);

                    System.out.println("Enter a string as number#2 (or \"quit\" to end the program): ");
                    if (num2 != "quit") {


                        num2 = sc.next();
                        int dacimal2 = Ex1.number2Int(num2);
                        boolean n2 = Ex1.isNumber(num2);
                        if (n2 == true) {
                            System.out.println("num1= " + num2 + " is number :" + n2 + ", value: " + dacimal2);
                            System.out.println("Enter a base for output: (a number [2,16]");
                            int base = Integer.parseInt(sc.next());
                            if (base >= 2 && base <= 16) {

                                int sum1 = dacimal1 + dacimal2;
                                int multi1 = dacimal1 * dacimal2;
                                String number1 = String.valueOf(dacimal1);
                                String number2 = String.valueOf(dacimal2);
                                String sum = Ex1.int2Number(sum1, base);
                                String multi = Ex1.int2Number(multi1, base);
                                System.out.println(num1 + " + " + num2 + " = " + sum);
                                System.out.println(num1 + " * " + num2 + " = " + multi);
                                boolean check = Ex1.equals(num1, num2);
                                //System.out.println(check);
                                String[] numbers = new String[]{num1, num2, sum, multi};
                                int max1 = Ex1.maxIndex(numbers);
                                System.out.println("Max number over [" + num1 + "," + num2 + "," + sum + "," + multi + "] is: " + (numbers[max1]));
                            } else {
                                System.out.println("ERR: wrong base, should be [2,16], got" + "(" + base + ")");

                            }


                        } else {
                            System.out.println("num2= " + num2 + " is not number :" + n2 + ", value: -1");
                            System.out.println(" ERR: num2 is in the wrong format! " + "(" + num2 + ")");
                        }
                    }
                } else {
                        System.out.println("num1= " + num1 + " is not number :" + n1 + ", value: -1");
                        System.out.println(" ERR: num1 is in the wrong format! " + "(" + num1 + ")");
                    }


                    //  if (!num1.equals("quit")) {


                    // }  // String y = Ex1.int2Number(sum,base);
                    //  System.out.println(y);



            }

        }
        System.out.println("quiting now...");
    }
}
