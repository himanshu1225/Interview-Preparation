Static methods in java:

Before Java 8 static methods were not allowed inside interfaces.

Why were static methods introduced in java 8 ?

-> Sometimes we want a method that logically belong to interface itself and do not want its child class to override it. 
-> ex: helper method or validation method.
-> This problem Static methods in interfaces solves. 


Static Method cannot be ovverriden.

-> You can create same method name in child classes you will not see any error but that is not overriden that is just another method for that class. (METHOD HIDING)

Multiple Static Methods in Interfaces:

-> We can have multiple static methods in interface.
-> One static method can call other static method.
-> You cannot call default method from static method in interface.

How to invoke static method?
Through interface only.