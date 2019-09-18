package patterns;

/**
 * Class to run all patterns.
 */
public class RunAllPaterns {

    /**
     * All Behavioral patterns.
     * @param args
     */
    private static void behavioralPatterns(String[] args){
        patterns.behavioral.chainresponsability.RunChainResponsability.main(args);
        patterns.behavioral.command.RunCommand.main(args);
        patterns.behavioral.interpreter.RunInterpreter.main(args);
        patterns.behavioral.iterator.RunIterator.main(args);
        patterns.behavioral.mediator.RunMediator.main(args);
        patterns.behavioral.memento.RunMemento.main(args);
        patterns.behavioral.observer.RunObserver.main(args);
        patterns.behavioral.state.RunState.main(args);
        patterns.behavioral.strategy.RunStrategy.main(args);
        patterns.behavioral.templatemethod.RunTemplateMethod.main(args);
        patterns.behavioral.visitor.RunVisitor.main(args);
    }

    /**
     * All Creational patterns.
     * @param args
     */
    private static void creationalPatterns(String[] args){
        patterns.creational.abstractfactory.RunAbstractFactory.main(args);
        patterns.creational.builder.RunBuilder.main(args);
        patterns.creational.factorymethod.RunFactoryMethod.main(args);
        patterns.creational.prototype.RunPrototype.main(args);
        patterns.creational.singleton.RunSingleton.main(args);
    }

    /**
     * All Structural patterns.
     * @param args
     */
    private static void structuralPatterns(String[] args){
        patterns.structural.adapter.RunAdapter.main(args);
        patterns.structural.bridge.RunBridge.main(args);
        patterns.structural.composite.RunComposite.main(args);
        patterns.structural.decorator.RunDecorator.main(args);
        patterns.structural.facade.RunFacade.main(args);
        patterns.structural.flyweight.RunFlyweight.main(args);
        patterns.structural.proxy.RunProxy.main(args);
    }

    public static void main(String[] args) {
        behavioralPatterns(args);
        creationalPatterns(args);
        structuralPatterns(args);
    }

}
