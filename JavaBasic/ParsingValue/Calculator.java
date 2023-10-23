package JavaBasic.ParsingValue;

import java.util.Scanner;
public class Calculator {
    public static void run() {
        int sum = 0;
        int numLoop = 0;
        Scanner in = new Scanner(System.in);

        while (true) {
            String numInput = in.nextLine();
            try {
                int number = Integer.parseInt(numInput);
                if (number < 0) {
                    number = number * -1;
                }
                sum += number;
                  numLoop++;
              } catch (NumberFormatException e) {
                  break;
              } 

        }
        in.close();
        int avg = 0;
        if (sum != 0 || numLoop != 0) {
            avg= sum / numLoop ;
        }
        System.out.println("SUM = "+ sum+ " AVG = "+ avg);
    }
}
