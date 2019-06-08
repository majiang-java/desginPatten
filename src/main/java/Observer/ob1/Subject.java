package Observer.ob1;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void Notify();
}
