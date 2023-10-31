# The Lambda Expression

the syntax of this Lambda expression in on the left bellow. this was passed directly as a method argument, for a parameter type that was a comparator. this was passed directly as a method argument, for a parameter type that was a Comparator. The Comparator's abstract method, compare, is shown here on the right side.

```java
//The generated Lambda Expression;
(o1, o2)-> o1.lastName().compareTo(o2.lastName());

//Comparator's Abstract Method;
int compare( T o1, To2);
```
The Lambda expression parameters are determined by the associated interface's method, the functional method. in tha case of a Comparator, and it's compare method, there are two arguments. This is why we get o1, and o2, in parentheses in the generated lambda expression. These arguments can be used in the expression, which is on the right of the arrow token.

## The Syntax of a lambda Expression

A lambda expression consists of a formal parameter list, usually but not always declared in parentheses; the arrow token; and either an expression or a code block after the arrow token. Because lambda expressions are usually simple expressions, it's more common to see them written as shown on this slide.

```java
(parameter1, parameter2, ...)-> expression;
```

The expression should return a value, it the associated interface's method returns a value.In the cas eof our generated expression, it return an int which is the result of the compare methods on  Comparator.

## Comparing the anonymous class and the Lambda Expression? its obvious in the anonymous  class, because we override the compare method, and return the result of the expression. 

```java
//Anonymous Class
new Comparator<Person>(){
    @Override
    public int compare(Person o1, Person o2 ){
        return o1.lastName().compareTo(o2.lastName());
    }
}
//Lambda Expression
(o1,o2)-> o1.lastName().compareTo(o2.lastName());
```
## Comparing the anonymous class and the lambda expression

We can see the two parameters and their types, and what the return value should be in the anonymous class. But the lambda expression has no reference to an enclosing method, as far as we can see from this code.

## How can java infer the method ?

java takes it's clue from the reference type, in the context of the lambda expression usage. Here, i show a simplified view, of the sort method in List.

```java
void sort(Comparator c);
```

And here is the call to the method passing the lambda expression.

```java
people.sort((o1,o2)->o1.lastName().compareTO(o2.lastName()));
```
From this, java can infer that this lambda expression, resolve to a Comparator type, because of the method declaration. This means the lambda expression passed, should represent code for a specific method on the Comparator interface.

But which method ?,
well, there's only one the lambda expression cares about, and that's the abstract method on Comparator. java requires types which support lambda expressions, to be something called a functional interface. 

## What's a functional interface ?

A functional interface is an interface tha has one, and only one, abstract method. This is how java can infer the method, to derive the parameters and return type, for the lambda expression. you may also see this referred to as SAM, which is short for Single Abstract Method is called the  functional method. A functional interface is the target type for a lambda expression  