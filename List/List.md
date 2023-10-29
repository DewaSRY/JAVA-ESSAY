
# ArrayList and LinkedList

welcome to the list section of the java MasterClass.
int the last section, i talked about the array, as a way to manage a list of items, all having the same type. Array were a massive improvement if you need to store items of same type, but as you saw, array have some limitations, Not being able to change the number of elements in an array being one. Fortunately, java also includes an entire library for java containers, which they call Collections.

They take arrays we worked with to the next level. they allow you to change the number of elements defined in an array for one, but there are many other improvements as well. in this section, we'll be talking about lists which are java containers and explain what they are, and how to use them Two most common classes for list are ArrayList and Linked list . we will start by looking at these. 

In additional, i'll be covering important concepts relate to these topics like big O Notation, iterators, AutoBox and Unboxing, and the enum type. if you are unfamiliar with any of these terms, by the end of this section, they will make sense.

There's a lot to covering in this section, so lets get started.

## java Array vs java List 

An array is mutable, and we saw, that we could set or change values the array but we could not resize it. java gives us several classes that let us add and remove items. and resize a square a sequence of element. These classes are said to implements a list's behavior.So what is a list ?.

## So what is a list ?

in our everyday life, we use lists all the time. When we're going the grocery store, we've got a list.we have a list of things we need to do, list of addresses, a list of contact numbers, etc. it wouldn't br avery useful list however, if we started with 10 items we could change, but never add or remove an item. 

## so what is a list 

list is a special type in java , called an interface. For now, i'll say a list interface describes a set of method signatures, that all list classes are expected to have. lets look at some of these methods. i'm going to pull up the list methods in java's api


## The ArrayList 

the ArrayList is a class, that  really maintains an array in memory thats actually bigger that what we need, in most case. 

it keeps track of the capacity, which is that actual size of the array in memory. but it also keeps track of the elements that have been assigned or set, which is the sie of the arrayList. as elements are added to an arrayList, its capacity may need to grow. This all happens automatically behind the scenes.  