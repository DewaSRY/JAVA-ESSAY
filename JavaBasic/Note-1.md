# Java's Code Units

Writing code is similar to writing a document. It consists of special hierarchical units, which together form a whole.
These are:
The **Expression** – An expression computes to a single value.
The **Statement** – Statements are stand alone units of work.
And **Code Blocks** – A code block is a set of zero, one, or more statements, usually grouped together in some way to achieve a single goal.

## Whitespace

What is whitespace?
- Whitespace is any extra spacing, horizontally or vertically, placed around Java source code.
- It's usually added for human readability purposes.
- In Java, all these extra spaces are ignored.

```java
//SO java treats code like this;
int anotherVariable = 50;myVariable--; System.out.println("myVariable  ="+myVariable);

//The sam as cde like this;
int anotherVariable = 50;
myVariable--; 
System.out.println("myVariable  ="+myVariable);
```

> Code conventions for whitespace do exist, which you can refer to for more detail.
> The Google Java Style Guide which was seen previously in this course, has a section 
> on whitespace, so refer to that for more information, and the link to that is again 
> in the resources section of this video.

## Control FLow 

```java
//If Then Structure ;

if (condition){
    //code in block will execute only if condition is true
    //Block can contain 1 ao many statements
}

//if with an else block

if (condition){
    //code in block will execute only if condition is true
    //Block can contain 1 ao many statements
}else{
    //Code in block will execute nly if condition is false
}

//if with else if and else block

if (condition){
    //code in block will execute only if condition is true
    //Block can contain 1 ao many statements
} else if( secondCondition){
    //Code in block will execute if first Condition is false and 
    //secondCondition is true
}
else{
    //Code in block will execute nly if condition is false
}

```

## the Method 

Java's description of the method is:
A method declares executable code that can be invoked, passing a fixed number of values as arguments.

A method is a way of reducing code duplication.
A method can be executed many times with potentially different results, by passing data to the method in the form of arguments.

One of the simplest ways to declare a method is shown on this slide.   
This method has a name, but takes no data in, and returns no data from the method (which is what the special word void means in this declaration).

```java
public static void methodName(){
    //Method statements form the method body
}
```

To execute a method, we can write a statement in code, which we say is calling, or invoking, the method.
For a simple method like calculateScore, we just use the name of the method, where we want it to be executed, followed by parentheses, and a semi-colon to complete the statement.
So for this example, the calling statement would look like the code shown here:

```java 
calculateScore();
```

Where we previously had empty parentheses after the method name, we now have method parameters in the declaration.

```java
public static void methodName(p1type p1,p2type p2,{more} ){
    //Method statements from the method body
}
```

Parameters and arguments are terms that are often used interchangeably by developers.
But technically, a parameter is the definition as shown in the method declaration, and the argument will be the value that's passed to the method when we call it.


To execute a method that's defined with parameters, you have to pass variables, values, or expressions that match the type, order and number of the parameters declared.
In the calculateScore example, we declared the method with four parameters, the first a boolean, and the other three of int data types.
So we have to pass first a boolean, and then 3 int values as shown in this statement:

```java
calculateScore(true, 800, 5, 100);
```

We can't pass the boolean type in any place, other than as the first argument, without an error. 

## Method structure with parameters and return type

```java
//Method return type is a declared data type for the data that 
//will be returned from the method

public static dataType methodName(p1type p1,p2type p2,{more}){

    //Method statements
    return value;
}
```
So, similar to declaring a variable with a type, we can declare a method to have a type.
This declared type is placed just before the method name.
In addition, a return statement is required in the code block, as shown on the slide, which returns the result from the method.

>So, what's a return statement?
>Java states that a return statement returns control to the invoker of a method.
>The most common usage of the return statement, is to return a value back from a method.
>In a method that doesn't return anything, in other words a method declared with void as the return type, a return statement is not required.
>But in methods that do return data, a return statement with a value is required.

## Method Overloading

Method overloading occurs when a class has multiple methods, with the same name, but the methods are declared with different parameters.
So you can execute a method with one name, but call it with different arguments.
Java can resolve which method it needs to execute, based on the arguments being passed, when the method is invoked.

## More on Method Signatures

A method signature consists of the name of the method, and the uniqueness of the declaration of its parameters.
In other words, a signature is unique, not just by the method name, but in combination with the number of parameters, their types, and the order in which they are declared.
A method's return type is not part of the signature.
A parameter name is also not part of the signature.

The type, order, and number of parameters, in conjunction with the name, make a method signature unique.
A unique method signature is the key for the Java compiler, to determine if a method is overloaded correctly.
The name of the parameter is not part of the signature, and therefore it doesn't matter, from Java's point of view, what we call our parameters.

This slide demonstrates some valid overloaded methods, for the doSomething method.

```java
public static void doSomething(int parameterA){
    //method body
}
public static void doSomething(int parameterA, boolean parameterB){
    //method body
}
public static void doSomething(double parameterA){
    //method body
}
```
