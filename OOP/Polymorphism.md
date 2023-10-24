# Polymorphism

Polymorphism lets us write code to call a method, but at runtime , this method's behavior can be different, for object. this means th behaviors that occurs , while the program is executing, depends on runtime type of the object. And the runtime type might be different from the declared type in the code. The declared type has no have some kind of relationship to the runtime type, and inheritance is one way to establish this relationship. there are other ways, but in this video we'll talk about how to use inheritance, to support polymorphism. 

## What is var? 
var is special context keyword in java that lets our code tak advantages of local variable type interface. By using as the type , we 're telling java to figure out the compile-time for us.

## Local variable Type Interface 

Local variable type interface was introduce in java 10. one of the benefits is to help with readability of code. and to reduce boilerplate code. it's called local Variable type interface for a reason, because:

- It can't be used in field declarations on class.
- It can't be used in method signature either as a parameter type or return type.
- It can't used without an assignment, because the type can't be inferred in the case.
- It can't be assign a null literal, again because a type can't inferred in that case.

## Run Time vs Compile Time Typing 

In many case, the compile time type, is the declared type to the left of assignment operator.What is returned on the right side of the assignment operator, from whatever expression or method is executed, sometimes can only be determined at runtime, when the code is executing conditionally, thought the statements in the code. you can assign a runtime instance to a different compile time type, only if certain rules are followed. int this course, up to now we've looked at only one rule that applies, and that's the inheritance rule.We can assign an instate to a variable of the same type including java.lang.object, the ultimate base class


Why are runtime types different then compile time types? Because of polymorphism . polymorphism lets us write code once,in a more generic fashion, like the code we started his lecture with. we saw that those two lines of code, using a single compile time type of movie , actually supported four, different runtime types. Each type was able to execute behavior unique to the class.  