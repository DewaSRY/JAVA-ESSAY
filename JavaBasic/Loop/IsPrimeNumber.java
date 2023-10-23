package JavaBasic.Loop;

public class IsPrimeNumber {
    
    public static void run(int start, int end) {
      
        if (start < 0 || start > end || end < 0) {
            System.out.println("Please insert valid number");
        } else {
              System.out.println("hallo world"+ start + end);
            for(int num = start ; num <= end ; num++){
                if (isPrime(num)) {
                    System.out.println(num + " is prima");
                }
            }
        }
    }
    
    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
