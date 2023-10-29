# Java nested Arrays

an array element can actually be an array. it's know as a nested array, or an array assigned to an other array's elements. This i show java supports two and three dimensional arrays, of varying dimensions.

## Two-Dimensional array

a two-dimensional array can be thought of, as a table or matrix of values, with rows and columns. you can use an array initializer for this which i'm showing ont this slice 


```java
// Array initializer formatted over multiple lines 

int[][] array={
    {1,2,3},
    {11,12,13},
    {211,212,213},
}
```
a two dimensional array doesn't have to be a uniform matrix thought. this means the nested arrays can be different size, as we show with this next initialization statement. 

```java
// Array initializer formatted over multiple lines 

int[][] array={
    {1,    2,   3},
    {11,   12, 13},
    {211, 212, 213,12},
}
```
you can initialize a two-dimensional array and define the size of the nested arrays, as shown here. 

```java
// Array initializer formatted over multiple lines 

int[][] array=new int[1][3]
// this statement says we have an array of 3 nested arrays and each nested array will have three int
```
you can initializer a two-dimensional array, without specifying the size of the nested arrays. here, we're specifying only the other array size, by specifying the length, only in the first set of square. brackets. we've left the second set of square brackets empty. 

```java
int[][] array= new int[3][];
```
the result of the initializer is an array of 3 null elements. we are limited to assigning integer arrays these elements, but they can be any length

There are a lot of ways to declare a two-dimensional array. i'll just cover the two most common ways here. the most common, and in my opinion, clearest  why , to declare a two-dimensional array, is to stack the square brackets as shown in the first example.

```java
int[][] myDoubleArray;
int [] myDoubleArray[]
```

When we declare multi-dimension array, the declare can itself be an array , and this is how java supports two-dimensional arrays

```java
int[][] myArray= new int[3][];

Dog[][] myDogs = new Dog[3][];

//Declare and instantiating an array of 3 arrays, which will have Dog element, again, the size of the inner arrays are't specified.
```

## Multi Dimensional  Array

we can take that event further, the other array can have reference to any kind of array itself. in this example, we have an other array with three elements 

```java
Object[] multiArray = new Object[3];
multiArray[0]= new Dog[3];
multiArray[1]= new Dog[3][];
multiArray[2]= new Dog[3][][];
//The first elements is itself a single-dimensional array.and so on
```


