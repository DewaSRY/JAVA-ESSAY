package List;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class ConsoleProgram {
    public static void run() {

    }
}


class Programs {
    private static Scanner sc = new Scanner(System.in);

    public static void run() {
        boolean flag = true;
        ArrayList<String> grocery = new ArrayList<String>();
        while (flag) {
            printAction();
            switch (Integer.parseInt(sc.nextLine())) {
                case 1 -> addItems(grocery);
                case 2 -> removeItems(grocery);
                default -> flag = false;
            }
            grocery.sort(Comparator.naturalOrder());
            System.out.print(grocery);
        }
    }

    private static void addItems(ArrayList<String> grocery) {
        System.out.println("Add item (comma decimeter list)");
        String[] items = sc.nextLine().split(",");
        grocery.addAll(List.of(items));
        for (String i : items) {
            String it = i.trim();
            if (grocery.indexOf(it) < 0) {
                grocery.add(it);
            }
        }
    }
    private static void removeItems(ArrayList<String> grocery) {
        System.out.println("Add item (comma decimeter list)");
        String[] items = sc.nextLine().split(",");
        grocery.addAll(List.of(items));
        for (String i : items) {
            String it = i.trim();
                grocery.remove(it);
        }
    }

    private static void printAction() {
        String textBlock = """
                Available Actions:
                0- to shotDown
                
                1 -to add items to list (comma decimeter list)

                2 - to remove any items (comma decimeter list)

                Enter a number for which action you want to do:""";
        System.out.print(textBlock + "");
    }
}
