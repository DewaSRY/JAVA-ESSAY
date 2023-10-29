package Array;

import java.util.Scanner;

public class Minimum {
    

   public static void run() {
      System.out.println(FindMinInt.run(IntegersReader.readIntegers()));
        
    }
} 




class IntegersReader {

    public static int[] readIntegers() {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }
        sc.close();
        return values;
    }
}
class FindMinInt {

    public static int run(int[] numbers) {
        
        int min=Integer.MAX_VALUE;
        for (int num : numbers){
            if( num < min){
                min= num;
            }
        }
        return min;
    }
    

    
}