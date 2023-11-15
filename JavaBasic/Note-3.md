# Parsing Value 



## Reading from the console



| technique| Description| 
| ---| ---|
| System.in| Like `System.out`, java provides System.in which can read input from the console or terminal. it's not easy to user for beginners and lots, and lost of code has been build around it, to make it easier.|
| System.Console| This's java Solution for easier support for reading a single line Prompting user for information. Although this is easy to use , it doesn't work with I.D.E's because these environment disable it.|
| Command Line Arguments | This is calling the java program and specifying data in the call. this is very commonly used but doesn't let us create an interactive application in a loop in java|
| Scanner | the Scanner class was built to be a common way to read input, either using System.in a file. for beginners it's much easier to understand then te bare bones System.in|

## exception ?

An exception is an error that happens in code. Some types of errors can be predicted and named
An exception is caught, first by creating a code block around the code, that might get the error.
This is done with the try statement code block.

```java
    try{

    } catch(Exception e){

    } finally{

    }
```

## The Scanner class

The Scanner class is described as a simple text scanner, which can parse primitive types and strings.
To use the Scanner class, we have to create an instance of Scanner. 
You'll remember, this means we're creating an object of type Scanner.
We'll use the key word, new, to do it.

### new keyword

The new keyword is used in what Java calls, a Class Instance Creation Expression.
In its simplest form, it's the word new, followed by the class name, and empty parentheses.

```java
//
ClassName variableName= new ClassName();
//
ClassName variableName= new ClassName( argumentOne, argumentTwo);
```
And we saw that we could do this with the String class, passing the text in the parentheses.

### Instantiating Scanner

For reading input from the console or terminal, we instantiate a scanner object using new, followed by the Scanner class name, and passing in System.in, in the parentheses.

```java
Scanner sc = new Scanner(System.in);
```

For reading input from a file, we instantiate a scanner object using new, again with the Scanner class name, but pass in a File object, in the parentheses. 
File is another class provided by Java, for reading and writing files.

```java
Scanner sc = new  Scanner(new File("nameOfFileOnFileSystem));
```

### import statement

We haven't talked about the import statement yet, but this statement lets us use classes from other people's code. 
In this case, Java provides a library of code, which includes the Scanner class, in a library called java.util.

```java
import java.util.Scanner;
```

