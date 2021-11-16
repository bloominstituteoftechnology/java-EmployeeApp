# Spring 1 Java Fundamentals - Module 1 JDK and Java Classes

## Overview

The fundamentals of Java are discussed during these modules. Specific emphasis is placed on Java constructs needed for Web API programming with the Spring Framework.

## Objectives

Overall the student will be able to construct a Java applications using Object Oriented Programming design principles and using the Java Development Kit (JDK)

At the end of this module, a student should be able to:

* understand what makes Java a programming language worth studying
* explain the basic concept of Object Oriented Programming and how they relate to Java
* create and manipulate the base Java types which include Boolean, byte, char (including Strings), short, int, long, float, and double
* craft multiple Java Classes which include comments, constructors, static and instance variables (fields), accessors, public and private methods * and instantiate and use Objects of these classes.
* implement and use the String and Date data types
* understand the reason behind and use of BigDecimals (*** OPTIONAL ***)
* craft and use for loops (*** OPTIONAL ***)
* craft and use while loops and do while loops (*** OPTIONAL ***)
* craft and use recursion (*** OPTIONAL ***)
* craft and use Java conditionals, branching, including if-then, if-then-else, and switch statements (*** OPTIONAL ***)

### Core Objectives

* Understand what makes Java a programming language worth studying
* Explain the basic concept of Object Oriented Programming and how they relate to Java
* Craft multiple Java Classes which include comments, constructors, static and instance variables (fields), accessors, public and private methods and instantiate and use Objects of these classes

### Objective to Cover if Time Permits

* implement and use the String and Date data types
* understand the reason behind and use of BigDecimals (*** OPTIONAL ***)
* craft and use for loops (*** OPTIONAL ***)
* craft and use while loops and do while loops (*** OPTIONAL ***)
* craft and use recursion (*** OPTIONAL ***)
* craft and use Java conditionals, branching, including if-then, if-then-else, and switch statements (*** OPTIONAL ***)

----

## Before Class

### Instructor Resources

* Repos to Keep Updated
  * [Teacher's Edition of Class LambdaJX](https://github.com/BloomInstituteOfTechnology/LambdaJX.git)
  * [Guided Project java-EmployeeApp](https://github.com/BloomInstituteOfTechnology/java-EmployeeApp.git)
  * [Optional Guided Project]()
  * [Module Project java-SnackBar](https://github.com/BloomInstituteOfTechnology/java-SnackBar.git)

* Guided Project Repos
  * java-EmployeeApp - Guided Project build from scratch
  * [java-EmployeeApp - Guided Project Solution](https://github.com/BloomInstituteOfTechnology/java-EmployeeApp.git)

* Notes to Presenter
  * Watch pacing in Guided Project.
  * Do NOT add javadocs to the Guided Project code. Those will be available in the final Repo.
  * Remember this is the first Java program we have written together. Be very explicit about each step!

### Student-Facing Resources and Materials

![Optional Objectives Video](https://youtu.be/_FUd49FHk78)

#### Software Needed for this Guided Project

* Java Development Kit (JDK) - at least version 11
* Your choice of Text Editor

#### Previous Lessons

![Model Presentation of Guided Project](https://lambdaschool.github.io/java-curriculum-assets/Sprint%2010%20-%20WEB%20Java%20Fundamentals/Module%201%20-%20JX%20Java%20-%20I%20JDK%20and%20Java%20Classes/assets/novideo.png)

#### Preclass Announcements

@channel
Good Morning. Welcome to the first day of Java! You will need to have the Java Development Kit and the text editor of your choice installed for today's guided project. Java is a new programming language following a new programming style. Learning Java will be difficult but certainly worthwhile. Remember to work through as much of the TK and Canvas material for today as possible. I realize TK (for course introductions and software installations) and Canvas (for everything else) has much information. Do your best and over the next two or three days you will get all caught up! See you at 9:00!

For now, the material for the actual course is the same in Canvas and TK. However, Canvas should be your goto platform as it is the one that will be kept up-to-date and the one where you can turn in your assignments!!!

### Training Kit Hour

Objective 1 - Java Introduction.md
Objective 2 - Object Oriented Programming.md
Objective 3 - Base Data Types.md
Objective 4 - Craft Java Constructs.md
Objective 5 - Strings and Dates.md
Objective 6 - BigDecimal OPTIONAL.md
Objective 7 - FOR Loops OPTIONAL.md
Objective 8 - WHILE Loops OPTIONAL.md
Objective 9 - Recursion OPTIONAL.md
Objective 10 - Branching OPTIONAL.md

#### Training Kit Announcements

< NONE >

----

## During Class

### Morning Announcements

< NONE >

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
        System.out.println("Welcome to BloomTech's Java!!!");
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

----

## After Class

### Introduce Module Project

* Remember it is based on what we did in the guided project!
* The Snack Bar project is a Java project that has been used to introduce Java since its inception. Every Java programmer needs to have done a Snack Bar project. Here is your chance!
* [Snack Bar Module Project](https://github.com/BloomInstituteOfTechnology/java-SnackBar.git)
  * [Module Project Solution and Rubric](https://github.com/BloomInstituteOfTechnology/LambdaJX/tree/Curriculum-Work/solutions/Module%20Solutions/Sprint%2010%20-%20WEB%20Java%20Fundamentals/Module%201%20-%20JX%20Java%20-%20I%20JDK%20and%20Java%20Classes)

### Exit Ticket

Please take a moment to reflect on what you have learned in today's Guided Project. Remember your response will be read by your instructor to help guide future lessons.

* [Guided Project Exit Ticket](https://forms.gle/cVdQMhn3ST4p37x2A)
