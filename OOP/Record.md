# The POJO vs The record 
in the last video, we talked about the plain old java object, and we showed you how it comes with a lot of what we call boilerplate code. it's code that repetitive and follows certain rules. Once created, this code is rarely looked at modified in fact, there are tool that'll just regrate all of this code if, you underlying data, or domain model changes. 

## The Record type 
the record purpose to replace the boilerplate code the POJO, but more restrictive java calls them "plain data carriers". the record is special class that contains data, that's not meant to be altered. in other words, it seek to achieve immutability, for the data in its members. it contains only the most fundamental methods,such as constructor and accessors Best of all, you the developer , don't have to write or generate any of this code.

```java
public record LPAStudent(String id, String name, String dateOfBirth, String ClassList ){}
```
First it's imposable to understand that the part that's parentheses, is called the records header. records is class for immutable data transfer object, keeping them well encapsulated. you want to protect the data from untended mutations. 