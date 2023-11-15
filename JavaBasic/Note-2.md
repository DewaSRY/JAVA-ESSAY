# Control Flow

```java
//The switch statement;
switch(value){
    case x:
        //Code for value ==x
        break;
    case y:
        //Code for value ==y
        break;
    default:
        //code for value not equal
}
```
|Valid switch Value types|
| --- |
| byte, short, int, char|
| Byte, Short, Integer, Character|
| String|
| enum|

##m Fall through in switch statement

Once a switch case label matches the switch variable, no more cases are checked.
Any code after the case label where there was a match found, will be executed, until a break statement, or the end of the switch statement occurs.
Without a break statement, execution will continue to fall through any case labels declared below the matching one, and execute each case's code.

## A Switch Expression Challenge

So, in the last challenge, we used a traditional switch statement, to translate a letter into NATO's keyword, that represented that letter.
In this next challenge, we're going to use the enhanced switch expression.
Let's look at these statements side by side again, but this time, we're going to make the enhanced switch an expression, by assigning it to a variable.

```java
Enhance Switch Expression 
return switch(month){
    case "JANUARY","FEBRUARY","MARCH"->{yield "1st";}
    case "APRIL","MAY","JUNE"->"2nd";
    case "JULY","AUGUST","SEPTEMBER"->"3rd";
    case "OCTOBER","NOVEMBER","DECEMBER"->"4th";
    default ->{
        String badResponse= month + " is bad";
        yield badResponse;
    }
}
```

## Looping

Looping lets us execute the code a multiple number of times.
Java supports several statements for looping, or executing code repetitively.

### java support three statements for looping

| Statements | Explanation |
for | The for loops is more complex to set up but is commonly used when you are iterating over a set of values.|
| while | The while loop executes until a specified condition becomes false| 
| do while| the do while loop always execute at least one and continues until a specified condition become false |

#### for

The for statement is often referred to as the for loop.
It repeatedly loops something until a condition is satisfied.

```java
for(init; expression; increment){
    // block of statements
}
```
There are three parts to the basic for statement's declaration.
These are declared in parentheses, after the for keyword, and are separated by semi-colons.

These parts are all optional and consist of the following:
- The initialization section declares or sets state, usually declaring and initializing a loop variable, before the loop begins processing.
- **The expression section, once it becomes false**, will end the loop processing.
- The increment section is executed after the expression is tested, and is generally the place where the loop variable is incremented. 

#### The break statement

A break statement transfers control out of an enclosing statement.
We've seen the break statement in the switch statement, but it can also be used in a loop.

#### The while statements

So we've also stated several times, that the for loop has three declaration parts in the parentheses, separated by semicolons.
But looking at the while loop in comparison:

```java
//while statement
while(expression ){
    //block of statements
}
//The do while statement
do{
    //block of statements
}while(expression);
```

#### continue

The continue statement, in its simplest form, will stop executing  the current iteration of a block of code in a loop, and start a new iteration.



## Local Variables and Scope

In the past couple of videos, we've looked at many of Java's flow statements, the switch statement, the for statement, the while statement, as well as the do while statement. 
In previous videos, we covered the if then else statement. 
All of these statements may, and probably will, have their own code blocks.   
We've talked about code blocks quite a bit, but we haven't really talked about variables declared locally to many of these code blocks.

A local variable is called local, because it is available for use by the code block in which it was declared.
It is also available to code blocks that are contained by a declaring block.

```java
{
    int firstVariable= 5;
    int secondVariable= 10;
    if(firstVariable > 0){
        // Flow statement block starts inner block 
        // inner block code has access to outer block's variables
        System.out.println(secondVariable);
    }
}
```

`Scope` describes the accessibility of a variable.
'In scope' means the variable can be used by an executing block or any nested blocks.
'Out of scope' means the variable is no longer available. 

Local variables are always in scope, in the block they are declared.
They are also in scope for any nested blocks, or blocks contained within the outer block.

Local variables are always out of scope, for outer blocks, or the containing blocks they are declared in.
Let's look at an example:

```java
public static void aMethod(boolean aBoolean){
    if(aBoolean){
        int myCounter= 10;
    }
    System.out.printls(myCounter)// will throw error 
    // the code above will thro error because the `myCounter` is live in other scope
}
```
>It is considered best practice: 
>
>
>To declare and initialize variables in the same place if possible.And to declare variables in the narrowest scope possible.
