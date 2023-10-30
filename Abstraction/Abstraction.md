## Generalization and Abstraction 
 we use terms abstraction and Generalization we start trying to model real world things in software. before i launch into interface types and abstract classes, i want to talk about what these concepts mean.

 When you start modeling objects for your application, you start by identifying what features and behaviors your object have in common. we generalize when we create a class hierarchy. a base class is the most general class, the most basic building block, which everything can be said to have in common 

 ## Abstraction 

 part of generalization us using abstraction. you can generalization a set characteristic and behavior into an abstract type. if you consider an octopus, a dog, and penguin, you would say they're all animals. An animals is really an abstraction concept. An animal doesn't really exist as a way to describe a set more specific things. if you can't draw it on a piece of paper, it's probably abstract. Abstraction simplifies the view of set of items' traits and behavior, so can talk about them as a group, as well as generalize their functionality.

 ## java's support for Abstraction

 java supports abstraction in several different ways.

 - java allows us to create a class hierarchy, where the top of the hierarchy, the base class, is usually an abstract concept, where it's an abstract class or not.
 - java let's us create abstract classes.
 - java gives us a way to create interfaces.

 ## Abstract method

 in the videos that follow. i'll talking a lot about abstract and concrete methods. An abstract methods has a method signature, and a return type, but doesn't have method body. Because of this,we say an abstract methods is unimplemented. it's purpose is to describe behavior, which any object of that will always have. Conceptually, we can understand hehaviour like move or eat on an Animal,so we might include those as abstract methods, on an abstract type. you can think of an abstract method as a contract. this contract promises that all subtype will provide the promised functionality, with the agreed upon name and arguments

 ## Concrete method

 A concrete method has a method body, usually with at least one statements. this means it has operational code, that gets executed, under the right conditions. A concrete methods is said to implement an abstract method, if it overrides one. abstraction classes and interface, can have a mix of abstract and concrete methods

 i've already covered access modifiers and what they mean for types, as well as members of types. and we know we have public, protected, package, and private access modifiers, as options for the members.

 ## Method Modifiers 

 in addition to access modifiers, methods have other modifiers, which we'll list here, as a hight-level introduction.

 | Modifier | Purpose |
 | --- | --- | 
 | abstraction | When you declare a method abstract, a method body is always omitted. an abstraction method can only be declared on an abstract class or an interface|
 | static | some time called a class method, rather then an instance method, because it's called directly on the class instance.|
 |final | a method that is final can't be override by subclass.|
 | default | This modifier is only to an interface, and we'll talk about it in our interface video|
 | native | This is another method with no body, but it's very different from the abstract modifier. The method body will be implemented in platform-dependent code, typically written in another programming language such as S this is an advanced topic and not generally commonly used,and we won't be covering it|
 |synchronized | this modifier manages how multiple threads will access the code in this method. we'll this method. we'll cover this in a later section | 