#### Entry Ticket

Please take a moment to reflect on what you have previously learned and hope to learn by completing this Google Survey. Remember your responses will be read by your instructor to help guide future lessons.

* [Guided Project Entry Ticket](https://forms.gle/wBbm2FC214GYrAXM6)

#### Daily Resources

* No Guided Project Starter - built from scratch
* [Slido](https://app.sli.do/event/XXXXXXXX)
* [Zoom like](https://lambdaschool.zoom.us/j/#########)

#### Slack Message

@channel
Let's do this! The Java Class will be starting in 3 minutes at (https://lambdaschool.zoom.us/j/#########)
Please post questions to the Slido link at (https://app.sli.do/event/XXXXXXXX)

### Introduction and Hook

Welcome to the World of Java

* A language that is strongly typed
* A language that is Object Oriented
* A language that runs on a virtual machine
* A whole new experience. Let's get started

### Purpose

We need to set a good foundation in Java to have a successful time learning the language. Let's go!

### Learning Activities

#### Working with the Objective: Understand what makes Java a programming language worth studying

Introduce the class

* Welcome to Java
  * and the JVM -> JRE -> JDK
* Show how TK is organized
  * Point out software installs needed
  * Extra resources!

Create an application called `EmployeeApplication` and a package called `employeeApp`

```BASH
<home dir><work dir>/EmployeeApplication/src/employeeApp
```

Enter the following code into a file in the employeeApp folder called Main.java

```JAVA
package employeeApp;

public class Main
{
    private static void workWithData ()
    {
        System.out.println("Welcome to Lambda School's Java!!!");
    }

    public static void main(String[] args)
    {
        workWithData();
    }
}
```

To run our code, we go through the following steps, running these commands from the `src` directory. These are steps to repeat after each change of the source code

```BASH
javac employeeApp/*.java
jar cvfe employeeApp.jar employeeApp.Main employeeApp/*.class
java -jar employeeApp.jar
```

So the order is

* Convert to bytecode
* Archive to a single file
* Execute the program

Remember

* c – create new archive file with given name
* v – generate verbose output
* f – specifies the jar output file to be created
* e – sets the main class also called the entry point

- [Check for Understanding CFU - Google Form](https://forms.gle/AFJDuAUhT3aaNb729)

#### Working with the Objective: Explain the basic concept of Object Oriented Programming and how they relate to Java

* Create the Employee class
  * Explain how each object will have an id number to represent a database primary key
  * Explain how we can override the toString() method to print something more useful than the memory location, the pointer
* Create the Company class
  * Explain how Company's fields are accessed publicly. Poor programming practice but does happen
* Create the Healthplan class

* [Check for Understanding CFU - Google Form](https://forms.gle/Fg4pc9tBfRx9szD47)

#### Working with the Objective: Create and manipulate the base Java types which include Boolean, byte, char (including Strings), short, int, long, float, and double

* Work through the first practice round
* Work through the second practice round
* [Check for Understanding CFU - Google Form](https://forms.gle/2W1Nx3wVCaqo3okc7)

#### Working with the Objective: Craft multiple Java Classes which include comments, constructors, static and instance variables (fields), accessors, public and private methods and instantiate and use Objects of these classes

* Work through the third practice round
* [Check for Understanding CFU - Google Form](https://forms.gle/dj4AGuYqvCyScL1u5)

#### Objectives If Time Allows

#### Working with the Objective: Implement and use the String and Date data types

* Work through the fourth practice round
* [Check for Understanding CFU - Google Form](https://forms.gle/zspKL9GLJ89nMbP59)

#### Working with the Objective: Understand the reason behind and use of BigDecimals

* [Check for Understanding CFU - Google Form](https://forms.gle/MfH7KpzqJb48LRwaA)

#### Conclusion

##### Review what we just learned

Today we covered the fundamental aspects of Java, the foundational concepts that set Java apart from other languages

* Object Oriented Programming
* Strongly Typed
* Bytecode running on the Java Virtual Machine (JVM)

##### How is this related to tomorrow's topic

* Tomorrow we will look at a variety of Java constructs that allow to better work with the language
  * Collections
  * Loops
  * Branching

### Exit Ticket

Please take a moment to reflect on what you have learned in today's Guided Project. Remember your response will be read by your instructor to help guide future lessons.

* [Guided Project Exit Ticket](https://forms.gle/cVdQMhn3ST4p37x2A)
