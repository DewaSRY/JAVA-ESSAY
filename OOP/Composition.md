# Composition 

composition is how every chunk assemble together. in to the big one. the mine different inheritance an composition is:

- inheritance defines an **is A** relationship
- Composition defines as **Has a* relationship 

## Use Composition or Inheritance   

As a general rule when your designing your program in java, you probably want to look at composition first. Most of the experts will tell you, that as a rule, look at composition before implementing inheritance. you saw our parts this example, we actually used both. All of our parts were able to inherit a set of attributes, like the manufacture an modal. The Calling code didn't have to know anything about these parts, to get personal Computer to do something. 

## Why is Composition is preferred over Inheritance 

The reason compositor is preferred over inheritance:
- Composition is more flexible. you can add parts in , or remove them and these change are less likely to have a downstream effect.
- Composition provides function reuse outside of the class hierarchy, meaning classes can share attributes & behaviors, by similar components, intend of inheritance functionality from a parent or base class
- java inheritance breaks encapsulation, because subclass may need direct access to parent's state or behaviors.

## Why is inheritance less flexible ?

inheritance is less flexible. Adding a class to, or removing a class from , a class hierarchy, may impact all subclasses from the point  in addition, a new subclass may nt need all the functionality, or attributes of its parent class 