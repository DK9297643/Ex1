


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This JUnit class represents a very partial test class for Ex1.
 * Make sure you complete all the needed JUnits
 */
public class Ex1Test {
    @Test
    void computeNumberTest() {
        String s2 = "1011b2";
        int v = Ex1.number2Int(s2);
        assertEquals(v,11);
        String s10 = "1011bA";
        v = Ex1.number2Int(s10);
        s2 = Ex1.int2Number(v,2);
        int v2 = Ex1.number2Int(s2);
        assertEquals(v,v2);
        assertTrue(Ex1.equals(s10,s2));

        String hexNum = "1A3bG"; // Hexadecimal representation
        int decimalValue = Ex1.number2Int(hexNum);
        assertEquals(419, decimalValue);
        String decimalNum = "123bA"; // Decimal representation
        decimalValue = Ex1.number2Int(decimalNum);
        assertEquals(123, decimalValue);
        assertFalse(Ex1.equals(decimalNum,hexNum));
    }

    @Test
    void isBasisNumberTest() {
        String[] good = {"1", "1b2", "01b2", "131123bG" , "123bA", "ABbG", "0bA"};
        for(int i=0;i<good.length;i=i+1) {
            boolean ok = Ex1.isNumber(good[i]);
            assertTrue(ok);
        }
        String[] not_good = {"b2", "2b2", "1G3bG", " BbG", "0bbA","-64564-6b9","","abB", "!@b2", "A", "1bb2"};
        for(int i=0;i<not_good.length;i=i+1) {
            boolean not_ok = Ex1.isNumber(not_good[i]);
            assertFalse(not_ok);
        }
    }
    @Test
    void int2NumberTest() {
        // implement this test
        String result = Ex1.int2Number(255, 2);
        assertEquals("11111111b2", result);

        result = Ex1.int2Number(987654321, 16);
        assertEquals("3ADE68B1bG", result);

        result = Ex1.int2Number(4, 2);
        assertEquals("100b2", result);
    }
    @Test
    void maxIndexTest() {
        // implement this test
        String[] arr3 = {"432b9", "3453b7", "45", "30"};
        assertEquals(3, Ex1.maxIndex(arr3));

    }
    @Test
    void equalsTest() {
       String num1 = "3F2bG";
       String num2 = "1010bA";
       assertTrue(Ex1.equals(num1,num2));

    }







    @Test
    void charToint() {
        assertEquals(10, Ex1.charToint('A'));

        char[] invalidChars = {'H', 'Z', 'a', '!', '@', ' '};
        for (int i=0;i<invalidChars.length;i=i+1) {
            int result = Ex1.charToint(invalidChars[i]);
            assertEquals(-1, result);



    }



}}