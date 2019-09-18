# All Design Patterns 

## Behavioral Patterns
#### Chain Of Responsability
###### Call:
patterns.behavioral.chainresponsability.RunChainResponsability.main(args);
###### When you use this pattern:
* More than one objects may handle a request, and the handler isn’t known a priori. The handler should be ascertained automat-ically.
* You want to issue a request to one of several objects without specifying the receiver explicitly.
* The set of objects that can handle a request should be specified dynamically.
#### Command
###### Call:
patterns.behavioral.command.RunCommand.main(args);
###### When you use this pattern:
* Parameterize objects by an action to perform.
* Specify, queue, and execute requests at different times. A Command object can have a lifetime independent of the original
request. If the receiver of a request can be represented in an address space-independent way, then you can transfer a command object for the request to a different process and fulfill the request there.
* Support undo. The Command’s Execute operation can store state for reversing its effects in the command itself. The
Command interface must have an added Un-execute operation that reverses the effects of a previous call to Execute. Executed commands are stored in a history list. Unlimited-level undo and redo is achieved by traversing this list backwards and forwards calling Un-execute and Execute, respectively.
* Support logging changes so that they can be reapplied in case of a system crash. By augmenting the Command interface
with load and store operations, you can keep a persistent log of changes. Recovering from a crash involves reloading logged
commands from disk and re-executing them with the Execute operation.
* Structure a system around high-level operations built on primitives operations. Such a structure is common in information
systems that support transactions. A transaction encapsulates a set of changes to data. The Command pattern offers a way to
model transactions. Commands have a common interface, letting you invoke all transactions the same way. The pattern also
makes it easy to extend the system with new transactions.
#### Interpreter
###### Call:
patterns.behavioral.interpreter.RunInterpreter.main(args);
###### When you use this pattern:
* The grammar is simple. For complex grammars, the class hierarchy for the grammar becomes large and unmanageable. Tools
such as parser generators are a better alternative in such cases. They can interpret expressions without building abstract syntax trees, which can save space and possibly time.
* Efficiency is not a critical concern. The most efficient interpreters are usually not implemented by interpreting parse trees directly but by first translating them into another form. For example, regular expressions are often transformed into state machines. But even then, the translator can be implemented by the Interpreter pattern, so the pattern is still applicable.
#### Iterator
###### Call:
patterns.behavioral.iterator.RunIterator.main(args);
###### When you use this pattern:
* To access an aggregate object’s contents without exposing its internal representation.
* To support multiple traversals of aggregate objects.
* To provide a uniform interface for traversing different aggregate structures (that is, to support polymorphic iteration).
#### Mediator
###### Call:
patterns.behavioral.mediator.RunMediator.main(args);
###### When you use this pattern:
* A set of objects communicate in well-defined but complex ways. The resulting interdependencies are unstructured and difficult to understand.
* Reusing an object is difficult because it refers to and communicates with many other objects.
* A behavior that’s distributed between several classes should be customizable without a lot of sub-classing.
#### Memento
###### Call:
patterns.behavioral.memento.RunMemento.main(args);
###### When you use this pattern:
* A snapshot of (some portion of) an object’s state must be saved so that it can be restored to that state later, and
* A direct interface to obtaining the state would expose implementation details and break the object’s encapsulation.
#### Observer
###### Call:
patterns.behavioral.observer.RunObserver.main(args);
###### When you use this pattern:
* When an abstraction has two aspects, one dependent on the other. Encapsulating these aspects in separate objects lets you vary and reuse them independently.
* When a change to one object requires changing others, and you don’t know how many objects need to be changed.
* When an object should be able to notify other objects without making assumptions about who these objects are. In other words, you don’t want these objects tightly coupled.
#### State
###### Call:
patterns.behavioral.state.RunState.main(args);
###### When you use this pattern:
* An object’s behavior depends on its state, and it must change its behavior at run-time depending on that state.
* Operations have large, multipart conditional statements that depend on the object’s state. This state is usually represented by one or more enumerated constants. Often, several operations will contain this same conditional structure. The State pattern puts each branch of the conditional in a separate class. This lets you treat the object’s state as an object in its own right that can vary independently from other objects.
#### Strategy
###### Call:
patterns.behavioral.strategy.RunStrategy.main(args);
###### When you use this pattern:
* Many related classes differ only in their behavior. Strategies provide a way to configure a class with one of many behaviors.
* You need different variants of an algorithm. For example, you might define algorithms reflecting different space/time trade-offs. Strategies can be used when these variants are implemented as a class hierarchy of algorithms.
* An algorithm uses data that clients shouldn’t know about. Use the Strategy pattern to avoid exposing complex, algorithm-
specific data structures.
* A class defines many behaviors, and these appear as multiple conditional statements in its operations. Instead of many condi-tionals, move related conditional branches into their own Strategy class.
#### Templatemethod
###### Call:
patterns.behavioral.templatemethod.RunTemplateMethod.main(args);
###### When you use this pattern:
* To implement the invariant parts of an algorithm once and leave it up to subclasses to implement the behavior that can vary.
* When common behavior among subclasses should be factored and localized in a common class to avoid code duplication. You
first identify the differences in the existing code and then separate the differences into new operations. Finally, you replace the differing code with a template method that calls one of these new operations.
* To control subclasses extensions. You can define a template method that calls "hook" operations (see Consequences) at specific points, thereby permitting extensions only at those points.
#### Visitor
###### Call:
patterns.behavioral.visitor.RunVisitor.main(args);
###### When you use this pattern:
* An object structure contains many classes of objects with differing interfaces, and you want to perform operations on these objects that depend on their concrete classes.
* Many distinct and unrelated operations need to be performed on objects in an object structure, and you want to avoid "polluting" their classes with these operations. Visitor lets you keep related operations together by defining them in one class. When the object structure is shared by many applications, use Visitor to put operations in just those applications that need them.
* The classes defining the object structure rarely change, but you often want to define new operations over the structure. Changing the object structure classes requires redefining the interface to all visitors, which is potentially costly. If the object structure classes change often, then it’s probably better to define the operations in those classes.

## Creational Patterns 
#### Abstractfactory
###### Call:
patterns.creational.abstractfactory.RunAbstractFactory.main(args);
###### When you use this pattern:
* A system should be independent of how its products are created, composed, and represented.
* A system should be configured with one of multiple families of products.
* A family of related product objects is designed to be used together, and you need to enforce this constraint.
* You want to provide a class library of products, and you want to reveal just their interfaces, not their implementations.
#### Builder
###### Call:
patterns.creational.builder.RunBuilder.main(args);
###### When you use this pattern:
* The algorithm for creating a complex object should be independent of the parts that make up the object and how they’re
assembled.
* The construction process must allow different representations for the object that’s constructed.
#### Factorymethod
###### Call:
patterns.creational.factorymethod.RunFactoryMethod.main(args);
###### When you use this pattern:
* A class can’t anticipate the class of objects it must create.
* A class wants its subclasses to specify the objects it creates.
* Classes delegate responsibility to one of several helper subclasses, and you want to localize the knowledge of which helper subclass is the delegate.
#### Prototype
###### Call:
patterns.creational.prototype.RunPrototype.main(args);
###### When you use this pattern:
* When the classes to instantiate are specified at run-time, for example, by dynamic loading; or
* To avoid building a class hierarchy of factories that parallels the class hierarchy of products; or
* When instances of a class can have one of only a few different combinations of state. It may be more convenient to install a corresponding number of prototypes and clone them rather than instantiating the class manually, each time with the appropriate state.
#### Singleton
###### Call:
patterns.creational.singleton.RunSingleton.main(args);
###### When you use this pattern:
* There must be exactly one instance of a class, and it must be accessible to clients from a well-known access point.
* When the sole instance should be extensible by sub-classing, and clients should be able to use an extended instance without modifying their code.

## Structural Patterns
#### Adapter
###### Call:
patterns.structural.adapter.RunAdapter.main(args);
###### When you use this pattern:
* There is an existing class, and its interface does not match the one you need.
* You want to create a reusable class that cooperates with unrelated or unforeseen classes, that is, classes that don’t necessarily have compatible interfaces.
* There are several existing subclasses to be use, but it’s impractical to adapt their interface by subclassing every one. An object adapter can adapt the interface of its parent class.
#### Bridge
###### Call:
patterns.structural.bridge.RunBridge.main(args);
###### When you use this pattern:
* You want to avoid a permanent binding between an abstraction and its implementation. This might be the case, for example,
when the implementation must be selected or switched at run-time.
* Both the abstractions and their implementations should be extensible by sub-classing. In this case, the Bridge pattern lets you combine the different abstractions and implementations and extend them independently.
* Changes in the implementation of an abstraction should have no impact on clients; that is, their code should not have to be recompiled.
* You want to share an implementation among multiple objects (perhaps using reference counting), and this fact should be hidden from the client.
#### Composite
###### Call:
patterns.structural.composite.RunComposite.main(args);
###### When you use this pattern:
* When you want to represent part-whole hierarchies of objects.
* When you want clients to be able to ignore the difference between compositions of objects and individual objects. Clients will treat all objects in the composite structure uniformly.
#### Decorator
###### Call:
patterns.structural.decorator.RunDecorator.main(args);
###### When you use this pattern:
* To add responsibilities to individual objects dynamically and transparently, that is, without affecting other objects.
* For responsibilities that can be withdrawn.
* When extension by sub-classing is impractical. Sometimes a large number of independent extensions are possible and would
produce an explosion of subclasses to support every combination. Or a class definition may be hidden or otherwise unavailable for sub-classing.
#### Facade
###### Call:
patterns.structural.facade.RunFacade.main(args);
###### When you use this pattern:
* You want to provide a simple interface to a complex subsystem. Subsystems often get more complex as they evolve. Most patterns, when applied, result in more and smaller classes. This makes the subsystem more reusable and easier to customize, but it also becomes harder to use for clients that don’t need to customize it. A facade can provide a simple default view of
the subsystem that is good enough for most clients. Only clients needing more customizability will need to look beyond the
facade.
* There are many dependencies between clients and the implementation classes of an abstraction. Introduce a facade to decouple the subsystem from clients and other subsystems, thereby promoting subsystem independence and portability.
* You can layer your subsystems. Use a facade to define an entry point to each subsystem level. If subsystems are dependent,
then you can simplify the dependencies between them by making them communicate with each other solely through their facades.
#### Flyweight
###### Call:
patterns.structural.flyweight.RunFlyweight.main(args);
###### When you use this pattern:
* An application uses a large number of objects.
* Storage costs are high because of the sheer quantity of objects.
* Most object state can be made extrinsic.
* Many groups of objects may be replaced by relatively few shared objects once extrinsic state is removed.
* The application doesn’t depend on object identity. Since flyweight objects may be shared, identity tests will return true for conceptually distinct objects.
#### Proxy
###### Call:
patterns.structural.proxy.RunProxy.main(args);
###### When you use this pattern:
* A remote proxy provides a local representative for an object in a different address space.
* A virtual proxy creates expensive objects on demand.
* A protection proxy controls access to the original object. Protection proxies are useful when objects should have different access rights.


## Reference from Book "Java Design Patterns" by Rohit Joshi
