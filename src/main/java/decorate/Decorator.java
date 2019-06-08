package decorate;

public abstract class Decorator implements Component {

    protected  Component component;

    public void setComponent(Component component){
        this.component = component;
    }


    public void Operation() {
        if(component !=null) {
            component.Operation();
        }
    }
}
