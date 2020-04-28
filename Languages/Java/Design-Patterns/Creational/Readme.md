# Creational Patterns

This deal with creating instances of classes

## Different Patterns :
1. Singleton
2. Builder
3. Prototype
4. Factory
5. AbstractFactory 


## Singletons
### Properties
1. Only one instance is created
2. Guarantees control of the resource. The implementation of the singleton governs the
3. Lazily loaded 

### Design
1. Class is responsible for it's lfecycle
2. Static in nature
3. Needs to be thread safe. So no static classes
4. Served as a private isntance of the class
5. The constructor for such class is private
6. No parameters for the constructor. Else its a factory pattern

Examples : Logger, Runtime, Sprin Beans, Grpahics Mangers, etc

**Code Example : Runtime Env**
```java
Runtime singleton = Runtime.getRuntime();
singleton.gc();
System.out.println(singleton);

Runtime another = Runtime.getRuntime();
System.out.println(another);

// singleton == another
```

## Notes
A lazily loaded singleton helps avoid memory hogging as we otherwise try to create all the singleton instances at app startup. This allows us to first to first check up at the singleton, use it if its instantaited otherwise first create it.

To make the singleton pattern thread safe we make the singleton a **volatile** variable; so that it remains the same throughout the changes made in JVM.
This is also made to avoid use of reflection on the code.


To ensure thread safety wwe can implement double checked locking mechanism and synchronised check.

It is not advisable to make the lazy loaded singleton accessor to be syncrhonised completely, as it would make the entire class to be slow when a synchronised call is made.

Instead we will maintain a single synchronous check on the instance when and only when it is created. This would help manage a single instance is created even when two threads are targeting the instantiation.
