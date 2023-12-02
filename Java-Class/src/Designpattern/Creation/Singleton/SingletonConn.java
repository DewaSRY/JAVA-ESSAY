package Designpattern.Creation.Singleton;

public class SingletonConn implements Cloneable {

    // 1- Private Constructor
    private SingletonConn() {
    }

    // 2- Static field containing its only instance
    private static SingletonConn onlyInstance;

    // 3- A static factory method for obtaining the instance
    public static SingletonConn getOnlyInstance() {

        // No previous instance of this class
        if (onlyInstance == null) {
            onlyInstance = new SingletonConn();
        }

        // if there is a previous instance of this class
        return onlyInstance;
    }

    // 4- Preventing the cloning
    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Can't clone the instance");
    }
}
