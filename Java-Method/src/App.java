
public class App {

    public static void main(String[] args) throws Exception {

        printSquareStar(90);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        int lDiag = 1;
        int rDiag = number;

        for (int row = 1; row <= number; row++) {

            for (int col = 1; col <= number; col++) {

                if (row == 1 || row == number) {
                    System.out.print("*");
                } else {
                    if (col == 1 || col == number) {
                        System.out.print("*");
                    } else if (col == lDiag || col == rDiag) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
            lDiag++;
            rDiag--;
        }
    }
}
