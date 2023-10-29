# What's an Iterator ?

So far we've mainly used for lo0ps to traverse or step through elements, in an array or list. we can use the traditional for loop an index, to index into a list. we can use the enhanced for loop and a collection, to step thought the elements the elements,one at a time. but java provides other means to traverse lists. Two alternatives are the iterator, and the literator.

if you're familiar with databases, you might be familiar with a database cursor, which is a mechanism that enables traversal, over records in a database. an iterator can be thought of as similar to database cursor. The kind of cursor we're referring to here, can be described as an object, that allows traversal over records in a collection.

the iterator is pretty simple. when you get an instance of an iterator, you can call the next method, to get the next elements in the list. you can use the hasNext method, to check if any elements remain to be processed. in the code , you can see a while loop, which uses the iterator,s hasNext method, to determine if it should continue looping. 

in the loop, the next methods is called, and its value assigned t local variable, and the local variable printed out. this 

the iterator is pretty simple. When you get an instance of an iterator, you can call the next method, to get the next element in the list. you can use the hasNext method, to check if any elements remain to be processed. in the code, tou can see a while loop, which uses the iterator's hasNext method if it should continue looping in the loop, which uses the iterator's hasNext method, to determine if it should continue looping. this would just print each element in a list, but do it thought the iterator object.

## Who does an iterator work ?

When an iterator is created it.s cursor position is pointed at a position before the first element. the first and second elements. subsequence  calls to the next methods moves the iterator's position thought the list, as shown, until there are not elements left, meaning hasNext= false.
At this point, the iterator or cursor position is below the last element.

An iterator if forwards only supports the remove method. a ListIterator can be sued to go both forwards and backwards, and in addition to remove method, it also support the add and set methods

```java
var iterator = list.ListIterator();

//cursor position 1
String first = iterator.next();
//cursor position 2
String second = iterator.next();
// reversing Declare
String reversed = iterator.previous();

```