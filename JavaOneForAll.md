# Java One For All

## How Java works

Every application needs to be written for a different OS. What Java did for this was create a layer that sits between the OS and the source code.

- WORE - Write once, run anywhere.

- JDK - Java Development Kit

- JRE - Java Runtime Environment

- JVM - Java Virtual Machine

The JDK includes the JRE and the javac compiler, which converts .java files into .class files. The JVM can only understand bytecode (.class files).

## Organizing the code in packages

It's important to organize the project into packages because, in the future, when i work on larger projects, i'll be able to find files more easily, since i'll know where each class belongs.

A good package structure makes the project easier to maintain.

## Primitive types

### Naming convention for variables

By convention, variable names should be written in camelCase, starting with a lowercase letter.

There are 8 primitive types in Java:

- byte = [-128, 127]
- short = [-32_768, 32_767]
- int = [-2_147_483_648, 2_147_483_647]
- long = [-9_223_372_036_854_775_808, 223_372_036_854_775_807]
- float = [1.40239846*10^(-45), 3.40282347*10^(38)]
- double = [4.9406564584124654 *10^(-324), 1.7976931348623157*10^(308)]
- char = [any character literal] ASCII table
- boolean = [false, true]

### Casting

Casting is the process of converting one data type into another

    double myDouble = 100.5;
    int myInt = (int) myDouble; // 100 (decimal part truncated)

## Operators

### Arithmetic

- Addition (+)
- Subtraction (-)
- Multiplication (*)
- Division (/)
- Modulo (%)

### Relational

Always return true or false

- Equal to ==
- Not Equal to !=
- Greater than \>
- Less than <
- Greater than or equal to \>=
- Less than or equal to <=

### Logical

- And -> &&
- Or -> ||
- Not -> !

### Assignment

- =
- +=
- -=
- *=
- /=
- %=

### Unary

- ++
- \--

## Conditional Statement

### If / Else

The if statement is the fundamental decision-making construct that executes a block of code when a specified boolean expression evaluates to true

    double num = 2;
    if (num % 2 == 0){
        System.out.println("Even");
    } else {
        System.out.println("Odd");
    }

### Ternary Operator

The ternary operator is an alternative to simple if statements and is represented by the following syntax: condition ? true : false

    double num = 2;
    String result = num % 2 == 0 ? "Even" : "Odd";

### Switch / Case

The switch case statement is a control flow structure that executes a specific block of code on the value of a single expression, offering a cleaner alternative to multiple if-else statements.

The switch supports the following types: byte, short, int, char, String and Enum.

    switch (variable) {
    case value1:
        // code for value1
        break;
    case value2:
        // code for value2
        break;
    default:
        // code if no case matches
    }

## Loops

### While

The while loop is an entry-controlled control flow statement that repeatedly executes a block of code as long as a specified boolean condition evaluates to true.

    while(condition){
        // code to be executed
    }

- The condition is evalueted before each iteration. If false, the code will not execute.

### Do While

The difference between while and do while is that the do while loop is executed at least once;

    do {
        // code to be executed
    } while(condition)

### For

The for loop is a control flow statement used to repeat a block of code a specific number of times, primarily when the number of iterations is know beforehand.

    for (int i = 0; i <= 10; i++){
        System.out.println(i);
    }

### Control flow keywords

- break statement is a control flow keyword used to terminate a loop or a switch statement immediately.

- continue statement is used to skip the current iteration of a loop and immediately preceed to the next one, without terminating the loop itself.

## Arrays

An array is a fixed-size data structure that stores a colection of elements of the same data type. Arrays have a fixed length defined at creation time, witch cannot be changed.

    int[] numbers = new int[5];

Elements are accessed or modified using the index operator. It is common to use loops to iterate through array values.

There is a simpler for loop called foreach. It is simpler because it does not need an index to iterate through the array. Its syntax is:

    for (int number : numbers){
        // code to be executed
    }
