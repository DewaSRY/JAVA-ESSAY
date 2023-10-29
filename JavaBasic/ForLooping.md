# Looping

Looping lets us execute the code a multiple number of time java supports several statements for looping, or executing code repetitively.

## Three Statement for looping

| Statements | Explanation |
| --- | ---| 
| for | the for loop is more complex to set up but common used where you are iterating over a set of values
| while | The while loop executes util a specified condition becomes false |
| do while | The do while loop always execute at lest one and continues until a specific condition become false| 

### The for Statement 

``` java
for ( init; expression ; increment ){
    // block of statements
}
```

there are three parts to the basic for statements declaration these are declared in parentheses, after the for keyword and are separate by semi- colons 

### These parts are all optional and consist of the following 
- The initialization section declares or sets state, usually declaring and initialize a loop variable, before the loop begins processing.
- The expression section, once it becomes false, will end the loop processing. 
- The increment section is executed after the expression is tested and is generally the place where the loop variable is incremented

## Enhanced For loop, the for Each loop 
this loop was design to walk through elements in an array, or some other type of collection. it processes one element at a time, for the first element to the last,

```java
for(declare: collection){
    //block of statements
}
```

it's important to notice, that the separator character between components, is a colon, and not a semi-colon, for the Enhanced for loop. The first part is a declaration expression, which includes the type and variable name. this is usually a local variable with the same type as an element in the array. and the second component is the array, or some other collection variable. 

