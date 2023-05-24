﻿Nabil Sharif

Introduction to Computer Science

Chapter 1 Notes

1.1 Introduction

- Java is a powerful language that runs on practically every computer.

1.2 Program

- Computers are multi-purpose tools that can do a wide variety of tasks because they can be programmed. They are specifically designed to follow instructions.
- Computers are designed to do whatever job their programs or software tell them to do.
- Computer programming is both an art and a science.
  - Art
    - The logical flow of instructions
    - The mathematical procedures
    - The layout of the programming statements
    - The appearance of the screens
    - The way information is presented to the users.
    - The program's user-friendliness.
    - Manuals help systems, and/or other forms of written documentation.
  - Science
    - There's a science to programming which requires a lot of analyzing, experimenting, correcting, and redesigning.
    - Programmers must learn special languages like Java because computers do not understand English or other human languages.
- Checkpoint 1.2-1
  - Computers do such a wide variety of things because they can be programmed to do whatever their software tells them to do.
  - Programming languages have strict rules.

1.3 Computer Systems: Hardware devices and software

- Hardware - Physical components the computer's made of.
- Computer - A system of devices which usually consists of the following:
  - The central processing unit (CPU)
  - Main memory - RAM
  - Secondary storage devices - HDD, SSD, etc.
  - Input devices - Camera, keyboard, mouse, scanner, tablet, etc.
  - Output devices - Speakers, monitor, printer, etc.

- Control processing unit (CPU) - The component in the computer that executes programs. It fetches instructions, follows instructions, and produces some resulting data. Internally, the CPU consists of two parts: an arithmetic and logic unit and a control unit.
  - Control unit
    - The part of the CPU that coordinates all of the computer's operations. It is responsible for determining where to get the next instruction and regulating the other components of the computer with control signals.
  - Arithmetic and logic unit
    - It is designed to perform mathematical operations.
  - Instruction (input) - \> [ALU \< - - \> Control unit] - \> Result (output)
  - A program is a sequence of instructions stored in the computer's memory. When a computer is running a program, the CPU is engaged in a process known formally as the fetch/decode/execute cycle.
    - Fetch - Fetch instructions from main memory, the next instruction in the sequence of program instructions.
    - Decode - The instruction is encoded in the form of a number. The control unit decodes the instruction and generates an electronic signal.
    - Execute - The electronic signal is routed to the appropriate component of the computer (such as the ALU, a disk drive, or some other device). The signal causes the component to perform an operation.
- Checkpoint 1.3-1
  - Internally the CPU consists of the control unit and arithmetic logic unit.
- Checkpoint 1.3-2
  - Decode
  - Execute
  - Fetch
- Main memory
  - RAM - Computers main memory which holds information. It is a short-term, volatile form of memory, used for temporary data storage.
  - Memory - Divided into sections holding equal data.
  - Section - 8 switches, each switch can be on or off. 1 for on and 0 for off.
  - Bit or binary digit - This is how we refer to each switch. Its store location in computer memory that can be set to 1 or 0.
  - Byte - Each section of memory with 8 bits.
  - Address - The unique number assigned to each byte.

Checkpoint 1.3-3

  - Computers store information using switches that are turned on to 1 or off to 0.

Checkpoint 1.3-4

  - A byte is the amount of memory that is enough to store a letter of the alphabet or a small number.
- More definitions 1.3
  - Memory address - a unique number assigned to each section of memory.
  - Secondary storage - a type of memory that can hold data for longer periods of time even when there's no power to the computer (i.e. HDD, SSD, etc).
  - Disk drives - Store data by magnetically encoding it onto a spinning circular disk.
  - Solid state drive - Store data in solid state memory with no moving parts and operate faster than traditional disks.
  - External drives - Storage devices that can be connected or attached to a computer's communication ports.
  - Universal serial bus (USB) drives - Small devices that can plug into the computer's universal serial bus port and appear to the system as a disk drive. They store data in flash memory. They're inexpensive, reliable, and portable.
  - Flash memory - Special type of memory that stores data in integrated circuits and can be used as secondary storage.
  - Input devices - The device that collects data and sends it to a computer is an input device (i.e. keyboard, mouse, scanner, microphone, and digital camera). Disk and USB drives can also be considered as input devices.
  - Output devices - A device that takes any data the computer needs to send out to the world, formats it and then presents it. Common output devices are monitors and printers. Disk and USB devices can also be considered output devices as CPU sends data to be saved.
- Checkpoint 1.3-6
  - Main memory or RAM is used for temporary storage.
- Checkpoint 1.3-7
  - CPU, Main memory, secondary storage, input, and output.
- Software
  - 2 types of software: Operating systems and application software.
  - Operating system - A set of programs that manage computer hardware devices and control their processes.
    - Multitasking - Capable of running multiple programs at once.
    - Timesharing - A technique that allows multitasking systems to divide the allocation of hardware resources and the attention of the CPU among all executing programs.
  - Application Software - Programs that make the computer useful to the user. These include word processors, spreadsheets, presentation software, email clients, web browsers, video editing software, graphic design software, etc.

1.4 Programming languages

Definitions

- Computer program - A set of instructions that enable the computer
- Algorithm - A set of well-defined steps for performing a task or solving a problem.
- Machine language - The language understood directly by the computer's CPU. Machine language instructions are written in binary code.
- Programming language - A language that humans can use to write programs that are translated into machine code.

History of java

- Byte code - An intermediary language that is similar to machine code, but is executed by an interpreter. This interpreter is the Java virtual machine.
- Hotjava - A browser that was able to download and run small Java programs known as applets.
- Applets - A small Java program that's downloaded and executed in a web browser.
- Compiler - A program that translates source code into executable code.
- Machine language - It cannot be used to write a program that runs on every machine as it needs to be modified for every machine's CPU.

1.5 What is a program made of?

Language elements

Common elements of a programming language.

- Keywords - Have special meaning in a programming language used for intended purpose only. Keywords are also known as reserved words.
- Operators - Operators are symbols or words that perform operations on one or more operands. An operand is usually an item of data, such as a number.
- Punctuation - Most programming languages require the use of punctuation characters. These characters sense specific purposes such as marking the beginning or ending of a statement or separating items in a list.
- Programmer-defined names - Unlike keywords which are part of the programming language these are words or names that are defined by the programmer. They are used to identify storage locations in memory and parts of the program that are created by the programmer. They are also referred to as identifiers.
- Syntax - These are rules that must be followed when writing a program. Syntax dictates how keywords and operators may be used and where punctuation symbols must appear.

Keywords (reserved words)

- abstract
- assert
- boolean
- break
- byte
- case
- catch
- char
- class
- const
- continue
- default
- do
- double
- else
- enum
- extends
- false
- final
- finally
- float
- for
- goto
- if
- implements
- import
- instanceof
- interface
- int
- long
- native
- new
- null
- public
- private
- protected
- package
- return
- short
- static
- strictfp
- super
- switch
- synchronized
- this
- throw
- throws
- transient
- true
- try
- void
- volatile
- while

New restricted words (Java 9)

- exports
- open
- opens
- to
- uses
- with
- transitive
- module
- requires
- provides


Treated as keywords only within module descriptor.

IDE - Text editor, compiler, debugger, and other utilities integrated into a package with a single set of menus.

1.6 The Programming Process

1. Clearly define what the program is to do.
2. Visualize the code running on the computer.
3. Use design tools to create a model for the program.
4. Check the model designed for errors.
5. Enter the code and compile it.
6. Correct any errors found during compilation. Repeat steps 5 and 6 as many times as needed.
7. Run the program with test data for input.
8. Correct any runtime errors. Repeat steps 5-8 as many times as necessary.

Programming flow:

- Design
- Create
- Debug
- Test


Pseudocode - Across between human language and programming language.

i.e.

Display "You may hours did you work"

Input hours

Display "How much did you get paid per hour?"

Input rate

Store the value of hours times rate in the pay variable

Display "The value in the pay variable"


Checkpoint 1.6-3

balance = startingbalance + deposit - withdrawals

interest = (balance \* interestrate)

currentbalance = startingbalance + interest



Checkpoint 1.6-4

A runtime error occurs while the program is expecting.



Checkpoint 1.6-5

The purpose of testing a program with sample data on input is to determine runtime errors.



Definitions

- Procedural - A set of programming statements that together perform a specific task.

- Object-oriented programming - A programming paradigm in which the programmer creates objects that store data and perform operations.

- Fields/attributes - A piece of data stored in an object.

- Methods - A collection of statements that perform a task; a procedure or behavior that an object performs.

- Encapsulation - Combining code and data into a single object.

- Data hiding - An objects ability to hide its data from code outside the single object.

- Indirect access data - Code outside the object can access an object's methods can be used to interact with code outside the object. This prevents accidental corruption and code/cada separation issues.



Note: Checkpoint 1.7-1

- Procedural - A set of steps in which variables commonly share data items with other sets of steps.

- Software entities or units that contain data and the methods that operate on that data.



Chapter 1 Review Questions and Exercises.

1. B
2. D
3. A
4. C
5. B
6. C
7. D
8. A
9. B
10. A
11. C
12. B
13. D



Predict the result

1. 1+0 → 1 + 5 → 0 + 5 = y → Display 5



Short Answer

1. Main memory also known as RAM is a temporary form of memory where a program is stored so that it can be directly accessed by the CPU whereas secondary memory is a permanent form of memory used to store operating systems and other types of data.
2. RAM is a volatile for of memory.
3. OSS is software that controls hardware components and directs hardware resources while application software is software that consumers find helpful to perform tasks.
4. A computer's CPU directly executes machine code instructions.
5. High-level languages more closely resemble human language which is easier to read, analyze, modify, etc.
6. A source file is a file that contains source code.
7. A syntax error is an error that violates a programming language's rules whereas a logical error is an error in logical reasoning within one's code.
8. An algorithm is a set of steps or instructions on how to perform an operation or task.
9. A compiler is a program that turns source code into an executable form.
10. A computer must have a Java virtual machine for it to execute Java programs.
11. Machine language code consists of binary numbers (1's and 0's) which the CPU can directly execute whereas bytecode is a machine-code-like intermediary that the Java virtual machine converts from byte code into machine code which the CPU can then run.
12. Bytecode makes Java a portable language because it can be fed to the Java virtual machine which can convert it to machine code that can be run by essentially any CPU.
13. Object-oriented programing.
14. The purpose of data hiding is to prevent accidental corruption ad solve the code/data separation problems that are found in procedural languages.
15. Methods form an interface through which outside code can interact with an object's methods to access the object's data.
16. An integrated development environment.
17. No, it will continue to return an error which needs to be fixed, and then the program will need to be recompiled t be successfully translated.
18. Java compiler translates java source code into bytecode.
19. Javac LabAssignment.java
20. Byte code file, byte code, java LabAssignment



Algorithm Workbench


Problem 1

Display 'What is your maximum amount of credit?"

Input maxcredit

Display "What is the amount of credit that you used?"

Input creditused

Store result of maxcredit - creditused in availcredit

Display "Your available credit is $ " + availcredit



Problem 2

Display "What is the retail price of the item being purchased?"

Input retailprice

Display "What is the sales tax rate?"

Input salestaxrate

Store result of retailprice x salestaxrate in salestax

Store result of retailprice + salestax in totalsale

Display "The sales tax for the purchase is $ " + salestax

Display "The total of the sale is $ " + totalsale



Problem 3

Display "What is the starting balance? (ex. 500.25)"

Input startingbalance

Display "What is the total dollar amount of deposits? (ex. 50.25)"

Input totaldeposits

Display "What is the total dollar amount of the withdrawals? (ex. 550.50)"

Input totalwithdrawals

Display "What is the monthly interest rate? (ex. 25) "

Input monthlyinterestrate

initialbalance = startingbalance + deposits - withdrawals

monthlyinterestrate = monthlyinterestrate / 100.0

interest = initialbalance \* monthlyinterestrate

currentbalance = initialbalance + interest

Display "Your current balance is $ " + currentbalance