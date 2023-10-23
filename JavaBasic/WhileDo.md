# While Do 

what if you want to loop until some condition is met, that's not associated with known range of value 

## Java has two type of while loops

| While loops | Explanation |
| ---| ---|
| while | Continue executing code block until the loop expression becomes false |
| do while | executing the code block once , then continue executing until the loop condition becomes false 

### While loop statement 

```java
while ( expression ){
    // block of statement
}
```
### do While loop statement 

```java
do{
    // block of statement
}while ( expression )
```

### Continue 
 `continue` statement is simple form, will stop executing the current iteration of a block of code in a loop and start a new iteration 

 ### Examine loop condition carefully
when using loop you want to carefully examine the condition for termination, or continuing a loop Check for endless or infinity loops, also check where a loop will never execute. the continue and break both interrupt normal loop processing. the continue statement starts a new iteration but continue to iterate through the loop. the break statement exist the loop, at the point it's executed, and no longer completes any code int the loop and wont continue iteration 

