package Designpattern.Behavioral.Iterator;

public class DataStructure {
    public static void main(String[] args) {
        myDataStructure ownDS = new myDataStructure();

        for (Iterator iter = ownDS.getIterator(); iter.hasNext();) {
            String nameEmployee = (String) iter.next();
            System.out.println("Employee: " + nameEmployee);
        }
    }
}

class myDataStructure implements Container {
    public String employees[] = { "Jack", "Sara", "Smith" };

    @Override
    public Iterator getIterator() {
        return new ElementIterator();
    }

    private class ElementIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < employees.length) {
                return true;
            }

            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return employees[index++];
            }
            return null;
        }
    }
}

interface Container {

    public Iterator getIterator();
}

interface Iterator {
    boolean hasNext();

    Object next();
}
