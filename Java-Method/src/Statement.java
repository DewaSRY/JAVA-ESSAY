
public class Statement {

    static public void checkNumber(int number) {
        if (number >= 0) {
            System.out.println(number + " is Positive");

        } else if (number < 0) {
            System.out.println(number + " is negative");
        }

    }

    static public double milesPerHour = 1.609;

    static public int toMilesPerHour(double kilometersPerHours) {
        if (kilometersPerHours < 0)
            return -1;
        return (int) (kilometersPerHours / milesPerHour);
    }
}