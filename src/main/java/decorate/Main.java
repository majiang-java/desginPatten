package decorate;

public class Main {

    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ContrateDecoratorA contrateDecoratorA = new ContrateDecoratorA();
        ContrateDecoratorB contrateDecoratorB = new ContrateDecoratorB();

        contrateDecoratorA.setComponent(concreteComponent);
        contrateDecoratorB.setComponent(contrateDecoratorA);

        contrateDecoratorB.Operation();

    }
}
