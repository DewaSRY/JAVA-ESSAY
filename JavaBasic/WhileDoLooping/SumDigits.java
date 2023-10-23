package JavaBasic.WhileDoLooping;

public class SumDigits {
    

    public static int run(int number) {
        if (number < 0)
            return -1;
        else {
                int sumDigits = 0;
                while (number != 0) {
                    sumDigits = number % 10 + sumDigits;
                    number = number / 10;
                }
                return sumDigits;
            }
    }
}
