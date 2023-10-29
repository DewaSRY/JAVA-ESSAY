# Enumeration

the enum type is java's type to support something called an enumeration. Wikipedia defines enumeration as, "A complete ordering list od **all the items** in a collection". java describe the enum type as : a Special data type that contains predefined constants. A constants is a variable whose value can't ba changed, once it;s has been assigned. So an enum is a little an array, except it's elements are know, not changeable, and each element can be referred to by a constant name, instead of an index position.  

## The enum type

```java
public enum DayOfWeek{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}
```

an enum, in its simplest form, is describe like a class, but the keyword enum, replace the keyword class. You can name the enum with any valid identifier, but like a class, Upper CamelCase is the preferred style. with the enum body, you declare a list of constant identifiers, separated by commas. By conversation, these are all upperCase labels. One example of an enum, is the days of the week, as shown here.

an enumeration is ordered, by the way you declare the constants. This means that SUNDAY is considered the first day of the week, and SATURDAY is the last day of the week.

## the enum type 

the enum type is used to declare a limited set od constants, and sometimes, there is a natural order to the listing as in the case of days of the week.

Underneath the covers, the enum type is special type of class, which contains fields to support the constants, but we'll get into that, in a later discussion. you don't have to understand all the internals of an enum , to derive the benefits of using this type. Once you get used to how this type works, you may find many places to use an enum. they simplify your code, and make it more readable in many ways 