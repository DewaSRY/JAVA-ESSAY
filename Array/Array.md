# Array

Array is the way we store and manipulate multiple values of same type some place which mean array is data structure.

## declaring an Array

when you declare an array, you first specify the type of the elements you want in the array then you includes square brackets in the declaration, which is the key for java, to identify the variable as an array. teh square brackets can follow the type as shown in the first two examples. this is much more common. the brackets can also be after the variable name , as shown in the last example. you don't specify a size, in the array declaration itself. 

| Array Variable Declaration |
|--- | 
| int[] integerArray;|
| String[] nameList;| 
| String courseList[]|

## Instantiating  an Array

One way to instantiating the array, is with the new keyword, much as we've seen, with most of the classes we 've used to date with teh exception of String. On this slide, we have an array declaration on the left of the equals sign, and then an array creating expression on the right side. For comparison. i'm showing you a typical array variable declaration, and a class instance, or object creating expression using the StringBuilder class

They look pretty similar, but there are two major differences. Square brackets are require when using the new Keyword, and size is specified between them. so in this example , there will be 10 elements in the array.

An array instantiation doesn't have a set of parentheses meaning we can't pass data to a constructor for an array. in fact, using parentheses with an array initiating gives you a compiler error. 

| Invalid array creation- Compile error because of `()`|
| --- | 
| int[] integerArray= new int[10]()|

## An Array is Not resizable 

this size of an array once create is fixed . in this case integerArray will have 10 elements 

| Array Creation |
| --- | 
| int[] integerArray= new int[] | 

you can't change the size of an array, after the array is instantiated. we can't add or delete elements , we can only assign value to one of the then elements in this array, in this example.

## The array initializer 

An array initializer, makes the job of insitatiatiting and initializing a small array, much easier.

| The array initializer | 
| --- | 
| int[] firstFivePositives = new int[] {1,2,3,4,5}; | 

in this example, you can see we still use the new keyword, and have int, with the square brackets. but here we specify the values , we want the array to be initialized to , in a common delimited list , in curly braces. Because these values are specified. the length of the array can be determined, so we don't specify the size in the square brackets. and actual. java provides an event simpler way to do this.

## The array initializer as an anonymous array 

java allows us to drop new int[], from the expression, as show here. this is known as an anonymous array. Here we're showing example for both an int array as well as a string array

| the array initializer | 
| --- | 
| int[] firstFivePositives= { 1,2,3,4,5} | 
| String[] names= {"andy","Bob","bob"}|

An array is a special class in java. it's still a class. there the array, like all other classes, ultimately inherits from java.lang.object. When you don't use an array initializer statement, all array elements get initialized the default value. for that type, for primitive types this is zero for any kind of numeric primitive like int, double or short. for boolean, the default value will be false. and for any class type, the elements will be initialized to null 

## java.util.Arrays

java's array is very basic, it comes with very little built-in functionality. it has a single property or field, named length. and it inherits java.util.Object's functionality. java provides a helper class named java.util.Array, providing common functionality, you'd want for many array operations. these are static methods on Array, so are class methods, not instance methods.

## Print elements in an array using Arrays.toString()

the toString method in this helper class, prints out all the array elements, comma delimited, and contained in square brackets. 

```java
String arrayElementsInAString = Arrays.toString(new Array);
```
the outputs from this method is shown here, conceptually. it prints the element at index 0 first, followed by a comma, then element at index 1 next, comma, and so on util all elements are printed.

```java
    [ e[0], e[1], e[2], e[3], ]
```

## Search Sequentially

you can hopeFully imagine if you were going to start writing code to do this, you might start looping form start to finish, and check each elements, to see it it equals what you're looking for. if you find a match, you'd stop looping, and return that a match was found, either with the position you found the element at, or just a boolean value, true if it found and false if not. this called a linear search or sequential, because you're stepping through the elements , one after another. if your elements are sorted thought, using this type of linear search, is unnecessary inefficient.

## using intervals to Search

You split each section up, testing the values at the boundaries, and based on that, split again into smaller section, narrowing the number of elements to test each time. this type of searching, in software, is called intervale searching. With these two catagories, sequential and interval, there are numerous existing algorithms in each. One of the most common interval search, is the binary search, which is why java provides this search, on so many of it's collection classes. in this search interval are continually split into two.hence the world binary

## Array.binarySearch

the static method, binarySearch, is on the Array class. we can use this method, to test if a value is already in our array, but there are some important things to remember. 

- First, the array has to be **Sorted**
- Second, if there are duplicate values in the array, there's no guarantee which one it'll match on. 
- Finally, elements must be comparable. Trying compare instance of different types, may lead to error and invalid results.

This method returns:
- the position of a match if found. 
- it returns a -1 when no match was found
- it's important to remember, that a positive number may not be the position of the first match
- if you array has duplicate values, and you need to find the first element, or other methods should be used.  