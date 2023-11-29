
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Utils.SystemOut;

class StatementTest extends SystemOut {

    @Test
    void testCheckNumberForPositive() {
        Statement.checkNumber(1);
        assertEquals(1 + " is Positive", getSysLog());

    }

    @Test
    void testCheckNumberForNegative() {
        Statement.checkNumber(-1);
        assertEquals("-1 is Negative", getSysLog());

    }

    @Test
    void testCheckNumberForZero() {
        Statement.checkNumber(0);
        assertEquals("0 is Zero", getSysLog());

    }

    @Test
    void testToMilesPerHourOne() {
        double input = 1.5;
        int actual = Statement.toMilesPerHour(input);
        long expectedOutput = 1;
        assertEquals(expectedOutput, actual);
    }

    @Test
    void testToMilesPerHourTwo() {
        double input = 10.255;
        int expectedOutput = 6;
        int actual = Statement.toMilesPerHour(input);
        assertEquals(expectedOutput, actual);
    }

    @Test
    void convertKMToMi() {
        double input = 10.255;
        int expectedOutput = 6;
        String expectedMassage = "%-6.2f km/h = %-6d mi/h".formatted(input, expectedOutput);
        Statement.printConversion(input);
        assertEquals(expectedMassage, getSysLog());
    }

    @Test
    void printKbToMBOne() {
        int input = 2500;
        int mb = 2;
        int restKB = 452;
        String expectedMassage = "%-8d KB = %-8d MB and %-8d kb".formatted(input, mb, restKB);
        Statement.printMegaBytesAndKiloBytes(input);
        assertEquals(expectedMassage, getSysLog());
    }

    @Test
    void shouldWokUpOne() {
        boolean isBarking = true;
        int hours = 1;
        boolean actual = Statement.shouldWakeUp(isBarking, hours);
        boolean expected = true;
        assertEquals(actual, expected);
    }

    @Test
    void leapYearTest() {
        int year = 2000;
        boolean expect = true;
        boolean actual = Statement.isLeapYear(year);
        assertEquals(expect, actual);
    }

    @Test
    void areEqualThreeDecimal() {
        double firstNum = -3.1756;
        double secondNum = -3.175;
        boolean actual = Statement.areEqualByThreeDecimalPlaces(firstNum, secondNum);
        boolean expected = true;
        assertEquals(expected, actual);

    }

    @Test
    void palindromeCheck() {
        int input = 123454321;
        boolean actual = Statement.isPalindrome(input);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void sumFirstAndLastDigitCheck() {
        int input = 121;
        int actual = Statement.sumFirstAndLastDigit(input);
        int expected = 2;
        assertEquals(expected, actual);

    }

    @Test
    void sumEventDigitSumCheck() {
        int input = 123456789;
        int actual = Statement.getEvenDigitSum(input);
        int expect = 20;
        assertEquals(expect, actual);
    }

    @Test
    void hasSharedDigitCheck() {
        int inputOne = 12, inputTwo = 23;
        boolean actual = Statement.hasSharedDigit(inputOne, inputTwo),
                expected = true;
        assertEquals(expected, actual);

    }

    @Test
    void hasSameLastDigitCheck() {
        int numOne = 41, numSecond = 22, numThree = 71;
        boolean actual = Statement.hasSameLastDigit(numOne, numSecond, numThree), expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void fpbCheck() {
        int numOne = 12, numTwo = 30;
        int actual = Statement.getGreatestCommonDivisor(numOne, numTwo), expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void isPerfectNumberCheck() {
        int input = 28;
        boolean actual = Statement.isPerfectNumber(input), expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void getLargestPrimaCheck() {
        int input = 217;
        int actual = Statement.getLargestPrime(input), expected = 31;
        assertEquals(actual, expected);

    }
}
