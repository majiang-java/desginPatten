package proxy;

public class RealSubject implements Subject {
    public void request() {
        System.out.println("真是的请求");
    }
}
