# Generics

Java supports generic types, suc as classes, records and interface.

## Declaring a class vs. declaring a generic Class

on this, i,m showing you a regular class declaration, next to generic class. the thing to notice generic class, is that the class declaration has angle brackets with a T in them, directly after the class name. T is placeholder for a typ that will be specified later. This is called a type identifier, and it can be any letter or word, but which is short for Type is commonly used.

```java
// Generic class
class YouTellMe<T>{
    private T field
}
```

For the generic class, the field's type is that placeholder,just T, and this means it can be any type at all. The T in the angel brackets means it's the same type as the T, specified as the type the field

## Using a generic class as a reference type

on this slide, i have a variable declaration of the generic ArrayList. In the declaration of a reference type that uses generics, the type parameter is declaring in ange brackets. The reference type is ArrayList, the type parameter( or parameterized type) is String which is declared in angle brackets and listOffString in the variable name. 

## generic Type Parameters
i've already shown you that one way to declare a generic class, is to includes a type parameter which i shown here,in the angle brackets

```java
public class Team<T>{

}
```

Now, using T is just a convention, short for whatever type you want to use this team class for. But you can put anything you want in there. Single letter are the convention however, and they're lot easier to spot in the class code, so let me encourage you to stick to this convention. 

## generic type parameters
you can have more then ne type parameter, so we could do T1,T2, T3,

```java
public class Team<T1,T2, T3>{

}
```

but again convention says, that instead of using type parameters like this, it's easier to read the code with alternative letter selections. And these are usually S, U and V in the order if we had three types, we'd probably want to declare this class as shown here, with T, S and U

```java
public class Team<T,S, U>{

}
```

## generic type Parameters
a few letters are reserved for special use cases. the most commonly used type parameter identifiers are:
- E for Element (used extensively by the java Collections Frameworks).
- K for Key ( used for mapped types).
- N for number
- T for Typed.
- V for Value
- S, U, V, etc for 2nd, 3rd, 4thc types.

## Raw usage of generic classes.

when you use generic class, either referencing them or instantiating them, it's definitely recommendation that you include a type parameter. But you can still use them without specifying one. This is called the Raw Use of the reference type. The raw use of these classes is still available, for backwards compatibility, but it's discouraged for several reasons.
- Generic allow the compiler to do compile-time type checking, when adding and processing elements it the list.
- Generics simplify code, because we don't have to do our own type checking and casting, as we would if the type of our elements was Object

## Generic class can be bounded, limiting the types that can use it.
On this slide, i'm showing the code from my class.This extends keywords doesn't have the same meaning as extends, when it's used in a class declaration. This isn't saying our type **<T extends Players>**, although it could. This is saying the parameterized type T, has to be a Player or a subType of Players. now Player in this case could have been either a class or an interface, this syntax would be the same. this declaration establish what is called an upper bound, on the types that are allowed to be used with this class

```java
public class Team<T extends Players>{

}
```
## Why specify an upper bound 

an upper bound permits access to the bound type's functionality. An upper bound limits the kind of type parameters you can use when using a generic class. the Type use must be equal to , or subtype of the bounded type.

## What's left to know about Generics?

in the next few Videos, i want to cover the following topics. 
- using generic references that use type arguments, declaring in methods parameters and local variables
- Creating generic methods, apart from generic classes.
- Using wildcards in the type argument. 
- Understanding static methods with generic types.
- Using multiple upper bounds.

## This isn't inheritance 

we know LPAStudent inheritance from Student, and we can pass an instance of LPA student to any methods, or assign it to a reference of the list type. why can't we pass an ArrayList of LPA Student, to the methods parameter that's declared as a List of Student?

## This isn't inheritance 

Surely, if an LPAStudent is a Student, a List of LPAStudent is ultimately a List of Student. it's very natural to assume that a method that takes a List with Students should accept a List with LPAStudent is a Student after all. But that's not know how it's works. when used as reference type, a container of one type has no relationship to the same container of another type, event if the contained type do have a relationship.

## Limitation of referencing of generic class with a list argument

when we declare a variable or methods parameter with :

- List<Student>

only List subtypes with Student element can be assign to this variable or methods argument. we can't assign a list of Student subtypes to this!

## the Generic methods

For a method, type parameter are placed after any modifiers and before that method's return type. the type parameter can be referenced in method parameters, or as the method return type, or in the methods code block, much as we saw a class's type parameter can be used. A generic method can be used for collection with type arguments as we just saw, to allow for variability of the elements in the collection, without using a raw version of the collection.

```java
public <T> String myMethod(T input){
    return input.toString()
}
```

A generic method can be used for static methods on a generic class, because static methods can't  use class type parameters. A generic method can used on non-generic class, to enforce type rules on a specific methods. The generic method type parameter is separate from a generic class type parameter. in fact, if you've used T for both, the T declared on the method means a different type, then the T for the class.

## Type Parameters, Type Arguments and using a Wildcard

A type parameter is a generic class, or generic method's declaration of the type. in both of these example, T is said to be type parameter. you can bind a type parameter with the use of the extends keyword, to specify an upper bound 

```java
//Generic class
public class Team<T>{

}
//Generic method
public <T> vid doSomething(T t){

}
```
## Type Parameter, type Arguments  ans using a Wildcard

A type argument declares the type to be used, and is specific in a type reference, such as a local variable reference, method parameter declaration, or filed declaration.in this example, BaseBallPlayer is the argument for the Team class.

```java
Team<BaseBallPlayer> team= new Team<>()
```

## type Parameter, type Arguments and using a **Wildcard**

A willCard can only be used in a type argument, not in the type parameter declaration. A wilCard is represented with the **?** character. A willCard means the type is **unknown**. For this reason, a willCard limits what you can do, when you specify a type this way.

```java
//list declaration using wildCard
List<?> unknownList;
```

## type Parameters, Type Arguments and using a Wildcard

A will card can't used an instance of generic class. the code shown here is invalid 

```java
//invalid! You can't use a Wildcard in an instance expression 
var myList = new ArrayList<?>();
```

## Type Parameters, type Arguments and using a Wildcard

a Wildcard can be unbounded, or alternately, specify either upper bound or lower bound. You can't specify both an upper bound and a lower bound, in the same declaration.

| Argument | Example | description |
| --- | --- | --- |
| unbounded| List<?>| A List any type can be passed or assigned of to a list using this Wildcard|
| upper bound| List<? extends Student>|A list containing any type that is a Student or a subType of Student can be assigned or passed to an argument specifying this Wildcard|
| lower bound | List<? super LPAStudent>| A list containing any type that is an LPAStudent or a **super type** of LPAStudent, so in our case, that would be Student And Object.|

## Type Erasure 

Generic exit to enforce tighter checks, at compile time. The compiler transforms a generic class into a typed class, meaning the code, or class file, contains no typ parameters.EveryWhere a type parameters is used in a class, it gets replaced with wither the type Object, if no upper bound was specified, or the upper bound type itself. This transformation process is called type erasure, because the T parameter ( or S, U, V), is erased, or replace with a true type. Why is this important? Understanding how type erasure works for overloaded methods, my be important.

## Using Multiple types to declare an Upper Bound

you can use multiple type to set a more restrictive upper bound, with the use of an apprehend between types. The conditions require a type argument, to implement all interface declared, and to be a subType of any class specified. You can extend only one class at most, and zero to many interfaces. You use extends for either a class or an interfaces. you use extends for either a class or an interface or both. if you do extend a class as well as an interface or two the class must be first type listed

## declaring a Class vs Declaring a generic Class

on this slide, i'm showing you regular class declaring, next to generic class. The thing to notice with the generic class, is that the class declaring has angle brackets with a T in them, directly after the class name. T is the placeholder for a type that will be specified later. this is called a type identifier,and it can be any be any letter or word, but T witch is short for Type is commonly used 

```java
//regular class
class ITellYou{
    private String field;
}
```

```java
//Generic class
class youTellMe<T>{
    private T field;
}
```

## Declaring a Class VS Declaring a generic Class

For the generic class, the Filed's type is that placeholder, just T, and this means it can be any type at all. the T the angel brackets means it's the same type as the T, specified as type of the field. On this slide, I have a variable declaring of the generic ArrayList. in the declaring of a reference type that uses generics, the type parameter is declaring in angle brackets. the reference type is ArrayList, the type parameter ( or parameterized ) is String, which is declaring in angle brackets, and ListOfString is the variable name. Many of java libraries are write using generic class and interface, so we'll be using them a lot moving forward. But it's still good idea to learn to write tou write your own generic class, to help you understand the concept.
