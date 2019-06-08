package Observer.event;


import java.util.ArrayList;
import java.util.List;

public class Boss implements Subject {
    private List<Observer> observers = new ArrayList();

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    private String action;

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void Notify(){
        for(Observer o : observers){
            o.update();
        }
    }
}
