package chainofres;

public abstract class Manager {
    protected String name;
    protected Manager superior;

    public Manager(String name){
        this.name = name;
    }

    public void setSuperior(Manager manager){
        this.superior = manager;
    }

    abstract public void requestApplication(Request request);
}
