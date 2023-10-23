# Inheritance 

Inheritance is way to organize classes into parent =-child hierarchy. which lets the lates child inherit, fields an methods from it's parent 

## extends

Using extends specifies that supperClass (or the parent class ) of the class we're declaring. which mean the class extend other one class wil be the child of the superClass.

## supper()

supper() is a lot like this() it's way ro call a contractor teh super class. directly from the sub class'e constructor. like this(). it has to be first statement of the constructor because of the rule, this() and super() can never called from same constructor.If you don't make a call to super(), then java makes it for you using super's default constructor. if you super class doesn't have a default constructor, then you must especially call super() in all of your constructor passing right argument t that constructor. 

## Java.lang.object

Java classes interisically extends a special java class. this is because is named object and it't in java.lang.package. 

Mine class inherits or subClass of Object, also is String. The String class have over 60 methods. the String overrides several methods on object , two of them are `equal()` and `toString()`.

## this vs super
Let's discuss the different between the this , and super keywords. Well also find out about the difference the this() and super() , method calls.

the `super` is used to access or call the parent class members ( variable and methods) the keywords this is used to call the current class members ( variables and methods). 