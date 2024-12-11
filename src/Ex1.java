/**
 * This class represents a simple solution for Ex1.
 * As defined here: https://docs.google.com/document/d/1AJ9wtnL1qdEs4DAKqBlO1bXCM6r6GJ_J/r/edit/edit
 * In this assignment, we will design a number formatting converter and calculator.
 * In general, we will use Strings as numbers over basis of binary till Hexa.
 * [2-16], 10-16 are represented by A,B,..G.
 * The general representation of the numbers is as a String with the following format:
 * <number><b><base> e.g., “135bA” (i.e., “135”, as 10 is the default base), “100111b2”, “12345b6”,”012b5”, “123bG”, “EFbG”.
 * The following are NOT in the format (not a valid number):
 * “b2”, “0b1”, “123b”, “1234b11”, “3b3”, “-3b5”, “3 b4”, “GbG”, "", null,
 * You should implement the following static functions:
 */
public class Ex1 {

    //test
    /**
     * Convert the given number (num) to a decimal representation (as int).
     * It the given number is not in a valid format returns -1.
     *
     * @param num a String representing a number in basis [2,16]
     * @return
     */
    public static int number2Int(String num) {
        //int ans = -1;

        int result = 0;
        int power = 1;
        int number ;

        if (!num.contains("b"))
            for (int i=0; i<num.length(); i++) {
                if ((num.charAt(i) >= '0' && num.charAt(i) <= '9')){
                     number =  Integer.valueOf(num);
                    return number;
            }else {
                    return -1;
                }
            }
        int bIndex = num.indexOf('b'); //
        String numberPart = num.substring(0, bIndex);
        int base;
        if (num.substring(bIndex + 1)!="") {
            String basepart = num.substring(bIndex + 1);
            base = charToint(basepart.charAt(0));
        }else{
            return -1;
        }

        for (int i = numberPart.length() - 1; i >= 0; i--) {
            char digit = num.charAt(i);
            int digitValue;


            if (digit >= '0' && digit <= '9') {
                digitValue = Character.digit(digit, 16);
            }

            else {
                digitValue = Character.digit(digit, 16);

            }


            result += digitValue * power;
            power = power * base;
        }

        return result;
    }
    //return ans;

    /**
     * This static function checks if the given String (g) is in a valid "number" format.
     *
     * @param a a String representing a number
     * @return true iff the given String is in a number format
     */
    public static boolean isNumber(String a) {
        if((a == null) || (a.isEmpty()) ){
            return false;
        }
        int index = a.indexOf('b');
        String notBcontain = "0123456789";
        String validChars = "0123456789ABCDEFG";
        String baseChars = "23456789ABCDEFG";
        char lastChar = a.charAt(a.length() - 1);
        String basepart = a.substring(index + 1);
       // String numberPart = a.substring(0, index);
       // int value = Integer.parseInt(a);
        int lustValue = charToint(lastChar);
        boolean ans = true;

        // add your code here


        if ((a.indexOf(' ') != -1) ||   ((a.contains("b")) && (a.length()<3) ||  ((a.contains("b")) && index < (a.length() - 2))))  {
           return  false;
        }
        if (!(a.contains("b")))
        for (int i=0; i<a.length(); i++) {
            if (!(a.charAt(i) >= '0' && a.charAt(i) <= '9')){
                return false;
            }

        } if ((a.contains("b")))
            for (int i=0; i<a.length(); i++) {
                if (!(a.charAt(i) >= '0' && a.charAt(i) <= '9' || a.charAt(i) >= 'A' && a.charAt(i) <= 'G' || a.charAt(i)=='b')) {
                    return false;
                }

            }


        if ((a.contains("b")))
            for (int i = 0; i < a.length() - 2; i++) {
            char digit = a.charAt(i);
            int digitValue = charToint(digit);
            if (digitValue >= lustValue)
                return false;


        }
        return true;
    }
    /**
     * Calculate the number representation (in basis base)
     * of the given natural number (represented as an integer).
     * If num<0 or base is not in [2,16] the function should return "" (the empty String).
     *
     * @param num  the natural number (include 0).
     * @param base the basis [2,16]
     * @return a String representing a number (in base) equals to num, or an empty String (in case of wrong input).
     */
    public static String int2Number(int num, int base) {
        String ans = "";
        // add your code here
        int n = 0;
        while (num != 0) {
            n = num % base;

            if (n < 10) {

                ans = (char) ('0' + n) + ans;
            } else {

                ans = (char) ('A' + n - 10) + ans;
            }
            num = num / base;

        }
        num = num / base;

       // if (num > 16 || num <= 0 || num == 'A' ||)

            if (base < 10) {

                ans += "b" + base;
            } else {

                ans += "b" + (char) ('A' + base - 10);
            }


        num = num / base;

        return ans;
    }




        /**
         * Checks if the two numbers have the same value.
         * @param n1 first number
         * @param n2 second number
         * @return true iff the two numbers have the same values.
         */
        public static boolean equals(String n1, String n2) {
            boolean ans = true;
            // add your code here
           int equal1 = number2Int(n1);
           int equal2 = number2Int(n2);
            if (equal1 != equal2) {
                ans = false;


            }
           ////////////////////
            return ans;
        }

        /**
         * This static function search for the array index with the largest number (in value).
         * In case there are more than one maximum - returns the first index.
         * Note: you can assume that the array is not null and is not empty, yet it may contain null or none-valid numbers (with value -1).
         * @param arr an array of numbers
         * @return the index in the array in with the largest number (in value).
         *
         */
        public static int maxIndex(String[] arr) {
            int ans = 0;
            int max = number2Int(arr[0]) ;
            // add your code here
            for (int i = 1; i < arr.length; i++){
            if (number2Int(arr[i]) > max) {
                max = number2Int(arr[i])  ;
                ans = i;
            }else max = number2Int(arr[0]) ; {
                    ans = i;
            }
            }
            ////////////////////
            return ans;
        }
       public static int charToint(char t ) {

            if(t >= '0' && t <= '9') {
                return t - '0';
            }

            if(t >= 'A' && t <= 'G') {
                return t - 'A' + 10;
            }

           else
               return -1;
       }








    }