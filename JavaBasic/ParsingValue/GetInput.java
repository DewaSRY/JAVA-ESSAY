package JavaBasic.ParsingValue;

import java.util.Scanner;


public class GetInput {

    public static void run() {
        getInputFromConsole();
        getInputFromScanner();
    }

    private static void getInputFromConsole() {
        String name = System.console().readLine("Hi What is your name ? ");
        System.out.println(name);
    }

    private static void getInputFromScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, whats your name ?");
        String name = scanner.nextLine();

        System.out.println("What year you born");
        String dateOfBirth = scanner.nextLine();
        int age =2023- Integer.parseInt(dateOfBirth);

        scanner.close();
        System.out.println("Hallo "+ name+ " you are " + age+ " years old");
    }
}

