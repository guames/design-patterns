# All Design Patterns 

## Behavioral Patterns
#### Command
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
#### Interpreter
###### Call:
patterns.behavioral.interpreter.RunInterpreter.main(args);
###### When you use this pattern:
#### Iterator
###### Call:
patterns.behavioral.iterator.RunIterator.main(args);
###### When you use this pattern:
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
#### Strategy
###### Call:
patterns.behavioral.strategy.RunStrategy.main(args);
###### When you use this pattern:
#### Templatemethod
###### Call:
patterns.behavioral.templatemethod.RunTemplateMethod.main(args);
###### When you use this pattern:
#### Visitor
###### Call:
patterns.behavioral.visitor.RunVisitor.main(args);
###### When you use this pattern:

## Creational Patterns 
#### Abstractfactory
###### Call:
patterns.creational.abstractfactory.RunAbstractFactory.main(args);
###### When you use this pattern:
#### Builder
###### Call:
patterns.creational.builder.RunBuilder.main(args);
###### When you use this pattern:
#### Factorymethod
###### Call:
patterns.creational.factorymethod.RunFactoryMethod.main(args);
###### When you use this pattern:
#### Prototype
###### Call:
patterns.creational.prototype.RunPrototype.main(args);
###### When you use this pattern:
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
#### Proxy
###### Call:
patterns.structural.proxy.RunProxy.main(args);
###### When you use this pattern:
* A remote proxy provides a local representative for an object in a different address space.
* A virtual proxy creates expensive objects on demand.
* A protection proxy controls access to the original object. Protection proxies are useful when objects should have different access rights.


## Reference from Book "Java Design Patterns" by Rohit Joshi
