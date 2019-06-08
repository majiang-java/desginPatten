package Observer.event;

public abstract class Observer {
    protected String name;
    protected Subject sercretary;

    public Observer(String name, Subject sub) {
        this.name = name;
        this.sercretary = sub;
    }

    public abstract void update();
}
