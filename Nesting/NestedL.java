

package Nesting;

import java.util.Comparator;

public class NestedL {
    
}


class Employee {
    public static class EmployeeComparator<T extends Employee> implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getName().compareTo(o2.getName());
        }
        
    }
    private int employId;
    private String name;
    private int yearStarted;

    public Employee(int employId, String name, int yearStarted) {
        this.employId = employId;
        this.name = name;
        this.yearStarted = yearStarted;

    }

    public String getName() {
        return this.name;
    }
    @Override
    public String toString() {
        return "%d %-8s %d".formatted(this.employId, this.name, this.yearStarted);
    }

}

class EmployeeComparator<T extends Employee> implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
    
}