package Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Students {
    public static void run() {
        int studentCount = 10;
        List<LPAStudent> students = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            students.add(new LPAStudent());
        }

       printList(students);

    }
    public static <T extends Student>  void printList(List<T> student) {
        for (var s : student) {
            System.out.println(s.getYearsStarted()+ " :" + s);
        }
        System.out.println("");
    }
}


class Student implements QueryItem {
    private String name;
    private String course;
    private int yearStarted;

    protected static Random random = new Random();

    private static String[] firstNames = {
        "ann",
        "anton",
        "yue",
        "kim",
        "bob",
    };
    private static String[] courses= {
        "c",
        "J",
        "P",
    };

    public Student() {
        int lastNameIdx = random.nextInt(65, 91);
        this.name = firstNames[random.nextInt(5)] + " " + (char) lastNameIdx;
        this.course = courses[random.nextInt(3)];
        this.yearStarted = random.nextInt(2018, 2023);
    }
    @Override 
    public String toString() {
        return "%-15s %-5s %d".formatted(this.name, this.course, this.yearStarted);
    }

    public int getYearsStarted() {
        return this.yearStarted;
    }
    @Override
    public boolean matchFieldValue(String fieldName, String vale) {
        String fName=fieldName.toUpperCase();

        return switch (fName) {
            case "NAME" -> this.name.equalsIgnoreCase(vale);
            case "COURSE" -> this.course.equalsIgnoreCase(vale);
            case "YEARSARTED" -> this.yearStarted == (Integer.parseInt(vale));
            default -> false;

        };
    }
}

class LPAStudent extends Student {
    private double presentComplete;

    public LPAStudent() {
        this.presentComplete = random.nextDouble(0, 100.001);
    }
    @Override 
    public String toString() {
        return "%s %6.1f%%".formatted(super.toString(), this.presentComplete);
    }

    public double getPresentComplete() {
        return this.presentComplete;
    }
}
interface QueryItem {
    public boolean matchFieldValue(String fieldName, String vale);
}

class QueryList<T extends QueryItem> {
    
    private List<T> items;

    public QueryList(List<T> items) {
        this.items = items;
    }

    public List<T> getMatches(String field, String value) {
        List<T> matches = new ArrayList<>();
        for (var item : items) {
            if (item.matchFieldValue(field, value)) {
                matches.add(item);
            }
        }
        return matches;
    }
 
}