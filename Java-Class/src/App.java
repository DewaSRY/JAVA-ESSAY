public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

interface MyList {

    /**
     * Appends the specified element to the end of this list (optional
     * operation).
     *
     * @param e element to be appended to this list
     */
    void add(Object e);

    /**
     * Removes all of the elements from this list.
     * The list will be empty after this call returns.
     */
    void clear();

    /**
     * Removes the first occurrence of the specified element from this list,
     * if it is present. If this list does not contain
     * the element, it is unchanged.
     *
     * @param o element to be removed from this list, if present
     * @return true if this list contained the specified element
     * @throws NullPointerException if the specified element is null and this
     *                              list does not permit null elements
     */
    boolean remove(Object o);

    /**
     * Returns an array containing all of the elements in this list in proper
     * sequence (from first to last element).
     * 
     * This method acts as bridge between array-based and collection-based
     * APIs.
     *
     * @return an array containing all of the elements in this list in proper
     *         sequence
     */

    Object[] toArray();

    /**
     * Returns the number of elements in this list. If this list contains
     * more than Integer.MAX_VALUE elements, returns
     * Integer.MAX_VALUE.
     *
     * @return the number of elements in this list
     */
    int size();

    /**
     * Returns true if this list contains the specified element.
     * More formally, returns true if and only if this list contains
     * at least one element e such that.
     *
     * @param o element whose presence in this list is to be tested
     * @return true if this list contains the specified element
     * @throws NullPointerException if the specified element is null and this
     *                              list does not permit null elements
     */
    boolean contains(Object o); // returns true if this list contains the specified element.

    /**
     * Returns true if this list contains all of the elements of the
     * specified collection.
     *
     * @param c object that implements MyList to be checked for containment in this
     *          list
     * @return true if this list contains all of the elements of the
     *         specified collection
     * @throws NullPointerException if the specified collection contains one
     *                              or more null elements and this list does not
     *                              permit null
     *                              elements
     */

    boolean containsAll(MyList c); // returns true if this list contains all of the elements of the specified list
}

class DefaultMyList implements MyList {

    private class Node {
        private Object data;
        private Node prevNode;
        private Node nextNode;

        public Node(Object data, Node prevNode, Node nextNode) {
            this.data = data;
            this.prevNode = prevNode;
            this.nextNode = nextNode;

        }

        @Override
        public String toString() {
            return this.data.toString();
        }

    }

    private Node first;

    /**
     * Pointer to last node.
     */
    private Node last;

    /**
     * Total amount of elements in object of MyListImpl.
     */
    private int size;

    @Override
    public void add(Object e) {
        Node tempNode = this.last;
        Node newNode = new Node(e, tempNode, null);
        if (this.first == null) {
            this.first = newNode;
            this.last = this.first;
        } else {
            tempNode.nextNode = newNode;
            this.last = newNode;
        }
        this.size++;

    }

    @Override
    public void clear() {
        for (Node node = this.first; node != null; node = node.nextNode) {
            node.data = null;
            node.nextNode = null;
            node.prevNode = null;
        }
    }

    @Override
    public boolean remove(Object o) {
        Node getNode = this.getNode(o);
        if (getNode == null)
            return false;
        Node prevNode = getNode.prevNode;
        Node nextNode = getNode.nextNode;

        prevNode.nextNode = nextNode;
        nextNode.prevNode = prevNode;

        this.size--;
        return true;

    }

    @Override
    public Object[] toArray() {
        Object[] newArray = new Object[this.size];
        int index = 0;
        for (Node node = this.first; node != null; node = node.nextNode) {
            newArray[index++] = node.data;
        }
        return newArray;
    }

    @Override
    public boolean contains(Object o) {
        return getNode(o) != null;

    }

    @Override
    public boolean containsAll(MyList c) {
        Object[] array = c.toArray();
        for (int i = 0; i < array.length; i++) {
            if (!contains(array[i])) {
                return false;
            }
            ;
        }
        return true;
    }

    @Override
    public int size() {
        return this.size;
    }

    private Node getNode(Object data) {
        for (Node node = this.first; node != null; node = node.nextNode) {
            if (node.data == data) {
                return node;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        if (first == null) {
            return "{}";
        }

        StringBuilder sb = new StringBuilder();
        sb.append('{');

        for (Node x = first; x != null; x = x.nextNode) {
            sb.append('[')
                    .append(x.data);

            if (x.nextNode == null) {
                break;
            }
            sb.append(']')
                    .append(',')
                    .append(' ');
        }

        return sb.append(']')
                .append('}')
                .toString();
    }
}
