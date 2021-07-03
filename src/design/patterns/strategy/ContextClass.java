package design.patterns.strategy;

//The idea of Strategy design pattern is to make possible and easy to add different strategies(algorithms, behaviors).To do that
//we need some class I called it "ContextClass" which keeps an Interface of strategies.Then we can have concrete interface implementations
//(strategies) which we pass to our "ClassConsumingStrategies" by extending ContextClass and invoking its constructor with
// concrete "StrategyInterfaceImplA". May be it is a bit confusing, but when you see some examples it will be more clearer.
public class ContextClass {
    private StrategyInterface strategyInterface;

    public ContextClass(StrategyInterface strategyInterface) {
        this.strategyInterface = strategyInterface;
    }

    public StrategyInterface getInterfaceC() {
        return strategyInterface;
    }

}
