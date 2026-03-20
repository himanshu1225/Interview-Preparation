JAVA EXECUTION FLOW: 

Test.java ---------------> Test.class ---------------> Machine Code
                     (Platform Independent)        (Platform Dependent)


1. Test.java
------------
- This is the source file where we write Java code.
- It is human-readable.


2. javac Compiler
-----------------
- It compiles the .java file into bytecode (.class file).
- Converts source code into bytecode.
- Bytecode is platform independent.
- Any system with JVM can run it.
- .class file is not human-readable.


3. JVM (Java Virtual Machine)
----------------------------
- JVM executes the bytecode.
- It acts as an interpreter.
- Converts bytecode into machine code.
- Machine code is understood by the computer.
- JVM is platform dependent (different JVM for different OS).


4. Interpreter
--------------
- Reads bytecode line by line.
- Steps involved:
  1. Parses the bytecode from top to bottom.
  2. Groups instructions in execution order.
  3. Executes instructions line by line.
- Two parsing stages:
  1. Grouping instructions
  2. Executing instructions
- Slower because execution happens line by line.


5. JIT (Just-In-Time Compiler)
------------------------------
BYTE CODE -----------------------------> MACHINE CODE

- Present inside JVM.
- Improves performance.
- Identifies frequently used code blocks.
- Compiles those blocks once into machine code.
- Reuses compiled code instead of interpreting again.
- Reduces repeated interpretation → faster execution.