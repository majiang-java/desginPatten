package decorate;

public class ContrateDecoratorA extends Decorator {

    private String addedState;
    public void Operation() {
        super.Operation();
        addedState = "New Status";
        System.out.println("具体装饰对象A的操作");
    }

}
