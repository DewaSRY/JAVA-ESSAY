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