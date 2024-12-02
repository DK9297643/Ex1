import java.util.Scanner;
//import static org.junit.assert
public class Main {
    public static void main(String[] args) {

        // test

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1: ");
        String number1 = scanner.nextLine();
        System.out.println("Enter number2: ");
        String number2 = scanner.nextLine();
        int base =  scanner.nextInt();
        //int x = convertToDecimal(number);
       // System.out.println("The number is: " + x);

        int dacimal1 = convertToDecimal(number1);
        int dacimal2 = convertToDecimal(number2);
        int sum = dacimal1 + dacimal2;
         convertToSum(sum,base);
    }


    public static int convertToDecimal(String number) {
        int result = 0; // התוצאה
        int power = 1;  // המעריך (הכח של הבסיס)

        // עוברים על כל ספרה במחרוזת מהסוף להתחלה
        if (!number.contains("b"))
            return -1;
        int bIndex = number.indexOf('b'); // מוצאים את המיקום של ה-"b"
        String numberPart = number.substring(0, bIndex);  // החלק של המספר
        String basepart = number.substring(bIndex + 1);
        int base = Character.getNumericValue(basepart.charAt(0));


        for (int i = numberPart.length() - 1; i >= 0; i--) {
            char digit = number.charAt(i); // לוקחים את התו בסיפור הנוכחי
            int digitValue;

            // אם מדובר בספרה (0-9)
            if (digit >= '0' && digit <= '9') {
                digitValue = Character.digit(digit, 16); // המרה לערך מספרי
            }
            // אם מדובר באות (A-G)
            else {
                digitValue = Character.digit(digit, 16);
                ; // המרה לערך מספרי (A=10, B=11, ...)
            }

            // מחשבים את הערך המבוקש
            result += digitValue * power;
            power = power * base;  // מכפילים בבסיס
        }

        return result;
    }

    public static void convertToSum(int sum, int base) {
        int n = 0;
        while (sum / base != 0) {
            n = sum % base;
            sum = sum / base;
            System.out.print(n);
        }
        System.out.print("b" + base);
    }


}



//@test
//public void testconvertToDecimal() {

//}












