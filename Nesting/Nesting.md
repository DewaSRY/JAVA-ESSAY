# nesting class ( or types ) within another class ( or type)

A class can contain other types within the class body, such as other classes, interface, enums, and records. These are called nested types, or nested classes. YOu might want to use nested classes when your classes are tightly coupled, meaning their functionality is interwoven.

## Nested Class

the four different types of nested classes you can use in java are: the static nested class, the inner class, and the local and anonymous classes.

| Type| description | 
| --- | --- | 
| static nested class| Declared in class body, much like a static field access to this class is through the class name identifier|
| instance or inner class| declaring in class body. this type of class can only be accessed through an instance of the other class|
|local class | declared within a method body.|
|anonymous class| unnamed class, declared and instantiated in same statement| 

## Inner class

inner classes are non-static class, declared in an enclosing class, at the member level. inner classes can have any of the four valid access modifiers. An inner class has access to instance  members, including private members, of the enclosing class. instantiating an inner class from external code, is a bit tricky, and ;'ll cover that shortly. 

To create an instance of an inner class, you first must have an instance of the Enclosing class. From that instance you call. new followed by the inner class name and parentheses, taking any constructor arguments. This definitely looks strange the first time you see it.

```java
EnclosingClass otherClass = new EnclosingClass();
EnclosingClass.InnerClass InnerClass =otherClass.new InnerClass();
```

## Local Class

Local classes are inner classes, but declared directly in a code block, usually a method body. because of that, they don't have access modifiers, and are only accessible to that method body while it's executing. Like an inner class, they have access to all fields and methods on the enclosing class. they can also access local variables and method arguments, and are only accessible to the method body while it's executing. Like an inner class, they have access to all fields and methods an the enclosing class. They can also access local variable and method arguments, that are final or effectively final.

## Local Class's Capture Variables

When you create an instance of a local class, reference variables used in the class, from enclosing code, are captured. this means a copy is made of them, and the copy is stored with the instance. this is done because the instance is stored in a different memory area, than the local variables in the method. For this reason, of a local class uses local variables, or method arguments, from the enclosing code, these must be final or effectively final. 

## Final Variable and Effective 

The code sample on this slide shows:

- A method parameter, called methodArgument in the do this method, declared as final.
- And a local variable, in the method block, Field30, also declared with the key word final.

in both these case, this means you can't assign a different value, once these are initialized.

```java
class ShowFinal{
    private void doThis(final int methodArgument){
        final int Field30= 30;
    }
}
```
These are explicitly final, and any of these could be used in local class, because of this. in additional to explicitly final variables, you can also use **effectively final** variable in your local class. A local variable or a method argument are effectively final, if a value is assigned to them, and then never charged after that. effectively final variable can be used in a local class. As of JDK, you can also create a local record, interface and enum type, in your method block. These are all implicitly static types, and therefore aren't inner class, or types, but static nested types. The record was introduced in JDK16. Prior to that release, there was no support for a local interface or enum in a method block either.