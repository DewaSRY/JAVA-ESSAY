
abstract class ListItem {

    protected ListItem rightLink = null;
    protected ListItem leftLink = null;
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next();

    abstract ListItem setNext(ListItem item);

    abstract ListItem previous();

    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}

class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    /**
     * will return positive if local value greater then input value
     * 
     * will return negative if local value lest then input value.
     * 
     * will return nol if local value equal then input value.
     */
    @Override
    int compareTo(ListItem item) {
        if (item == null) {
            return -1;
        }
        // will return positive if the this greater then input item
        // will return
        String localValue = super.getValue().toString();
        String inputValue = item.getValue().toString();

        // return ((String) super.getValue().toString()).compareTo((String)
        // item.getValue().toString());
        return localValue.compareTo(inputValue);
    }
}

interface NodeList {
    ListItem getRoot();

    boolean addItem(ListItem item);

    boolean removeItem(ListItem item);

    void traverse(ListItem root);
}

class MyLinkedList implements NodeList {
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (this.root == null) {// there is no root then the item being the root
            this.root = item;
            return true;
        }
        if (this.root.compareTo(item) == 0) // items equals to the root
            return false;
        else if (this.root.compareTo(item) > 0) {// item is lest then root which need put on the front of linked list
            ListItem temp = this.root;
            this.root = item;
            this.root.setNext(temp);

        } else {// item is greater then the root then need to add ont inside the list or in the
                // last list
            ListItem currentNode = this.root;
            while (currentNode != null) {
                if (currentNode.compareTo(item) < 0) {// current item is lest then input item
                    if (currentNode.next() != null) {
                        currentNode = currentNode.next();// current have next item
                    } else {
                        currentNode.setNext(item);// current doesn't have next item
                        item.setPrevious(currentNode);
                        break;
                    }
                } else if (currentNode.compareTo(item) > 0) {// current item is greater then input item
                    ListItem prevNode = currentNode.previous();
                    prevNode.setNext(item);
                    item.setPrevious(prevNode);
                    item.setNext(currentNode); // set teh current item on the next item
                    currentNode.setPrevious(item);// set item input on previous list
                    break;
                } else {
                    return false; // item equal with an item in a list;
                }

            }

        }
        return true;
    }

    @Override
    public boolean removeItem(ListItem item) {

        ListItem currentNode = this.root;
        while (currentNode != null) {
            if (currentNode.compareTo(item) == 0) {
                ListItem prevNodePointer = currentNode.previous();
                ListItem nextPointer = currentNode.next();
                prevNodePointer.setNext(nextPointer);
                nextPointer.setPrevious(prevNodePointer);
                return true;
            } else {
                currentNode = currentNode.next();
            }

        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (this.root == null) {
            System.out.println("linked list is empty");
        } else {
            ListItem l = this.root;
            String s = "";
            while (l != null) {
                s += String.format("(%d)", l.getValue());
                l = l.next();
            }
            System.out.println(s);
        }
    }

}

public class SearchTree implements NodeList {
    private ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    // test
    public void performRemoval(ListItem item, ListItem parent) {
        ListItem currentNode = item;

        // if the delete node have two child
        if (currentNode.next() != null && currentNode.previous() != null) {
            // if the delete node is lest then parent
            if (currentNode.compareTo(parent) < 0) {// right child will replace then delete node
                ListItem RightChild = currentNode.next();

                ListItem leftChild = currentNode.previous();
                RightChild.setPrevious(leftChild);
                parent.setPrevious(RightChild);

            } else {// if the delete node is greater then parent
                ListItem RightChild = currentNode.next();

                ListItem leftChild = currentNode.previous();
                leftChild.setNext(RightChild);
                parent.setNext(leftChild);
            }
        } else if (currentNode.next() != null || currentNode.previous() != null) {

            // if the delete node have one child
            // selecting child
            ListItem childDeleted = null;
            if (currentNode.previous() == null) {
                childDeleted = currentNode.next();
            } else {
                childDeleted = currentNode.previous();
            }
            // are delete node is grater then the parent node
            if (currentNode.compareTo(parent) > 0) {
                parent.setNext(childDeleted);
            } else {
                parent.setPrevious(childDeleted);
            }
        } else {// if the delete node have no child
            // are the delete node is grater then parent
            if (currentNode.compareTo(parent) > 0) {
                parent.setNext(null);
            } else {
                parent.setPrevious(null);
            }
        }
    }

    @Override
    public boolean removeItem(ListItem item) {

        ListItem parent = this.root;
        ListItem deleteNode = null;
        while (parent != null) {
            ListItem leftChild = parent.previous();
            ListItem rightChild = parent.next();
            if (parent.compareTo(item) > 0) {// item lest then parent move to left
                if (leftChild == null)
                    break;
                if (leftChild.compareTo(item) == 0) {

                    deleteNode = leftChild;// find item
                    this.performRemoval(deleteNode, parent);
                    return true;

                } else if (leftChild.compareTo(item) > 0) {
                    break;// item is lest then parent and greater the left, which item is not exist
                } else {
                    parent = leftChild;// item is lest then left, move to left node

                }
            } else {
                if (rightChild == null)
                    break;
                if (rightChild.compareTo(item) == 0) {

                    deleteNode = rightChild;// find item
                    this.performRemoval(deleteNode, parent);
                    return true;

                } else if (rightChild.compareTo(item) < 0) {
                    break;
                } else {

                    parent = rightChild;
                }
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {

        if (root != null) {
            this.traverse(root.previous());
            System.out.printf("(%d)", root.getValue());
            this.traverse(root.next());
        }
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (this.root == null) {
            this.root = item;
            return true;
        }
        ListItem currentNode = this.root;
        while (currentNode != null) {
            if (currentNode.compareTo(item) < 0) {
                if (currentNode.next() == null) {
                    currentNode.setNext(item);
                    return true;
                } else {
                    currentNode = currentNode.next();
                }
            } else if (currentNode.compareTo(item) > 0) {
                if (currentNode.previous() == null) {
                    currentNode.setPrevious(item);
                    return true;
                } else {
                    currentNode = currentNode.previous();
                }
            } else {
                return false;
            }
        }
        return false;
    }
}