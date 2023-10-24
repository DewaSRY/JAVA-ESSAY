# Encapsulation 

Encapsulation is how we hide some complexity by make it inaccessible. and why we want to hide some thing in java 
- To make the interface simpler, we may want t hide unnecessary details.
- To protect the integrity of data on an object, we may hide or restriction access to some of the data and operations.
- To decouple the published interface from the internal details of the class. we may hide actual name and type of class members.

Am application program interface, or API, is the public contract, that tells other hos to use the class

*The problem when classes aren't properly encapsulated* Allowing direct access to data on an object, can bypass checks and operations. it encourages an interdependency, or coupling, between the client code and the class. For the previous example, we showed that changing a field name, broke the calling code. And we also showed, that the calling code had to take on the responsibility, for properly a new Player. That's really of the huge benefits of ecapsulation, is that your're not actually affecting any other code. it's sort like a black box in many ways. BUt the EnhancedPlayer class has more control over it's data. This is why we want to use encapsulation. we protect the members of the class, and some methods, from external access. this prevent calling code form bypassing the rules and constraints, we;ve built into the class. when we create a new instance it's initialized with valid data. but likewise, we're also making sure that there's no direct access to the fields. That's why you wan tto always use encapsulation. it's something that you should really get used to.

## Staying in Control 
this is why we anat to use encapsulation. we protect the members of the class, and some methods, form external access. this prevent calling code from bypassing the rules constraints, we've built int the class. That's why you want t always use encapsulation. it's something that you should really ge used to.To create an encapsulated classes code , you want to :

- Create constructor for object initialization, which enforce that only object with valid data will get created.
- Use the private access modifier for you fields.
- Use setter and getter methods sparingly, and only as needed.
- Use access modifiers that aren't private, only for the methods that the calling cod needs to use.
