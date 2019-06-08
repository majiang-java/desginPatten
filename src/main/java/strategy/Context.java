package strategy;

public class Context {

    Strategy strategy;
    public Context(Strategy strategy){
        //这里可以自由转化为工厂方法
        this.strategy = strategy;
    }

    public void ContextInterface() {
        strategy.ArigurithemInterface();
    }
}
