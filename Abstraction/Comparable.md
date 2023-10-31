# Comparable 

## interface used for sorting 

Now that i've covered interface and generic class, i want to review in more detail, interface mentioned in previous lectures. that first is Comparable. 
For an array, ewe can simply call Arrays.sort, and pass it an array but as i have previously mentioned, the elements in the array, need to implement Comparable. types like String, or primitive wrapper classes like Integer or Character are sortable, and this is because they do implement this interface.

## Comparable interface

the interface declaration in java

```java
public interface Comparable<T>{
    int compereTo(T o)
}
```

it's a generic type, meaning it's parameterized. Any class that implements this interface, needs to implements the compare To method.

## Comparable  interface

this method takes one objects an argument, shown on this slide as the letter o, and compares it to the current instance, shown as this. the table on this slides shows what the result of the compare To methods mean, when implemented 

| result value   | Meaning  |
| ZERO           | 0 == this| 
| negative       | this< 0  | 
| positive value | this > 0 |

# The Comparator interface
the Comparator interface is similar to the comparable interface, and the two can often be confused with each other. it's declaration and primary abstract method are shown here, in comparison to Comparable. you'll notice that the method names are different, compare vs. compare To .

```java
//Comparator
public interface Comparator<T>{
    int compare(T o1, T o2);
}
//Comparable
public interface Comparable<T>{
    int compare(T o);
}
```
the compare method takes two arguments vs one for compare To, meaning that it will compare the two arguments to one another and not one object to the instance itself. we'll review Comparator in code, but in a slightly manufactured way it's common practice to include a Comparator as a nested class.

## Summary of Differences

### Comparable 

```java
int compareTo( T o);
```
Compares the argument with the current instance. Called from the instance of the class that implements Comparable. best practice is to have this.compareTo(o) == 0 result in this.equals(o) being true. Arrays.sort(T[] elements) requires T to Implements Comparable.
