package Observer.ob1;

public class Main {

    public static void main(String[] args) {
        Subject boss = new Boss();
        StockObserver stockObserver = new StockObserver("给34",boss);
        StockObserver stockObserver2 = new StockObserver("精钢葫芦王",boss);

        boss.attach(stockObserver);
        boss.attach(stockObserver2);

        boss.detach(stockObserver);
        boss.Notify();
    }
}
