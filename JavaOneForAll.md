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
