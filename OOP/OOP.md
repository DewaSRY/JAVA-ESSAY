# OOP

**Object Oriented Programming** is a way to model real world object, as software object which contain both data and code. 

## Class- based Programming 
Class-based programming start with class, which become the blueprint for object with state as a data and the method as a behavior.

- State or data is a characteristic about the item.
- Behaviors or method is kind of action can effect the state or the character of the object 

A class member can be field , or a method , or some other type of dependent element. if a field is static , there is only one copy in memory , and this value is associated with the class, or template, itself.if a field is not static it's called an instance field and each object may have different value stored for this field . a static method can't dependent on any one object state so it can't reference any instance members in other word any method that operates on instance needs to be non-static.

Class can be organized into logic groups which are called packages. you declare a package name in the class using the package statement. If you don't declare a package, the class implicitly belongs to the default package.

## Access modifier for the class

A class is said to be top-level class, if it defined in the source file and not enclosed in the code block of another class, type or method . A top-level class has only two valid access modifier options: public, or none

| Access key| description |
| ---| ---| 
| public | public means any other class in any package can access this class| 
| none| When the modifier is omit, this has special meaning , called package access which mean the class only for the same package.|

## Access modifier for class members 

An access modifier at the members level alow granular control class members. the valid access modifier are shown in this table from the least restrictive, to the most restrictive. 

| Access key| Description | 
| --- | ---| 
| Public | public means any other class in any package can access this class| 
| protected | Protected allows classes in the same package and any subclasses in other package, to have access to the member.
| none | When the modifier is omit, this has special meaning, called package access meaning the member is accessible only itn the same package.| 
| private | Private means that no other class can access this member|

## Encapsulation 

Encapsulation in object oriented programming usually has two meanings . one os the banding of behavior and attribute on a single object. the other is the practice of hiding fields and some methods, form public access.


## What is null 
 
null is special keyword in java meaning the variable or attributes has a type, but no reference to an object. This means that no instance or object is assigned to the variable or field. **Fields with primitive data types are never null**

## Default value value for fields on classes

Fields on classes are assigned default values, intrinsically by java of not assign explicitly 

| Data type | default value assign | 
| ---| ---| 
byte, short, int, long, char, | 0| 
| double , float, | 0.0|

## What are getters and setters ? why we use them ? 
getter is a method in a class that retrieve the value of private field and return it a setter is a method on a class , that sets the value a private field The purpose of these methods is to control, and protect, access to private fields. 

## this 

**This** is a special keyword in java. What it really refers to is the instance that was created when the object was instantiated. So **this** is a special reference name for the object or instance, which it can use to describe itself. And we can use **this** to access fields on the class.

## Constructor 

A constructor is used in the creation of an object, that's mean an instance of a class. it is a special type of code block that has a specific name an parameters, much like a method it has the same name as type form a constructor, not event void . you can and should specify an appropriate access modifier, to control who should be able to create new instance 

```java
public class Account{ // this is the class declaration 
    public Account(){
        // Constructor code is code to be execute as the object is create
    }
}
```

## The default constructor 
if a class contains no constructor declarations then a default constructor is implicitly declared. this constructor has no parameters, and is often called the no-args constructor. if a class contains any other constructor, them a default is not implicitly declared.

## Constructor overloading 
Constructor overloading is declaring constructors , whit different formal parameters. the numbers of parameters can be different between constructors. 
or if the number of parameters is the same between two constructor, their types or order of the types must differ.