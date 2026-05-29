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

## Introduction

### Primitive types

#### Naming convention for variables

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

#### Casting

Casting is the process of converting one data type into another

    double myDouble = 100.5;
    int myInt = (int) myDouble; // 100 (decimal part truncated)

### Operators

#### Arithmetic

- Addition (+)
- Subtraction (-)
- Multiplication (\*)
- Division (/)
- Modulo (%)

#### Relational

Always return true or false

- Equal to ==
- Not Equal to !=
- Greater than \>
- Less than <
- Greater than or equal to \>=
- Less than or equal to <=

#### Logical

- And -> &&
- Or -> ||
- Not -> !

#### Assignment

- =
- +=
- -=
- \*=
- /=
- %=

#### Unary

- ++
- \--

### Conditional Statement

#### If / Else

The if statement is the fundamental decision-making construct that executes a block of code when a specified boolean expression evaluates to true

    double num = 2;
    if (num % 2 == 0){
        System.out.println("Even");
    } else {
        System.out.println("Odd");
    }

#### Ternary Operator

The ternary operator is an alternative to simple if statements and is represented by the following syntax: condition ? true : false

    double num = 2;
    String result = num % 2 == 0 ? "Even" : "Odd";

#### Switch / Case

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

### Loops

#### While

The while loop is an entry-controlled control flow statement that repeatedly executes a block of code as long as a specified boolean condition evaluates to true.

    while(condition){
        // code to be executed
    }

- The condition is evalueted before each iteration. If false, the code will not execute.

#### Do While

The difference between while and do while is that the do while loop is executed at least once;

    do {
        // code to be executed
    } while(condition)

#### For

The for loop is a control flow statement used to repeat a block of code a specific number of times, primarily when the number of iterations is know beforehand.

    for (int i = 0; i <= 10; i++){
        System.out.println(i);
    }

#### Control flow keywords

- *break* statement is a control flow keyword used to terminate a loop or a switch statement immediately.

- *continue* statement is used to skip the current iteration of a loop and immediately preceed to the next one, without terminating the loop itself.

### Arrays

An array is a fixed-size data structure that stores a colection of elements of the same data type. Arrays have a fixed length defined at creation time, witch cannot be changed.

    int[] numbers = new int[5];

Elements are accessed or modified using the index operator. It is common to use loops to iterate through array values.

There is a simpler for loop called foreach. It is simpler because it does not need an index to iterate through the array. Its syntax is:

    for (int number : numbers){
        // code to be executed
    }

### Multidimensional Arrays

A multidimensional array is an array of arrays. It is as if each position in the first array contains a reference to another array. In this course, I will only study 2D multidimensional arrays, but it is possible to create 3D or even more complex multidimensional arrays. However, this also increases the complexity.

For each array dimension, it is necessary to use a for loop to iterate through it:

    int[][] numbers = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    for (int[] baseArray : numbers){
        for (int num : baseArray){
            System.out.println(num);
        }
    }

## Object Orientation

### Introduction to Classes

A Class is a blueprint (template) used to create objects, which are instaces of that class.

- Cohesion -> High cohesion indicates that a class is designed with a single, well-focused purpose, where all methods and fields work together to archieve a commmon goal.

### Introduction to Methods

A method is a reuseble block of code designed to perform specific tasks. A method syntax:

    accessModifier returnType methodName(parameters){
        // code
        return value; // if returnType is not void
    }

There are some important things to know about method parameters. Any variable type can be used as a parameter, but the passed value may behave differently than expected.

- if the parameter is a primitive type, the method recieves a copy of the value. **It does not change the original value!**
- if the parameter is a reference type, the method recieves a copy of the memory address. **It may change the original value!**

**this** -> refers to the current object within an instance method or constructor.

**VarArgs** -> allows methods to accept a variable number of arguments of a specific type. The VarArgs parameter **MUST BE THE LAST** in the method signature. Your syntax:

    public void methodName (int... varArgsParameter){
        // code
    }

### Acess Modifier

Acess modifiers are keywords that control the visibility and accessivility of classes, methods, variables and constructors.

In Java, there are four access levels:

- Public -> Acessible from anywhere.
- Default -> Acessible only within the same package.
- Protected -> Acessible within the same package and by subclasses in other packages.
- Private -> Acessible only within the same class.

### Overloading methods

Java method overloading allows a class to define multiple methods with the same name, but different parameter list(number, type or order).

    public void printSomething(String name) {
        System.out.println(name);
    }

    public void printSomething(String name, int age) {
        this.printSomething(name);
        System.out.println(age);
    }

### Constructor

A Java Constructor is a special block of code that initializes a newly created object. It has the same name as the class and does not have a return type.

The constructor syntax:

    public class Test {
        private int num;

        public Test(int num) {
            this.num = num;
        }
    }

Constructor overloading works similarly to method overloading, but to call another constructor, you use the *this()* keyword.

    public class Test {
        private int num;
        private int num2;

        public Test(int num) {
            this.num = num;
        }

        public Test(int num, int num2) {
            this(num);
            this.num2 = num2;
        }
    }

### Initialization Block

An initialization block is a block of code defined within a class but outside any method or constructor. It is used to initialize instance variables or perform common setup tasks.

- It is executed every time a new object is created, running **before the constructor.**

The initialization order in a class is:

1. Memory allocated;
2. Each class attribute is initialized;
3. The initialization block is executed;
4. The constructor is executed;

Its syntax is simply:

    {
        // code
    }

### Static modifier

The static modifier is a non-access modifier used to create class-level variables and methods that belong to the class itself rather than to a specific instance.

- variables -> They are shared among all objects of the class and exist independently of any instance.

- methods -> They can be called without an object instance and can access only other static members or parameters, not instance-specific data.

- initialization blocks -> They are executed only once, before memory alocation by the JVM. They cannot access non-static attributes because non-static attributes do not exist yet.

### Association

Association is a concept that defines how two separate classes interact or connect through their objects. It represents a "uses-a" or "has-a" relationship, where objects know about each other and utilize each other's functionality without implying inheritance.

Types of Association:

- One-to-One -> A single instance of one class is associated with a single instance of another class.
- One-to-Many -> A single instance of one class is associated with multiple instances of another class.
- Many-to-One -> Multiple instances of one class are associated with a single instance of another class.
- Many-to-Many -> Multiple instances of one class are associated with multiple instances of another class.

### Inheritance

Inheritance is a core concept in OOP, where one class (called the child class) acquires the properties and behaviors of another class(called the parent class). It represents an "is a" relationship, where objects are more specifc versions of the base class. This concept allows us to avoid rewritting the same code in two or more different files.

To make a class inherit from another class, the *extends* keyword is used.

    public class Animal {
        protected String name;

        public void eat() {
            System.out.println(name + " is eating...");
        }
    }

    public class Dog extends Animal {
        public void bark() {
            System.out.println(name + " is barking: Au Au Au...");
        }
    }

    Dog dog = new Dog();
    dog.name = "Teddy";
    dog.eat();
    dog.bark();

To acess parent class members, the *super* keyword is used.

- All classes in Java extend the Object class.

#### Overriding

A new concept is introduced here: **Overriding**. Overriding allows us to replace or extend the behavior of a method in a child class.

    public class Animal {
        protected String name;

        public void eat() {
            System.out.println(name + " is eating...");
        }
    }

    public class Dog extends Animal {
        @Override
        public void eat() {
            System.out.println(name + " is eating dog food...");
        }
    }


    Dog dog = new Dog();
    dog.name = "Teddy";
    dog.eat(); // Teddy is eating dog food...

#### New Initialization Order

At this point, with everthing learned so far, the initialization order is:

1. Static init block from the superclass is executed when JVM loads the class and only once.
2. Static init block from the subclass is executed when JVM loads the class and only once.
3. Memory allocated for the superclass.
4. Each class attribute from the superclass is initialized.
5. Init block from the superclass is executed in the order they appear.
6. The constructor from the superclass is executed.
7. Memory allocated for the subclass.
8. Each class attribute from the subclass is initialized.
9. Init block from the subclass is executed in the order they appear.
10. The constructor from the subclass is executed.

### Final Modifier

The final modifier is a non-access keyword used to restrict modifications to classes, methods, and variables, ensuring immutability, and preventing inheritance or overriding.

#### Attributes - Primitive types

By convention, all final attributes should have their names written in UPPERCASE, with words separated by underscores. It is also important to know that final attributes must be initialized with a value.

    public class Car {
        public final double SPEED_LIMIT = 200;
    }

- A final attribute cannot be reassigned.

#### Attributes - Reference types

In reference type attributes, the same rules from primitive types are folliwing also, but in the case of reference types, what is not be changed are not the values of an object but the memory reference to that object.

    public class Buyer{
        public String name;
        public void setName(String name){
            this.name = name;
        }
        public String getName() {return this.name}
    }

    public class Car {
        public final Buyer BUYER = new Buyer();
    }

    //test
    Car car = new Car();
    car.BUYER = new Buyer(); // this is not allowed
    car.BUYER.setName("Kuririn");
    System.out.println(car.BUYER.getName());

#### Methods

A final method cannot be overridden by a subclass.

#### Classes

A final class cannot be extended or inherited by another class.

### Enumeration

An enum is a special type of class in Java that represents a fixed set of constants. Enums are ideal for scenarios such as days of the week, state machines and similar use cases.

- Each constants in an Enum is implicitly public static and final.

Enums can contain instance variables, constructors, and methods, allowing constants to store additional data:

    enum Size {
        SMALL(10), LARGE(20);

        private int size;

        Size(int size) {
            this.size = size;
        }
    }

All enums automatically inherit two methods:

- values() -> Returns an array containing all enum constants.
- valueOf() -> Return the enum constant associated with a given name.

### Abstract Classes

An Abstract class is a class declared with the *abstract* keyword that cannot be instantiated directly and serves as a base class for subclasses. Abstract classes allow partial abstraction by supporting both concrete and abstract methods.

Some rules about Abstract Classes and Abstract Methods:

- It is not possible create objects from an abstract class.
- An abstract method must be implemented by the next concrete subclass.
- A concrete class can extend only one abstract class.
- Abstract classes can use all access modifiers.

### Interfaces

Interfaces are blueprints that define a contract of methods that a class must implement, enabling abstraction and multiple inheritance of behavior. Unlike classes, interfaces cannot be instantiated, do not have constructors, and their fields are implicitly *public* *static* *final*.

By default, all methods are public and abstract, requiring implementation by the implementing class.

- In Java 8+, methods can have implementations using the *default* keyword.
- Also in Java 8+, interfaces can contain static methods that are called directly from the interface name and are not inherited.

Classes implement interfaces using the *implements* keyword, allowing a single class to adopt multiple behaviors.
