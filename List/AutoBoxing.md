# AutoBoxing

## Why does java have primitive data types ?

Some object-oriented languages, don't support any primitive data types at all, meaning everything is an object. But most of the more popular object oriented languages od the day, support both primitive types and Object, as does java. Primitive type generally represent the way data stored on an operating system. Primitive have some advantage over way data is sorted on an operating system. Primitives have some advantages over object, specially as the magnitude, or number of elements increase. Object take up additional memory, and require a bit more processing power. we know we can create object, with primitive data types as filed types, for example, and we can also return primitive types from methods.

But when we look at classes like at the arrayList, or the LinkedList, which we've reviewed in a lot of detail in this section, these class don't support primitive data types, as the collection type. in other words we can't do the following, creating a linkedList, using int primitive type this code won't compile.

```java
LinkedList<int> myIntegers= new LinkedList<>();
```
More importantly, we can't easily use primitives, in some of the features we'll be learning about in the future, like generic. But java, as we know, gives us wrapper classes for each primitive type. and we can go from a primitive to a wrapper, which is called boxing, or wrapper to a primitive, which is called unboxing, with relatives ease in java.

## what is Boxing ? 
a primitive is boxing, or wrapped, in a containing class, whose main data is the primitive value. Each primitive data type has a wrapped class, as shown in the list, which we've seen before. Each wrapper type boxes a specific primitive value. 

## How do we box ?

Each wrapper has static overloaded factory method valueOf(), which takes a primitive, and returns an instance of the wrapper class. 

The code shown on this slide, return an instance f the java.lang.integer class, to the boxedInt variable, we can say this code manually boxes a primitive integer.

```java
Integer boxInt =Integer.valueOf(15);
```
## Deprecated Boxing using the wrapper constructor

another manual way of boxing, which you'll see in older code, is by creating new instance of the wrapper class, using the new keyword, and passing the primitive value to the constructor. we show an example of this here 

```java
Integer boxInt - 15
```

Every wrapper class support a method to return the primitive value it contains this is called unboxing.

in the example on this slide, we've auto boxed the integer value 15, to a variable  called boxedInteger. this gives us an object which is an integer wrapper class, and has valueOf 15.to unboxing this, on an integer class, we can use the inValue method, which returns the boxed value, the primitive int.

## what is auto Boxing ?

```java
Integer boxedInteger= 15;

int unboxedInt= boxedInteger.intValue();
```
This method is called manually unboxing and like boxing, it's unnecessary to manually unbox

## Automatic unboxing

Automatic unboxing is really just referred to as unboxing in most case. we can assign an instance of a wrapper class, directly to a primitive variable. The code on this slide shows an example. We re assigning an object to primitive variable in the second statement.