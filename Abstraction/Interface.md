# Interface vs Abstract class

we saw that an abstract class required its subclasses to implement its abstract methods. An interface is similar to an abstract class, although in isn;t a class at all. it's a special type, that's more like a contract between the class and client code, that compiler enforces. by declaring it's using an interface, your class must implement all the abstract methods, on the interface. A class agrees to this, because it wants to be know by that type, by the outside world, or the client code. an interface lets classes that might have little else in common, be recognized as a special reference type.

## declaring an interface 

Declaring an interface is similar to declaring a class, using the keywords interface, where tou would use class. on this slide , i'm declaring a public interface named FlightEnabled. 

```java
public interface FlightEnabled{}
```
an interface is usually named, according to the set of behavior it describes. Many interface sill end in able like Comparable and iterable, again meaning something is capable, or can do , a giving of behaviors.

A class is associated to an interface , by using the implements clause in the class declaration. in this example, the class Bird implement FlightEnabled interface

```java
public class Bird implements FlightEnabled{

}
```

## A class can extends and implement s in same declaration 

A class can only extends a single class, which is why java is called single inheritance. But a class can implement many interface. this gives us plug and play functionality, which is what makes them so powerful.
A class can both extend another class, and implement one or more interface.

```java
package dev.lpa

public class Bird extends Animal implements FlightEnabled, Trackable {

}
```
in this example, the Bird class extend, or inherits from animal , but it's implementing both a FlightEnabled and Trackable interface.
we can describe Bird by what it is , and what it does.

## the abstract modifier is implied on an interface
we don't have to declare the interface type abstract, because this modifier is implicitly declared, for all interface. Like wise, we don't have to declare any method abstract. in fact, any method declared without a body, is really implicitly declared both public and abstract. the three declarations shown on this slide, result in the same thing under the cover

# all members on an interface are implicitly public 
if we omit an access modifier on a class member, its implicitly package private. if we omit access modifier on an interface member, it's implicitly public. This is an important difference, and one you need to remembers. Changing the access modifier of a method to protected, on an interface, is a compiler error, whether the method is concrete or abstract. on;y a concrete method can have private access

before JDL 8, the interface type could only have public abstract methods. JDK 8 introduce default method and public static methods, and JDK 9 introduce private methods, Both static and non-static. ALl of these new methods types( on interface ) are concrete methods.

An extension methods is identified by the modifier default, so more commonly known as the default methods
This method is connate method meaning it has a code block , and we can add statement to it.in fetch it has to have a method body, event just an empty set of curly brackets. it's a lot like a method on supper class, because we can override it. adding a default method doesn't break any classes currently implementing the interface. 
So like overriding a method on a class, you have three choices, when you override a default method on an interface. 

- You can choose not to override it at all.
- you can override the method and write code for it, so that the interface method isn'y executed 
- Or you can write your own code, and invoke the method on the interface, as part of your implementation.