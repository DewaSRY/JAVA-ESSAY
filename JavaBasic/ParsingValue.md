# Parsing Value

## Reading from the console

| technique| Description| 
| ---| ---|
| System.in| Like `System.out`, java provides System.in which can read input from the console or terminal. it's not easy to user for beginners and lots, and lost of code has been build around it, to make it easier.|
| System.Console| This's java Solution for easier support for reading a single line Prompting user for information. Although this is easy to use , it doesn't work with I.D.E's because these environment disable it.|
| Command Line Arguments | This is calling the java program and specifying data in the call. this is very commonly used but doesn't let us create an interactive application in a loop in java|
| Scanner | the Scanner class was built to be a common way to read input, either using System.in a file. for beginners it's much easier to understand then te bare bones System.in|