
public class Statement {

    static public void checkNumber(int number) {
        if (number > 0) {
            System.out.println(number + " is Positive");
        } else if (number < 0) {
            System.out.println(number + " is Negative");
        } else {
            System.out.println(number + " is Zero");

        }
    }

    static private double milesPerHour = 1.609;

    static public int toMilesPerHour(double kilometersPerHours) {
        if (kilometersPerHours < 0)
            return -1;
        return (int) Math.round(kilometersPerHours / milesPerHour);
    }

    static public void printConversion(double kilometersPerHours) {
        int result = toMilesPerHour(kilometersPerHours);
        if (result < 0) {
            System.out.println("Invalid value");
        }
        System.out.printf("%-6.2f km/h = %-6d mi/h", kilometersPerHours, result);
    }

    static private int mbToKb = 1024;

    static void printMegaBytesAndKiloBytes(int kilobytes) {
        if (kilobytes < 0) {
            System.out.println("Invalid value");
        }
        int mb = kilobytes / mbToKb;
        int resKb = kilobytes % mbToKb;
        System.out.printf("%-8d KB = %-8d MB and %-8d kb", kilobytes, mb, resKb);
    }

    static public boolean shouldWakeUp(boolean isBarking, int hours) {
        if (!isBarking || hours >= 8 && hours <= 22 || hours < 0)
            return false;
        return isBarking && hours < 8 || hours > 22;
    }

    static public boolean isLeapYear(int year) {
        if (year < 0)
            return false;
        else if (year % 400 == 0)
            return true;
        else if (year % 100 == 0)
            return false;
        else
            return year % 4 == 0;
    }

    static public boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo) {
        int firstRounded = (int) ((numOne * 1000));
        int secondRounded = (int) ((numTwo * 1000));
        return firstRounded == secondRounded;
    }

    static public boolean isPalindrome(int num) {
        int actualNum = num;
        int reverse = 0;
        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
        return actualNum == reverse;
    }

    static public int sumFirstAndLastDigit(int num) {
        if (num < 0)
            return -1;
        int lastDig = num % 10;
        int firstDig = 0;
        while (num != 0) {
            firstDig = num % 10;
            num = num / 10;

        }
        return lastDig + firstDig;

    }

    static public int getEvenDigitSum(int num) {
        if (num < 0)
            return -1;
        int sumEvent = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            if (lastDigit % 2 == 0) {
                sumEvent += lastDigit;
            }
            num = num / 10;
        }
        return sumEvent;
    }

    static public boolean hasSharedDigit(int numOne, int numTwo) {
        if (numOne <= 9 || numTwo <= 9 || numOne >= 100 || numTwo >= 100)
            return false;

        return numOne / 10 == numTwo / 10 || numOne % 10 == numTwo / 10 || numOne / 10 == numTwo % 10
                || numOne % 10 == numTwo % 10;
    }

    static private boolean isValid(int num) {
        return num >= 10 && num <= 1000;
    }

    static public boolean hasSameLastDigit(int numOne, int numTwo, int numThree) {
        if (isValid(numOne) && isValid(numTwo) && isValid(numThree)) {
            return numOne % 10 == numTwo % 10 || numOne % 10 == numThree % 10 || numTwo % 10 == numThree % 10;
        } else
            return false;
    }

    static public void printFactors(int num) {
        if (num < 0)
            System.out.println("Invalid Value");
        for (int n = 1; n <= num; n++) {
            if (num % n == 0) {
                System.out.println(n);
            }
        }
    }

    static public int getGreatestCommonDivisor(int numOne, int numTwo) {
        if (numOne < 10 || numTwo < 10)
            return -1;
        int samlNum = Math.min(numOne, numTwo);
        int fpb = 0;
        for (int n = samlNum; n > 0; n--) {
            if (numOne % n == 0 && numTwo % n == 0) {
                fpb = n;
                break;
            }
        }
        return fpb;

    }

    static public boolean isPerfectNumber(int num) {
        if (num <= 0)
            return false;
        int totalDivision = 0;
        for (int n = 1; n < num; n++) {
            if (num % n == 0) {
                totalDivision += n;
            }
        }
        return totalDivision == num;
    }

    static public int getLargestPrime(int num) {
        if (num < 2)
            return -1;
        if (num == 2)
            return num;

        int largesP = 0;
        for (int n = num; n >= 2; n--) {
            if (num % n == 0) {
                boolean isPrime = true;

                for (int m = 2; m < n; m++) {
                    if (n % m == 0) {
                        isPrime = false;
                    }
                }

                if (isPrime) {
                    largesP = n;
                    break;
                }
            }
        }
        return largesP;

    }

}