# What is text Block ? 
A text Block is just a special format fo multi-line String literals. it's simple a String, with a new representation in the source code.

## some Common Escape Sequences 
An escape sequence starts with a blackSlash. java has several, but the most common ones , are shown on this side. These can insert a tab, a newline, a double quote character, or a backSlash character if you need it, in your text. 

| Escape Sequence | Description | 
| ---| ---| 
|  \t | insert a tab character | 
|\n | insert a new line character | 
| \" | insert a double quote character | 
| \\ | insert a blackSlash character | 

## Format Specifiers

At their most complex, format specifier take the form shown here. %[argument_index$][width][.precision] conversion. They start with a percent sign, and end with a conversion symbol, and have lots of options in between. we've looked once conversion type , d, which is the symbol sued for decimal integer value. 

## The String 
the string has over 60 **methods** available. The String is a sequence of character are ordered and indexed. teh index start at 0 to N 

### String Inspection Methods

| method  | description | 
| --- | --- | 
| length | returns the number of characters in the String | 
| chartAt | return teh character at the index that's passed | 
| indexOf , LastIndexOf | Returns an integer, representing the index in the sequence where the String or character passed , can located in the String  | 
| isEmpty  | Return true if length is zero | 
| isBlank | Returns true if length is zero or the string only contains whitespace characters |

### String Comparison Methods 

| Method | description | 
| --- | --- | 
| contentEquals | returns A boolean if the String value is equal to the value of the argument passed. this methods allows for arguments other then String, for any type that is a character sequence.| 
| equals | returns a boolean if the String's value is equal to the value of the argument passed. | 
| equalsIgnoreCase | return a boolean if the String value is equal ( ignore case ), to the value of the argument passed. |
| contains | returns a boolean if the String contains the argument passed | 
| endsWith, startWith | These a boolean, and are much like the contains method, but more specific to the placement of the argument in the String | 
| regionMatches | return a boolean, if defined sub-regions are matched | 


### String Comparison Methods 

The first set of methods, don't actually change the underlying meaning of the text value but perform some kind of clean up. 

| method | description | 
| --- | --- | 
| indent | this is for removing space from the beginning of liens in multiline text | 
| strip, stripLeading, stripTrailing, trim , | the different between the strip method and trim methods is that strip (), supports a larger set of white space character. it and the corresponding stripLanding and stripTrailing| 
| toLowerCase, toUpperCase| Returns a new String, either in lower or uppercase| 

Teh Second set of string manipulation, transfer the String value, and return a String with a different meaning, the original String. 

| Methods | description |
| --- | --- | 
| concat | Similar to the plus operation for string, it concatenates text to the String and return a new String as the result | 
| join | Allows multiple string to be together in a single method, specifying a decimeter| 
| repeat | Returns the String repeated by the number f times specified in the argument . | 
| replace, replaceAll, replaceFIrst | These methods replace characters or string in the string, returning a new String with replacements made. |
| substring, subSequence | These return a part of the String, its range defined by the start and end index specified |

## String vs StringBuilder 
java provide a mutable class that lets us change its text value. This is the StringBuilder CLass. 

```java 
// Instantiating StringBuilder Object 
StringBuilder helloBuilder= new StringBuilder("hello");
StringBuilder emptyBuilder= new StringBuilder();
StringBuilder integerBuilder= new StringBuilder(3);
StringBuilder StringBuilderBuilder= new StringBuilder(helloBuilder);
```
When we passed the String literal  "Hello Good by", to the concat method, this created an object in memory for the literal, "and Goodby". it also create the result of the concat method, the objectm the String that has teh value, "Hello World and Goodby". but These methods don't change the internals of the exiting String object. these String referenced by the hello world  variable never change, instead a new String was created by the method call

on the other head if we concate two StringBuilder, it still reference sam object and the value of the object change 

- String methods create a new object in memory , and return a reference to this new object.
- StringBuilder methods return a String reference, but it's really self-reference

### methods unique to the StringBuilder class

A StringBuilder class has many similarity method to String but it also has method to remove and insert character or String and truncate it's size 

| method| description |
| --- | ---| 
| delete, deleteCharAt| you can delete substring using indices to specify a range , or delete a singe character at an index| 
| insert | You can insert text at specific position | 
| reverse | you can reverse the order of the character in the sequence | 
| setLength | setLength can be used to truncate tah sequence, or includes null sequnce to 'fillOut' the sequence to the length |