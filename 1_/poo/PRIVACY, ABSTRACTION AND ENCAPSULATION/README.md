# [Abstraction](https://www.javatpoint.com/abstract-class-in-java#:~:text=in%20Java%20first.-,Abstraction%20in%20Java,only%20functionality%20to%20the%20user.&text=Another%20way%2C%20it%20shows%20only,text%20and%20send%20the%20message.)

Abstraction is a process of hiding the implementation details and showing only functionality to the user.

Another way, it shows only essential things to the user and hides the internal details, for example, sending SMS where you type the text and send the message. You don't know the internal processing about the message delivery.

Abstraction lets you focus on what the object does instead of how it does it.

Ways to achieve Abstraction
There are two ways to achieve abstraction in java

- Abstract class (0 to 100%)
- Interface (100%)

[image](https://static.javatpoint.com/images/abstract-class-in-java.jpg)

## [Differences between Abstract Class and Interface](https://www.guru99.com/interface-vs-abstract-class-java.html#:~:text=An%20abstract%20class%20permits%20you,class%20can%20implement%20multiple%20interfaces.)

An abstract class permits you to make functionality that subclasses can implement or override whereas an interface only permits you to state functionality but not to implement it. A class can extend only one abstract class while a class can implement multiple interfaces.

| Parameters | Interface | Abstract class |
|--|--|--|
| **Speed**| Slow | Fast |
| **Multiple Inheritances** | Implement several Interfaces | Only one abstract class |
| **Structure** | Abstract methods | Abstract & concrete methods |
| **When to use** | Future enhancement | To avoid independence |
| **Inheritance/ Implementation** | A Class can implement multiple interfaces | The class can inherit only one Abstract Class |
| **Default Implementation** | While adding new stuff to the interface, it is a nightmare to find all the implementors and implement newly defined stuff. | In case of Abstract Class, you can take advantage of the default implementation. |
| **Access Modifiers** | The interface does not have access modifiers. Everything defined inside the interface is assumed public modifier. | Abstract Class can have an access modifier. |
| **When to use** | It is better to use interface when various implementations share only method signature. Polymorphic hierarchy of value types. | It should be used when various implementations of the same kind share a common behavior. |
| **Data fields** | the interface cannot contain data fields. | the class can have data fields. |
| **Multiple Inheritance Default** | A class may implement numerous interfaces. | A class inherits only one abstract class. |
| **Implementation** | An interface is abstract so that it can’t provide any code. | An abstract class can give complete, default code which should be overridden. |
| **Use of Access modifiers** | You cannot use access modifiers for the method, properties, etc. | You can use an abstract class which contains access modifiers. |
| **Usage** | Interfaces help to define the peripheral abilities of a class. | An abstract class defines the identity of a class. |
| **Defined fields** | No fields can be defined | An abstract class allows you to define both fields and constants |
| **Inheritance** | An interface can inherit multiple interfaces but cannot inherit a class. | An abstract class can inherit a class and multiple interfaces. |
| **Constructor or destructors** | An interface cannot declare constructors or destructors. | An abstract class can declare constructors and destructors. |
| **Limit of Extensions** | It can extend any number of interfaces. | It can extend only one class or one abstract class at a time. |
| **Abstract keyword** | In an abstract interface keyword, is optional for declaring a method as an abstract. | In an abstract class, the abstract keyword is compulsory for declaring a method as an abstract. |
| **Class type** | An interface can have only public abstract methods. | An abstract class has protected and public abstract methods. |


# [Privacy](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)

Access level modifiers determine whether other classes can use a particular field or invoke a particular method. There are two levels of access control:

- At the top level—public, or package-private (no explicit modifier).
- At the member level—public, private, protected, or package-private (no explicit modifier).

```
╔══════════════════════════════════════════════════╗
║                   Access levels                  ║
╠═════════════╦═══════╦═════════╦══════════╦═══════╣
║   Modifier  ║ Class ║ Package ║ Subclass ║ World ║
╠═════════════╬═══════╬═════════╬══════════╬═══════╣
║    public   ║   Y   ║    Y    ║     Y    ║   Y   ║
╠═════════════╬═══════╬═════════╬══════════╬═══════╣
║  protected  ║   Y   ║    Y    ║     Y    ║   N   ║
╠═════════════╬═══════╬═════════╬══════════╬═══════╣
║ no modifier ║   Y   ║    Y    ║     N    ║   N   ║
╠═════════════╬═══════╬═════════╬══════════╬═══════╣
║   private   ║   Y   ║    N    ║     N    ║   N   ║
╚═════════════╩═══════╩═════════╩══════════╩═══════╝
```

# [Encapsulation](https://www.javatpoint.com/encapsulation)

Once a variable/constant/method is declared as private, we are entering the field of encapsulation.
Encapsulation is a process of wrapping code and data together into a single unit. Once we define private methods/properties, we can define getters and setters to retrieve or change the encapsulated data.

Once a getter/setter is defined, we can use them inside other classes. So we can define exactly how the classes interact between them, allowing them, or not, to access certain data or behaviour that doesn't concern them.