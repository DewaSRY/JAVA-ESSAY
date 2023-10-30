## Abstract class

- Abstract classes are very similar to interface you can't insatiate either of them both types may contain a mix of methods declared with, or without a method block. 
- With abstract classes, you can declare fields that aren't static and final, instance fields in other words. 
- also with abstract classes, you can use any of the four access modifiers for its concrete methods. 
- you can also use all but private one parent class, but it can implement multiple interfaces. 
- When an abstract class is subclassed, the subclass usually provides implementations for all of the abstract methods in its parent class.
- however, if it doesn't, then the subclass must also be declared abstract.

## Use an Abstract class when..

You want to share code, among several closely related classes (animal for example, with fields, name, age,). You expect classes that extend your abstract class, to have many common methods or fields, or require access modifiers other then public. you want to declare non-static or non-final fields ( for example, name, age ), so this enables you to define  methods, that can access and modify the state of an object (getName, setName). 

you have a requirement for yor base class, to provider a default implementation for certain methods, but other methods should be open to being override by child classes. 

**Summary: An abstract class provides a common definition, as abase class that multiple derived classes can share. 

## Interface 

- An interface is just the declaration of methods, which you want some classes to have it;s not the implementation.
- in an interface, we define what kind of operation an object can perform, These operations are defined by the classes that implementation the interface.
- interface from a contract between the class, and the outside world and this contract is enforced  at build time, by the java complier.
- You can't instantiate Interface, but they may contain a mix of methods declared with or without an implementation. 
- all methods on interface, declared without a method body are automatically public and abstraction
- an interface can extend another interface 
- Interface are more flexible, and can deal with a lot more stress on the design of your program, because they aren't part of the class hierarchy.  
- A best practice way of coding is commonly called Codding to an interface. 
- By Introducing interface ito your program, you're really introducing points of variation, at which you can plug different implementations for that interface
-**summary:The interface decouples that "what", from the "how", and is used to make different types, behave in similar ways"
- Since java 8 , interface can now contains default methods , so in other words methods with implementation. the keywords default is used mostly for backwards compatibility. Public static methods were also introduce in java 8.
-Since java 9, an interface can also contain private methods commonly used when default methods share common code. 

## use an Interface when 
- you expect that unrelated  class will implement your interface, for example, two java's own interface, Comparable and Closeable, can be implemented by unrelated classes.
- you want to specify the hehaviour of a particular data type, but you're not concerned about who implements its hehaviour. 
- you want to separate different behavior.

## Interface are the used in many of java's own features
- i've briefly discussed some interface ,like list and queue, and their implementations, ArrayList and LinkedLIst, these are part of what java calls it's Collection Framework
-Interface are also the basic for many of the feature that are coming up, for example lambda expression, which were introduce in JDK8.
- Another example is java data base connectivity support,, or JD BC, build almost entirely with interface. the concrete implementation of methods, is different for each database vendor, and concerned about the details of the database, you're connected to.

## Interface vs Abstract Class

i've said that interface and abstract classes are both abstracted types, and abstracted types are used as reference type in code. 

|Comparison                                                  | Abstract Class | interface | 
| ---                                                        | ---            | --- | 
| An instance can be created from it                         |   NO             | NO|
| Has a constructor                                          |  YES             |NO|
|Implemented as part of the class Hierarchy. use inheritance |  YES             | NO|
|Records and enum can extends or implement                   |  NO             | YES|
|Inherits fromm java.lang.Object                             |  YES             | NO|
|Can have both abstract methods and concrete methods         |  YES             | YES|
|Abstract methods must include abstract modifier             |  YES             |NO|
|Support default modifier for it;s methods                   |  NO              | YES| 
| Can have instance fields (non-static instance fields)      |  YES             | NO|
|Can have static fields (class fields)                       |  YES             | YES|