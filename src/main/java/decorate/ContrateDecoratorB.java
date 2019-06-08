package decorate;

public class ContrateDecoratorB extends Decorator {

    public void Operation() {
        super.Operation();
        addBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    private void addBehavior(){

    }
}
