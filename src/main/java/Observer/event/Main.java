package Observer.event;

import Observer.ob1.Observer;

public class Main {

    public static void main(String[] args) {
        Observer.event.Observer.event.Subject boss = new Observer.event.Observer.event.Boss();
        Observer.event.Observer.event.StockObserver stockObserver = new Observer.event.Observer.event.StockObserver("给34",boss);
        Observer.event.Observer.event.StockObserver stockObserver2 = new Observer.event.Observer.event.StockObserver("精钢葫芦王",boss);

        boss.attach(stockObserver);
        boss.attach(stockObserver2);

        boss.detach(stockObserver);
        boss.Notify();
    }
}
