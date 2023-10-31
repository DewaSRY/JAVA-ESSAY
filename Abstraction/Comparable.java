package Abstraction;

public class Comparable {
    public static void run() {
        Integer five = 5;
        Integer[] other= {
            0,5,10,-50,50
        };
        for (Integer i : other) {
            int val = five.compareTo(i);
            System.out.printf("%d %s %d: compareTo=%d%n", five, (val == 0 ? "==" : (val < 0) ? "<" : ">"),i,val);
        }
    }
}
