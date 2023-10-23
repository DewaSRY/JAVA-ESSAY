# Control Flow

control Flow is essential aspect where some logic should be execute under some condition and also how often should a code segment be execute.

## The switch statement

```java
switch( value){
    case x:
        //code 
        break;
    default:
        //code
}
```
| valid switch value types|
| ---|
| byte, short , int , char|
| String | 
| enum|

Once a switch case label match the switch variable, no more case are checked. Any code after the case label where there was w match found , will be executed m until a break statement, or the end of the switch statement occurs. without a break statement, execution will continue to fall through any case labels declared below the matching one , and execute each case code. 
